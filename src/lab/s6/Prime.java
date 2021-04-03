package lab.s6;

public class Prime {
    int snt = 2;

    public synchronized void getNextPrime(){
        for(int i=snt+1;true;i++){
            // kiem tra i co phai snt hay ko
            if(checkPrime(i)){
                this.snt = i;
                System.out.println("SNT tiep theo:"+i);
                return;
            }
        }
    }

    public boolean checkPrime(int n){
        if(n<2) return false;
        if(n <=3) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
