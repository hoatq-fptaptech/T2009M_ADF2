package sample;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {
    public TextField txtName;
    public TextField txtEmail;
    public TextArea txtAddress;
    public TextArea ketqua;

    public static ArrayList<String> ds = new ArrayList<>();
    public static boolean flag = true;
    public void submit(){
        String n = txtName.getText();
        String e = txtEmail.getText();
        String a = txtAddress.getText();
        if(!n.isEmpty() && !e.isEmpty() && !a.isEmpty()){
            ds.add(n+"--"+e+"--"+a+"\n");
            // sort
            String txt= "";
            for(String s:ds){
                txt+= s;
            }
            ketqua.setText(txt);
            txtName.setText("");
            txtEmail.setText("");
            txtAddress.setText("");
        }

    }
}
