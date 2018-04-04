package pex3.pkg2048;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FXML2048Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane pane;
    
    @FXML
    private Button playbutton;

    @FXML
    private Label label;

    
    @FXML
    void playgame(ActionEvent event) {
        //Open The Next Pane, then plays music
        Parent root = null;
        FXMLLoader root1 = null;
        root1 = new FXMLLoader(getClass().getResource("FXMLActualGame.fxml"));
        try {
            root = (Parent) root1.load();
            System.out.println("Hello1");
        } catch (IOException ex) {
        }
        System.out.println("Hello2");
        FXMLActualGameController controller = root1.<FXMLActualGameController>getController();
        
        //Set the focus
        root.setFocusTraversable(true);
        Scene sc = new Scene(root);
        Stage st = new Stage();
        st.setScene(sc);
        st.show();
        root.requestFocus();
        
        pane.getScene().getWindow().hide();
        
        playMusic();
        
    }
    
    public void playMusic() {
        URL resource = getClass().getResource("Neil Cicierega - Wow Wow (instrumental).mp3");
        MediaPlayer song = new MediaPlayer(new Media(resource.toString()));
        song.setOnEndOfMedia(new Runnable() {
            public void run() {
                song.seek(Duration.ZERO);
            }
        });
        song.play();
    }
    

    @FXML
    void initialize() {
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'FXML2048.fxml'.";
        assert playbutton != null : "fx:id=\"playbutton\" was not injected: check your FXML file 'FXML2048.fxml'.";
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'FXML2048.fxml'.";

    }
}
