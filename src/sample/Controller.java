package sample;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    public TextField txtName;
    public TextField txtEmail;
    public TextArea txtAddress;
    public TextArea ketqua;

    public void submit(){
        String n = txtName.getText();
        String e = txtEmail.getText();
        String a = txtAddress.getText();
        ketqua.setText(n+"--"+e+"--"+a);
    }
}
