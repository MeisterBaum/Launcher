/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfury_launcher;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * FXML Controller class
 *
 * @author anebl
 */
public class FirstStartController implements Initializable {

    @FXML
    ImageView iv_Project;
    
    @FXML
    MediaView mv_credits;
    Media video = new Media("C:\\Users\\anebl\\Desktop\\ProjectFury\\Launcher\\ProjectFury_Launcher\\src\\projectfury_launcher\\Videos\\MP1_Title.mp3");
    MediaPlayer mp = new MediaPlayer(video);
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mp.setAutoPlay(true);
        mv_credits.setMediaPlayer(mp);
        
    }    
    
}
