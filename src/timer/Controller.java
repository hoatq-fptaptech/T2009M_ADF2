package timer;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Text txtMin;
    public Text txtSec;
    public TextField inputTime;
    public Button btnPause;

    Integer min = 0;
    Integer sec= 0;
    boolean runnable = true;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void runTimer(){
        while (min>=0 && runnable){
            while (sec>=0 && runnable){
                txtMin.setText(min>=10?min.toString():"0"+min.toString());
                txtSec.setText(sec>=10?sec.toString():"0"+sec.toString());
                sec--;
                try {
                    Thread.sleep(1000);
                }catch (Exception e){

                }
            }
            if(sec <0){
                sec=59;
            }
            if(runnable) min--;
        }
    }

    public void startTimer(){
        runnable = true;
        min = Integer.parseInt(inputTime.getText());
        Runnable r = new Runnable() {
            @Override
            public void run() {
                runTimer();
            }
        };
        Thread t = new Thread(r);
        t.start();
    }

    public void pauseTimer(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                runnable = !runnable;
                if(runnable){
//                    btnPause.setText("Pause");
                    runTimer();
                }else {
//                    btnPause.setText("Continue");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }

    public void resetTimer(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                runnable = false;
                min=0;
                sec=0;
                txtMin.setText(min>=10?min.toString():"0"+min.toString());
                txtSec.setText(sec>=10?sec.toString():"0"+sec.toString());
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
