class thread1 extends Thread{
    public void run(){
        for(int i= 0; i<3; i++){
        System.out.println("thread 1 is calling"+i);
        }
    }
}

class thread2 implements Runnable{
    public void run(){
        for(int i= 0; i<3; i++){
        System.out.println("thread 2 is calling"+i);
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        thread1 th1 = new thread1();
        thread2 th2 = new thread2();
        Thread th = new Thread(th2);
    
        th1.start();
        th.start(); 
    }
  
}
