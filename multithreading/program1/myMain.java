package multithreading;

class MyThread extends Thread{
    public void run()
    {
        for (int i=0; i<10; i++) {
            System.out.println("From MyThread : i = "+i);
        }
        System.out.println("Exit From MyThread");
    }
}

public class myMain {
    public static void main(String[] args) {
        new MyThread().start();
    }
}
