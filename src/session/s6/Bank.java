package session.s6;

public class Bank {
    int balance=0;

    public synchronized void napTien(int amount){
        balance+= amount;
        System.out.println("Nap "+amount+" thanh cong.");
        try {
            notify();
        }catch (Exception e){}
    }

    public synchronized  void rutTien(int amount){
        boolean check = true;
        while (check){
            if(balance >= amount){
                balance-= amount;
                System.out.println("Rut "+amount+" thanh cong.");
                check = false;
            }else{
                System.out.println("Khong the rut vi tien khong du.");
                try {
                    wait();
                }catch (Exception e){}
            }
        }


    }
}
