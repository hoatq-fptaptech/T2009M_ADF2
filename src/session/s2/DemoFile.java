package session.s2;

import java.io.*;

public class DemoFile {
    public static void main(String[] args){
        try {
            //Write file
            FileOutputStream fos = new FileOutputStream("data.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeBytes("xin chao, day la noi dung vua ghi lai\n");
            dos.writeBytes("xin chao, day la noi dung vua ghi lan 2\n");
            // Read file
            FileInputStream fis = new FileInputStream("data.txt");
            DataInputStream dis = new DataInputStream(fis);
            String txt="";
            for(;txt!=null;){
                txt = dis.readLine();
                System.out.println(txt);
            }
        }catch (FileNotFoundException f){
            System.out.println("FILE NOT FOUND");
        }catch (IOException io){
            System.out.println("FILE ERROR");
        }
    }
}
