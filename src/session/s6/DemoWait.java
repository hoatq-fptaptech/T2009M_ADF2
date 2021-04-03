package session.s6;

public class DemoWait {
    public static void main(String[] args){
        Bank b = new Bank();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                b.rutTien(10000000);
            }
        };
        Thread t1 = new Thread(r1);
        Runnable r2= new Runnable() {
            @Override
            public void run() {
                b.napTien(1000000);
            }
        };
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r2);
        Thread t4 = new Thread(r2);
        Thread t5 = new Thread(r2);
        Thread t6 = new Thread(r2);
        Thread t7 = new Thread(r2);
        Thread t8 = new Thread(r2);
        Thread t9 = new Thread(r2);
        Thread t10 = new Thread(r2);
        Thread t11 = new Thread(r2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
    }
}
