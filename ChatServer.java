import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ChatServer {

    private static final int PORT = 9000;

    private static ArrayList<Socket> connectionList = new ArrayList<>();
    private static Map<String, String> users = new HashMap<>();

    public static void main(String[] args) throws Exception {
        ServerSocket listener = new ServerSocket(PORT);
        try {
            while (true) {
                new Handler(listener.accept()).start();
            }
        } finally {
            listener.close();
        }
    }

    private static class Handler extends Thread {
        private String name;
        private Socket socket;
        private BufferedReader in;
        private PrintWriter out;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                while (true) {
                    out.println("SUBMITNAME");
                    name = in.readLine();
                    if (name == null) {
                        return;
                    }
                    synchronized (users) {
                        if (!users.containsKey(name)) {
                            users.put(name, socket.getRemoteSocketAddress().toString());
                            break;
                        }
                    }
                }

                out.println("NAMEACCEPTED " + name);
                connectionList.add(socket);
                for (int i = 0; i < connectionList.size(); i++) {
                    Socket tempSocket = connectionList.get(i);
                    PrintWriter tempOut = new PrintWriter(tempSocket.getOutputStream(), true);
                    tempOut.println("MESSAGE " + name + " has joined the chat");
                }

                while (true) {
                    String input = in.readLine();
                    if (input == null) {
                        return;
                    }
                    if (input.startsWith("/quit")) {
                        return;
                    }
                    if (input.startsWith("/list")) {
                        StringBuilder userList = new StringBuilder();
                        for (Map.Entry<String, String> entry : users.entrySet()) {
                            userList.append(entry.getKey()).append("\n");
                        }
                        out.println("USERLIST " + userList);
                    } else {
                        for (int i = 0; i < connectionList.size(); i++) {
                            Socket tempSocket = connectionList.get(i);
                            PrintWriter tempOut = new PrintWriter(tempSocket.getOutputStream(), true);
                            tempOut.println("MESSAGE " + name + ": " + input);
                        }
                    }
                }
            
        

