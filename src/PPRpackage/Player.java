/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPRpackage;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Tessa
 */
public class Player {
    
private int xloc;
private int yloc;
private Image thePlayerImage;
        
public Player(){
xloc=1;
yloc=1;

    switch (PPRD.identifier) {
        case "dog":
            {
                ImageIcon image=new ImageIcon(getClass().getResource("/PPRpackage/dog sprite.png"));
                thePlayerImage=image.getImage();
                break;
            }
        case "cat":
            {
                ImageIcon image=new ImageIcon(getClass().getResource("/images/cat sprite.png"));
                thePlayerImage=image.getImage();
                break;
            }
        case "guinea pig":
            {
                ImageIcon image=new ImageIcon(getClass().getResource("/images/guinea pig sprite.png"));
                thePlayerImage=image.getImage();
                break;
            }
        default:
            break;
    }


}    

public Image getImage(){
    return thePlayerImage;
}
public void move(int dx, int dy){
    xloc+=dx;
    yloc+=dy;
}

public int getxloc(){
    return xloc;
}

public int getyloc(){
    return yloc;
}


}
