class A extends Thread{
    public void run() {
        for (int i = 1; i < 6; i++) {
            if(i==2) Thread.yield();
            System.out.println("\t From Thread A : i = "+i);
        }
        System.out.println("Exit From A");
    }
}

class B extends Thread{
    public void run(){
        for(int j=1; j<6; j++)
        {
            System.out.println("\t From Thread B : j = "+j);
            if(j==3) break;
        }
        System.out.println("Exit From B");
    }
}

class C extends Thread{
    public void run()
    {
        for(int k=1; k<6; k++)
        {
            System.out.println("\t From Thread C : k = "+k);
            if(k==1)
            try {
                sleep(1000);
            } catch (Exception e) {
            }
        }
        System.out.println("Exit From Thread C");
    }
}

public class threadMethod {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        System.out.println("Start Thread A : ");
        threadA.start();

        System.out.println("Start Thread B : ");
        threadB.start();

        System.out.println("Start Thread C : ");
        threadC.start();

        System.out.println("Exit From Main Thread");
    }
}
