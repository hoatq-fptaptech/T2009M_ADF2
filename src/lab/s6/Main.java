package lab.s6;

public class Main {
    public static void main(String[] args){
        Prime p = new Prime();
        Runnable r =  new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
//                    synchronized (p){
                        p.getNextPrime();
//                    }

                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t1.start();
        t2.start();
        t3.start();
    }
}
