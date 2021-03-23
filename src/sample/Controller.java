package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.model.Student;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField txtName;
    public TextField txtMark;
    public TextArea txtAddress;
    public TextArea ketqua;

    public static ArrayList<Student> ds = new ArrayList<>();
    public static boolean flag = true;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // can lam gi khi mo app thi viet vao day
    }

    public void submit(){
        String n = txtName.getText();
        String m = txtMark.getText();
        String a = txtAddress.getText();
        if(!n.isEmpty() && !m.isEmpty() && !a.isEmpty()){
           Integer diemthi = Integer.parseInt(m);// chuyen string thanh number
           ds.add(new Student(n,diemthi,a));
           // ds.add(n+"--"+e+"--"+a+"\n");
            // sort
            String txt= "";
            for(Student s:ds){
                txt+= s.getName()+"--"+s.getMark()+"\n";
            }
            ketqua.setText(txt);
            txtName.setText("");
            txtMark.setText("");
            txtAddress.setText("");
        }

    }
    public void sort(){
        if(flag) {
            // sap xep diem thi tu thap - cao
            Collections.sort(ds, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getMark() - o2.getMark();
                }
            });
            flag = false;
        }else{
            // sap xep diem thi tu cao - thap
            Collections.sort(ds, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o2.getMark() - o1.getMark();
                }
            });
            flag = true;
        }
        // in lai danh sach
        String txt= "";
        for(Student s:ds){
            txt+= s.getName()+"--"+s.getMark()+"\n";
        }
        ketqua.setText(txt);
    }
}
