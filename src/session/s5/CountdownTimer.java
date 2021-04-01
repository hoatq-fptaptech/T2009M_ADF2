package session.s5;

public class CountdownTimer extends Thread {
    @Override
    public void run(){
        int min = 10;
        int sec= 0;
        while (min>=0){
            while (sec>=0){
                System.out.println((min>=10?min:"0"+min)+":"+(sec>=10?sec:"0"+sec));
                sec--;
                try {
                    Thread.sleep(1000);
                }catch (Exception e){

                }
            }
            if(sec <0){
                sec=59;
            }
            min--;
        }
    }
}
