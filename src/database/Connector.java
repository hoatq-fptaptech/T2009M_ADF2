package database;
import java.sql.*;
public class Connector {
    public final static String connectString = "jdbc:mysql://localhost:3306/T2009M";
    public final static String username = "root";
    public final static String password = "root";// dung xampp thi bo root di

    public Statement statement;

    // b2. define static variable
    private static Connector instance;

    // b1. private constructor
    private Connector(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectString,username,password);
            Statement stt = conn.createStatement();
            statement = stt;

        }catch (ClassNotFoundException cn){
            System.out.println("Class not found");
        }catch (SQLException se){
            System.out.println("Connect error");
        }
    }

    // b3. define static function
    public static Connector getInstance(){
        if(instance == null)
            instance = new Connector();
        return instance;
    }

    public Statement getStatement() {
        return statement;
    }
}
