package session.s6;

public class Main {
    public static void main(String[] args){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println("RUN 1:  "+i);
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }
            }
        };
        Thread t1 = new Thread(r1);
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println("RUN 2:  "+i);
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }
            }
        };
        Thread t2 = new Thread(r2);
//        t1.setDaemon(true);

        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println("RUN 3:  "+i);
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }
            }
        };
        Thread t3 = new Thread(r3);

        Runnable r4 = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println("RUN 4:  "+i);
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }
            }
        };
        Thread t4 = new Thread(r4);

        t1.start();
        try {
            t1.join();// bắt các luồng phía sau phải chờ nó xong việc mới đc làm
        }catch (Exception e){}
        t2.start();
        try {
            t2.join();// bắt các luồng phía sau phải chờ nó xong việc mới đc làm
        }catch (Exception e){}
        t3.start();
        t4.start();

    }
}
