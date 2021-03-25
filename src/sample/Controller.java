package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.model.Student;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;
import java.sql.*;
public class Controller implements Initializable {
    public TextField txtName;
    public TextField txtMark;
    public TextArea txtAddress;
    public TextArea ketqua;

    public static ArrayList<Student> ds = new ArrayList<>();
    public static boolean flag = true;

    public final static String connectString = "jdbc:mysql://localhost:3306/T2009M";
    public final static String username = "root";
    public final static String password = "root";// dung xampp thi bo root di

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // can lam gi khi mo app thi viet vao day
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectString,username,password);
            Statement stt = conn.createStatement();
            String txt_sql = "select * from SinhVien";
            ResultSet rs = stt.executeQuery(txt_sql);
            String txt = "";
            while (rs.next()){
//                System.out.println(rs.getInt("id"));
//                System.out.println(rs.getString("name"));
//                System.out.println(rs.getInt("age"));
//                System.out.println(rs.getInt("mark"));
//                System.out.println("------");
                txt += rs.getInt("id");
                txt += "--"+rs.getString("name");
                txt += "--"+rs.getInt("age");
                txt += "--"+rs.getInt("mark");
                txt+="\n";
            }
            ketqua.setText(txt);
        }catch (ClassNotFoundException cn){
            System.out.println("Class not found");
        }catch (SQLException se){
            System.out.println("Connect error");
        }
    }

    public void submit(){
        String n = txtName.getText();
        String m = txtMark.getText();
        String a = txtAddress.getText();
        if(!n.isEmpty() && !m.isEmpty() && !a.isEmpty()){
           Integer diemthi = Integer.parseInt(m);// chuyen string thanh number
           Integer tuoi = Integer.parseInt(a);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(connectString,username,password);
                Statement stt = conn.createStatement();
                String txt_sql = "insert into SinhVien(name,age,mark) " +
                        "values('"+n+"',"+tuoi+","+diemthi+")";
                stt.execute(txt_sql);
                String txt_sql2 = "select * from SinhVien";
                ResultSet rs = stt.executeQuery(txt_sql2);
                String txt = "";
                while (rs.next()){
//
                    txt += rs.getInt("id");
                    txt += "--"+rs.getString("name");
                    txt += "--"+rs.getInt("age");
                    txt += "--"+rs.getInt("mark");
                    txt+="\n";
                }
                ketqua.setText(txt);
            }catch (ClassNotFoundException cn){
                System.out.println("Class not found");
            }catch (SQLException se){
                System.out.println("Connect error");
            }
//           //ds.add(new Student(n,diemthi,a));
//            Student s = new Student(n,diemthi,a);
//           // ds.add(n+"--"+e+"--"+a+"\n");
//            // goi file de output ra
//            try{
//                // lay du lieu cu
//                FileInputStream fis = new FileInputStream("student.bin");
//                DataInputStream dis = new DataInputStream(fis);
//                String txt = dis.readLine();
//                String txtTextArea = "";
//                while (txt !=null){
//                    txtTextArea+= txt+"\n";
//                    txt = dis.readLine();
//                }
//                txtTextArea += s.getName()+"--"+s.getMark()+"\n";
//                FileOutputStream fos = new FileOutputStream("student.bin");
//                DataOutputStream dos = new DataOutputStream(fos);
//                dos.writeBytes(txtTextArea);
//                ketqua.setText(txtTextArea);
//            }catch (IOException io){
//            }
            // sort
//            String txt= "";
//            for(Student s:ds){
//                txt+= s.getName()+"--"+s.getMark()+"\n";
//            }
//            ketqua.setText(txt);
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
