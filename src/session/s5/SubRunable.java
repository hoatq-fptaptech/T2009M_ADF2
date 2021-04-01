package session.s5;

public class SubRunable implements Runnable{
    int x;
    public SubRunable(int x){
        this.x = x;
    }
    @Override
    public void run() {
        for (int i=0;i<x;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}
