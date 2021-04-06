package session.s8;


import model.SinhVienAccessObject;
import model.entity.SinhVien;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // gia su can lay ds sinh vien
        SinhVienAccessObject svao = new SinhVienAccessObject();
        ArrayList<SinhVien> ds = svao.getList();
        System.out.println("So luong sv: "+ds.size());
        // tao 1 sinh vien
        SinhVien s = new SinhVien(null,"Nguyễn Văn Lộc",19,5);
        if(svao.create(s)){
            System.out.println("tao thanh cong");
        }else{
            System.out.println("tao that bai");
        }
    }
}
