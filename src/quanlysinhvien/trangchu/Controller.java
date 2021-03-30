package quanlysinhvien.trangchu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import quanlysinhvien.Main;

public class Controller {

    public void danhSach() throws Exception{
        // chuyen man hinh trang danh sach
//        Stage st = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../danhsach/danhsach.fxml"));
        Main.mainStage.setScene(new Scene(root, 600, 400));
        Main.mainStage.show();
    }
}
