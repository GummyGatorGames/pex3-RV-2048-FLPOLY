package pex3.pkg2048;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.ParallelTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class FXMLActualGameController {

    TranslateTransition tran = new TranslateTransition();
    TranslateTransition tranback = new TranslateTransition();
    ParallelTransition trantime = new ParallelTransition();
    SequentialTransition sq = new SequentialTransition();
    ArrayList<Tile> tilearray = new ArrayList<>();
    ArrayList<ImageView> sqs;
    ArrayList<Integer> tileset;
    int starter1;
    int starter2;
    int starternew;
    Random rand = new Random();
    int lastp = 0;
    int spot = 0;
    int howfar = 0;
    double secondXpos;
    double secondYpos;
    double firstXpos;
    double firstYpos;
    boolean moved = false;
    boolean combined = false;
    int cycle;
    int row;
    int memy;
    int score = 0;
    int best = 0;

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private AnchorPane pane2;
    @FXML
    private Label label;
    @FXML
    private ImageView s1;
    @FXML
    private ImageView s2;
    @FXML
    private ImageView s3;
    @FXML
    private ImageView s4;
    @FXML
    private ImageView s5;
    @FXML
    private ImageView s6;
    @FXML
    private ImageView s7;
    @FXML
    private ImageView s8;
    @FXML
    private ImageView s9;
    @FXML
    private ImageView s10;
    @FXML
    private ImageView s11;
    @FXML
    private ImageView s12;
    @FXML
    private ImageView s13;
    @FXML
    private ImageView s14;
    @FXML
    private ImageView s15;
    @FXML
    private ImageView s16;
    @FXML
    private Text scoreT;
    @FXML
    private Text bestT;

    @FXML
    void move(KeyEvent event) {
        // This Command moves the tiles
        switch (event.getCode()) {
            case LEFT:
            case KP_LEFT:
                System.out.println("You pressed left");
                for (int x = 0; x < tileset.size(); x++) {
                    if (tilearray.get(x).getScore() != 0) {
                        if (x != 0 && x != 4 && x != 8 && x != 12) {
                            row = x / 4;
                            switch (row) {
                                case 0:
                                    cycle = x;
                                    memy = tilearray.get(x).getScore();
                                    System.out.println("Left time: " + x + " " + cycle + " " + memy);
                                    for (int y = 1; y <= cycle; y++) {
                                        if (tilearray.get(x - y).getScore() == (0)) {
                                            lastp = x - y;
                                            tilearray.get(lastp).setScore(memy);
                                            tilearray.get(x - (y - 1)).setScore(0);
                                            moved = true;
                                        } else if (tilearray.get(x - y).getScore() == (memy)) {
                                            tilearray.get(x-y).setScore(memy*2);
                                            tilearray.get(x - (y - 1)).setScore(0);
                                            moved = true;
                                        } else if (tilearray.get(x - y).getScore() != memy) {
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    cycle = x - 4;
                                    memy = tilearray.get(x).getScore();
                                    System.out.println("Left time: " + x + " " + cycle + " " + memy);
                                    for (int y = 1; y <= cycle; y++) {
                                        if (tilearray.get(x - y).getScore() == (0)) {
                                            lastp = x - y;
                                            tilearray.get(lastp).setScore(memy);
                                            tilearray.get(x - (y - 1)).setScore(0);
                                            moved = true;
                                        } else if (tilearray.get(x - y).getScore() == (memy)) {
                                            tilearray.get(x-y).setScore(memy*2);
                                            tilearray.get(x - (y - 1)).setScore(0);
                                            moved = true;
                                        } else if (tilearray.get(x - y).getScore() != memy) {
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    cycle = x - 8;
                                    memy = tilearray.get(x).getScore();
                                    System.out.println("Left time: " + x + " " + cycle + " " + memy);
                                    for (int y = 1; y <= cycle; y++) {
                                        if (tilearray.get(x - y).getScore() == (0)) {
                                            lastp = x - y;
                                            tilearray.get(lastp).setScore(memy);
                                            tilearray.get(x - (y - 1)).setScore(0);
                                            moved = true;
                                        } else if (tilearray.get(x - y).getScore() == (memy)) {
                                            tilearray.get(x-y).setScore(memy*2);
                                            tilearray.get(x - (y - 1)).setScore(0);
                                            moved = true;
                                        } else if (tilearray.get(x - y).getScore() != memy) {
                                            break;
                                        }
                                    }
                                    break;
                                case 3:
                                    cycle = x - 12;
                                    memy = tilearray.get(x).getScore();
                                    System.out.println("Left time: " + x + " " + cycle + " " + memy);
                                    for (int y = 1; y <= cycle; y++) {
                                        if (tilearray.get(x - y).getScore() == (0)) {
                                            lastp = x - y;
                                            tilearray.get(lastp).setScore(memy);
                                            tilearray.get(x - (y - 1)).setScore(0);
                                            moved = true;
                                        } else if (tilearray.get(x - y).getScore() == (memy)) {
                                            tilearray.get(x-y).setScore(memy*2);
                                            tilearray.get(x - (y - 1)).setScore(0);
                                            moved = true;
                                        } else if (tilearray.get(x - y).getScore() != memy) {
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                }
                //New Tile
                if (moved == true) {
                    starternew = rand.nextInt(16);
                    while (true) {
                        if (tilearray.get(starternew).getScore() != 0) {
                            starternew = rand.nextInt(16);
                        } else {
                            break;
                        }
                    }
                    tilearray.get(starternew).setScore(2);
                    
                    for(int x = 0; x < tilearray.size(); x++)
                    {
                        if(tilearray.get(x).getScore() == 2048)
                        {
                            
                        }
                    }
                    /*
                    //Movement
                    tran.setNode(tilearray.get(spot).getDigi());
                    secondXpos = tilearray.get(spot-howfar).getDigi().getLayoutX();
                    secondYpos = tilearray.get(spot-howfar).getDigi().getLayoutY();
                    firstXpos = tilearray.get(spot).getDigi().getLayoutX(); 
                    firstYpos = tilearray.get(spot).getDigi().getLayoutY();
                    
                    tran.setByX(secondXpos-firstXpos);                    
                    tran.setByY(secondYpos-firstYpos);
                    tran.setDuration(Duration.seconds(1));
                    
                    if (combined == true){
                        tilearray.get(spot).setPosi(spot);
                        tranback.setNode(tilearray.get(spot).getDigi());
                        tran.setByX(firstXpos-secondXpos);                    
                        tran.setByY(firstYpos-secondYpos);
                        tran.setDuration(Duration.seconds(1));
                        
                        sq = new SequentialTransition(tran,tranback);
                        sq.play();
                        tilearray.get(spot).setScore(0);
                    } else {
                        tran.play();
                    }
                     */
                }
                combined = false;
                moved = false;
                spot = 0;
                howfar = 0;

                System.out.println(" " + tilearray.get(0).getScore() + " " + tilearray.get(1).getScore() + " " + tilearray.get(2).getScore() + " " + tilearray.get(3).getScore() + " " + "\n"
                        + " " + tilearray.get(4).getScore() + " " + tilearray.get(5).getScore() + " " + tilearray.get(6).getScore() + " " + tilearray.get(7).getScore() + " " + "\n"
                        + " " + tilearray.get(8).getScore() + " " + tilearray.get(9).getScore() + " " + tilearray.get(10).getScore() + " " + tilearray.get(11).getScore() + " " + "\n"
                        + " " + tilearray.get(12).getScore() + " " + tilearray.get(13).getScore() + " " + tilearray.get(14).getScore() + " " + tilearray.get(15).getScore() + " " + "\n");

                break;
            case RIGHT:
            case KP_RIGHT:
                System.out.println("You pressed right");
                for (int x = tilearray.size() - 1; x >= 0; x--) {
                    if (tilearray.get(x).getScore() != 0) {
                        if (x != 3 && x != 7 && x != 11 && x != 15) {

                            row = x / 4;
                            switch (row) {
                                case 0:
                                    cycle = 3 - x;
                                    memy = tilearray.get(x).getScore();
                                    System.out.println("Right time: " + x + " " + cycle + " " + memy);
                                    for (int y = 1; y <= cycle; y++) {
                                        if (tilearray.get(x + y).getScore() == (0)) {
                                            lastp = x + y;
                                            tilearray.get(lastp).setScore(memy);
                                            tilearray.get(x + (y - 1)).setScore(0);
                                            moved = true;
                                        } else if (tilearray.get(x + y).getScore() == (memy)) {
                                            tilearray.get(x + y).setScore(memy*2);
                                            tilearray.get(x + (y - 1)).setScore(0);
                                            moved = true;
                                        } else if (tilearray.get(x + y).getScore() != memy) {
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    cycle = 7 - x;
                                    memy = tilearray.get(x).getScore();
                                    System.out.println("Right time: " + x + " " + cycle + " " + memy);
                                    for (int y = 1; y <= cycle; y++) {
                                        if (tilearray.get(x + y).getScore() == (0)) {
                                            lastp = x + y;
                                            tilearray.get(lastp).setScore(memy);
                                            tilearray.get(x + (y - 1)).setScore(0);
                                            moved = true;
                                        } else if (tilearray.get(x + y).getScore() == (memy)) {
                                            tilearray.get(x + y).setScore(memy*2);
                                            tilearray.get(x + (y - 1)).setScore(0);
                                            moved = true;
                                        } else if (tilearray.get(x + y).getScore() != memy) {
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    cycle = 11 - x;
                                    memy = tilearray.get(x).getScore();
                                    System.out.println("Right time: " + x + " " + cycle + " " + memy);
                                    for (int y = 1; y <= cycle; y++) {
                                        if (tilearray.get(x + y).getScore() == (0)) {
                                            lastp = x + y;
                                            tilearray.get(lastp).setScore(memy);
                                            tilearray.get(x + (y - 1)).setScore(0);
                                            moved = true;
                                        } else if (tilearray.get(x + y).getScore() == (memy)) {
                                            tilearray.get(x + y).setScore(memy*2);
                                            tilearray.get(x + (y - 1)).setScore(0);
                                            moved = true;
                                        } else if (tilearray.get(x + y).getScore() != memy) {
                                            break;
                                        }
                                    }
                                    break;
                                case 3:
                                    cycle = 15 - x;
                                    memy = tilearray.get(x).getScore();
                                    System.out.println("Right time: " + x + " " + cycle + " " + memy);
                                    for (int y = 1; y <= cycle; y++) {
                                        if (tilearray.get(x + y).getScore() == (0)) {
                                            lastp = x + y;
                                            tilearray.get(lastp).setScore(memy);
                                            tilearray.get(x + (y - 1)).setScore(0);
                                            moved = true;
                                        } else if (tilearray.get(x + y).getScore() == (memy)) {
                                            tilearray.get(x + y).setScore(memy*2);
                                            tilearray.get(x + (y - 1)).setScore(0);
                                            moved = true;
                                        } else if (tilearray.get(x + y).getScore() != memy) {
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                }

                //New Tile
                if (moved == true) {
                    starternew = rand.nextInt(16);
                    while (true) {
                        if (tilearray.get(starternew).getScore() != 0) {
                            starternew = rand.nextInt(16);
                        } else {
                            break;
                        }
                    }
                    tilearray.get(starternew).setScore(2);
                    for(int x = 0; x < tilearray.size(); x++)
                    {
                        if(tilearray.get(x).getScore() == 2048)
                        {
                            
                        }
                    }
                }
                moved = false;

                System.out.println(" " + tilearray.get(0).getScore() + " " + tilearray.get(1).getScore() + " " + tilearray.get(2).getScore() + " " + tilearray.get(3).getScore() + " " + "\n"
                        + " " + tilearray.get(4).getScore() + " " + tilearray.get(5).getScore() + " " + tilearray.get(6).getScore() + " " + tilearray.get(7).getScore() + " " + "\n"
                        + " " + tilearray.get(8).getScore() + " " + tilearray.get(9).getScore() + " " + tilearray.get(10).getScore() + " " + tilearray.get(11).getScore() + " " + "\n"
                        + " " + tilearray.get(12).getScore() + " " + tilearray.get(13).getScore() + " " + tilearray.get(14).getScore() + " " + tilearray.get(15).getScore() + " " + "\n");

                break;
            case UP:
            case KP_UP:
                for (int x = 0; x < tilearray.size(); x++) {
                    if (tilearray.get(x).getScore() != 0) {

                        if (x > 3) {

                            cycle = x / 4;
                            memy = tilearray.get(x).getScore();
                            System.out.println("Up time: " + x + " " + cycle + " " + memy);
                            for (int y = 1; y <= cycle; y++) {
                                if (tilearray.get(x - y * 4).getScore() == (0)) {
                                    lastp = x - y * 4;
                                    tilearray.get(lastp).setScore(memy);
                                    tilearray.get(x - 4 * (y - 1)).setScore(0);
                                    moved = true;
                                } else if (tilearray.get(x - y * 4).getScore() == (memy)) {
                                    tilearray.get(x - y * 4).setScore(memy * 2);
                                    tilearray.get(x - 4 * (y - 1)).setScore(0);
                                    moved = true;
                                } else if (tilearray.get(x - y * 4).getScore() != memy) {
                                    break;
                                }
                            }
                            lastp = 0;

                        }

                    }

                }

                //New Tile
                if (moved == true) {
                    starternew = rand.nextInt(16);
                    while (true) {
                        if (tilearray.get(starternew).getScore() != 0) {
                            starternew = rand.nextInt(16);
                        } else {
                            break;
                        }
                    }
                    tilearray.get(starternew).setScore(2);
                    for(int x = 0; x < tilearray.size(); x++)
                    {
                        if(tilearray.get(x).getScore() == 2048)
                        {
                            
                        }
                    }
                }
                moved = false;

                System.out.println(" " + tilearray.get(0).getScore() + " " + tilearray.get(1).getScore() + " " + tilearray.get(2).getScore() + " " + tilearray.get(3).getScore() + " " + "\n"
                        + " " + tilearray.get(4).getScore() + " " + tilearray.get(5).getScore() + " " + tilearray.get(6).getScore() + " " + tilearray.get(7).getScore() + " " + "\n"
                        + " " + tilearray.get(8).getScore() + " " + tilearray.get(9).getScore() + " " + tilearray.get(10).getScore() + " " + tilearray.get(11).getScore() + " " + "\n"
                        + " " + tilearray.get(12).getScore() + " " + tilearray.get(13).getScore() + " " + tilearray.get(14).getScore() + " " + tilearray.get(15).getScore() + " " + "\n");

                break;
            case DOWN:
            case KP_DOWN:
                for (int x = tilearray.size() - 1; x >= 0; x--) {
                    if (tilearray.get(x).getScore() != 0) {

                        if (x < 12) {

                            cycle = x / 4;
                            cycle = 3 - cycle;
                            memy = tilearray.get(x).getScore();
                            System.out.println("Down time: " + x + " " + cycle + " " + memy);
                            for (int y = 1; y <= cycle; y++) {
                                if (tilearray.get(x + y * 4).getScore() == 0) {
                                    lastp = x + y * 4;
                                    tilearray.get(lastp).setScore(memy);
                                    tilearray.get(x + 4 * (y - 1)).setScore(0);
                                    moved = true;
                                } else if (tilearray.get(x + y * 4).getScore() == memy) {
                                    tilearray.get(x + y * 4).setScore(memy * 2);
                                    tilearray.get(x + 4 * (y - 1)).setScore(0);
                                    moved = true;
                                } else if (tilearray.get(x + y * 4).getScore() != memy) {
                                    break;
                                }
                            }
                            lastp = 0;

                        }

                    }

                }

                //New Tile
                if (moved == true) {
                    starternew = rand.nextInt(16);
                    while (true) {
                        if (tilearray.get(starternew).getScore() != 0) {
                            starternew = rand.nextInt(16);
                        } else {
                            break;
                        }
                    }
                    tilearray.get(starternew).setScore(2);
                    for(int x = 0; x < tilearray.size(); x++)
                    {
                        if(tilearray.get(x).getScore() == 2048)
                        {
                            
                        }
                    }
                }
                moved = false;

                System.out.println(" " + tilearray.get(0).getScore() + " " + tilearray.get(1).getScore() + " " + tilearray.get(2).getScore() + " " + tilearray.get(3).getScore() + " " + "\n"
                        + " " + tilearray.get(4).getScore() + " " + tilearray.get(5).getScore() + " " + tilearray.get(6).getScore() + " " + tilearray.get(7).getScore() + " " + "\n"
                        + " " + tilearray.get(8).getScore() + " " + tilearray.get(9).getScore() + " " + tilearray.get(10).getScore() + " " + tilearray.get(11).getScore() + " " + "\n"
                        + " " + tilearray.get(12).getScore() + " " + tilearray.get(13).getScore() + " " + tilearray.get(14).getScore() + " " + tilearray.get(15).getScore() + " " + "\n");
                break;
            default:
                break;
        }
    }

    @FXML
    void initialize() {
        assert pane2 != null : "fx:id=\"pane2\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert s1 != null : "fx:id=\"s1\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert s2 != null : "fx:id=\"s2\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert s3 != null : "fx:id=\"s3\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert s4 != null : "fx:id=\"s4\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert s5 != null : "fx:id=\"s5\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert s6 != null : "fx:id=\"s6\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert s7 != null : "fx:id=\"s7\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert s8 != null : "fx:id=\"s8\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert s9 != null : "fx:id=\"s9\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert s10 != null : "fx:id=\"s10\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert s11 != null : "fx:id=\"s11\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert s12 != null : "fx:id=\"s12\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert s13 != null : "fx:id=\"s13\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert s14 != null : "fx:id=\"s14\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert s15 != null : "fx:id=\"s15\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert s16 != null : "fx:id=\"s16\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert scoreT != null : "fx:id=\"scoreT\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        assert bestT != null : "fx:id=\"bestT\" was not injected: check your FXML file 'FXMLActualGame.fxml'.";
        //Set the ImageViews
        sqs = new ArrayList<>();
        sqs.add(s1);
        sqs.add(s2);
        sqs.add(s3);
        sqs.add(s4);
        sqs.add(s5);
        sqs.add(s6);
        sqs.add(s7);
        sqs.add(s8);
        sqs.add(s9);
        sqs.add(s10);
        sqs.add(s11);
        sqs.add(s12);
        sqs.add(s13);
        sqs.add(s14);
        sqs.add(s15);
        sqs.add(s16);

        // Set up the Tileset, set up the squares, then summon 2 Tiles in 2 random tile spaces.
        tileset = new ArrayList<>();
        for (int x = 0; x < 16; x++) {
            tileset.add(0);
            tilearray.add(new Tile(x, 0, sqs.get(x)));
        }

        System.out.println(tileset.size());

        starter1 = rand.nextInt(16);
        starter2 = rand.nextInt(16);

        while (true) {
            if (starter1 == starter2) {
                starter2 = rand.nextInt(16);
            } else {
                break;
            }
        }

        tileset.set(starter1, 2);
        tileset.set(starter2, 2);
        tilearray.get(starter1).setScore(2);
        tilearray.get(starter2).setScore(2);

        //Check whats inside
        System.out.println(tileset.get(0) + " " + tileset.get(1) + " " + tileset.get(2) + " " + tileset.get(3) + " " + "\n"
                + " " + tileset.get(4) + " " + tileset.get(5) + " " + tileset.get(6) + " " + tileset.get(7) + " " + "\n"
                + " " + tileset.get(8) + " " + tileset.get(9) + " " + tileset.get(10) + " " + tileset.get(11) + " " + "\n"
                + " " + tileset.get(12) + " " + tileset.get(13) + " " + tileset.get(14) + " " + tileset.get(15) + " " + "\n");

    }
}
