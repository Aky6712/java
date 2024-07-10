import java.io.*;

import javax.annotation.processing.Filer;

public class fileHandling {
    public static void main(String[] args) throws Exception{
        System.out.println("File Handling in Java");
        File file = new File("abcd.txt");
        file.createNewFile();
        System.out.println(file.exists());
        // FileWriter fw = new FileWriter(file);
        // BufferedWriter bw = new BufferedWriter(fw);
        // bw.write("Hi i am anuj");
        // bw.close();
        FileReader fr = new FileReader("abcd.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        br.close();
    }
}
