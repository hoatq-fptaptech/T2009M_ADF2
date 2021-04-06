package session.s3;

import database.Connector;

import java.sql.*;
public class Main {

    public static void main(String[] args){
        try {
            Connector c = Connector.getInstance();
            String txt_sql = "select * from SinhVien";
            ResultSet rs = c.getStatement().executeQuery(txt_sql);
            while (rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getInt("age"));
                System.out.println(rs.getInt("mark"));
                System.out.println("------");
            }
        }catch (SQLException se){
            System.out.println("Connect error");
        }

    }
}
