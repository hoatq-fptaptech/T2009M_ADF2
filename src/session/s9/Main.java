package session.s9;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args){
//        ResourceBundle en = ResourceBundle.getBundle("session.s9.Messages", Locale.US);
//        System.out.println(en.getString("hello"));
//        ResourceBundle vi = ResourceBundle.getBundle("session.s9.Messages", new Locale("vi","VN"));
//        System.out.println(vi.getString("hello"));
        // cach lam thuc te
        Locale vi_vn = new Locale("vi","VN");
        Locale.setDefault(vi_vn);
        ResourceBundle rb = ResourceBundle.getBundle("session.s9.Messages");
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("fullname"));
        System.out.println(rb.getString("FullName"));
        int money = 20000;
        NumberFormat nf = NumberFormat.getCurrencyInstance(vi_vn);
        String m = nf.format(money);
        System.out.println("Tien an sang nay me cho: "+m);
        int tienduhoc = 35000;
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Tien chuan bi di du hoc: "+nf2.format(tienduhoc));

        int solieudancu = 95670000;
        NumberFormat nv = NumberFormat.getNumberInstance();
        System.out.println("So dan: "+nv.format(solieudancu));
    }
}
