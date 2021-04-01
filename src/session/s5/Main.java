package session.s5;

public class Main {
    public static void main(String[] args){
//        SubThread s = new SubThread();
//        s.setName("Luong so 1");
//        s.start();
//        SubThread s2 = new SubThread();
//        s2.setName("Luong so 2");
//        s2.start();
//        for (int i=0;i<10;i++){
//            System.out.println("Main: "+i);
//            try {
//                Thread.sleep(1000);
//            }catch (Exception e){
//
//            }
//        }

//        CountdownTimer c = new CountdownTimer();
//        c.start();
        int x=20;

        SubRunable r = new SubRunable(x);
        Thread t = new Thread(r);
        t.start();

        // tao nhanh 1 thread moi ma ko muon tao class

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<x;i++){
                    System.out.println("Tạo nhanh:"+i);
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){

                    }
                }
            }
        };
        Thread t2= new Thread(r1);
        t2.start();
    }
}
