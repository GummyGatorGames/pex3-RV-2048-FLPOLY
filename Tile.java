/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pex3.pkg2048;

import java.io.File;
import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author ronal
 */
public class Tile {
    private int posi;
    private int score;
    private ImageView digi;
    
    private int height = 90;
    private int width = 90;

    public Tile() {
    }

    public Tile(int pos, int val, ImageView dig) {
        score = val;
        posi = pos;
        digi = dig;
        digi.setLayoutX(getStartXPosi(posi));
        digi.setLayoutY(getStartYPosi(posi));
        digi.toFront();
        System.out.println("Digimon spawned");
    }

    public int getScore() {
        return score;
    }

    public ImageView getDigi() {
        return digi;
    }

    public void setDigi(ImageView digi) {
        this.digi = digi;
    }
    
    
    public void setScore(int val) {
        this.score = val;
        digi.setImage(getnewImage(val));
    }

    public int getPosi() {
        return posi;
    }

    public void setPosi(int posi) {
        this.posi = posi;
        digi.setX(posi);
        digi.setY(posi);
    }
    
    
    
    public Image getnewImage(int tempValue)
    {
       switch(tempValue){
            case 2:
                return new Image(new File("src\\pex3\\pkg2048\\koromon-2").toURI().toString());
            case 4:
                return new Image(new File("src\\pex3\\pkg2048\\agumon-4.gif").toURI().toString());
            case 8:
                return new Image(new File("src\\pex3\\pkg2048\\greymon-8.gif").toURI().toString());
            case 16:
                return new Image(new File("src\\pex3\\pkg2048\\metalgreymon-16.gif").toURI().toString());
            case 32:
                return new Image(new File("src\\pex3\\pkg2048\\skullgreymon-32.gif").toURI().toString());
            case 64:
                return new Image(new File("src\\pex3\\pkg2048\\wargreymon-64.gif").toURI().toString());
            case 128:
                return new Image(new File("src\\pex3\\pkg2048\\omnimon-128.gif").toURI().toString());
            case 256:
                return new Image(new File("src\\pex3\\pkg2048\\pagumon-256").toURI().toString());
            case 512:
                return new Image(new File("src\\pex3\\pkg2048\\blackagumon-512.gif_c200").toURI().toString());
            case 1024:
                return new Image(new File("src\\pex3\\pkg2048\\metaltyrannomon-1024.gif_c200").toURI().toString());
            case 2048:
                return new Image(new File("src\\pex3\\pkg2048\\machinedramon-2048.gif").toURI().toString());
            default:
                break;
                
        }
       return null;
    }
    
    public Double getStartXPosi(int tempValue)
    {
        switch(tempValue){
            case 0:
            case 4:
            case 8:
            case 12:
                return 39.0;
            case 1:
            case 5:
            case 9:
            case 13:
                return 139.0;
            case 2:
            case 6:
            case 10:
            case 14:
                return 239.0;
            case 3:
            case 7:
            case 11:
            case 15:
                return 339.0;
            default:
                break;
                
        }
       return null;
        
    }
    
    public Double getStartYPosi(int tempValue)
    {
        switch(tempValue){
            case 0:
            case 1:
            case 2:
            case 3:
                return 100.0;
            case 4:
            case 5:
            case 6:
            case 7:
                return 200.0;
            case 8:
            case 9:
            case 10:
            case 11:
                return 300.0;
            case 12:
            case 13:
            case 14:
            case 15:
                return 400.0;
            default:
                break;
                
        }
       return null;
        
    }
    
    
    
    
    
    
}
