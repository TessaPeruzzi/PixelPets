/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPRpackage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Tessa
 */
public class Board extends JPanel implements ActionListener {
    private final Maze themaze;
    private int[][] arr;
    private final Player sprite;
    private Image bush;
    private Image treat;
    
    public Board(){
    themaze=new Maze();
    sprite=new Player();
    ImageIcon image=new ImageIcon(getClass().getResource("/images/bushresize.png"));
    bush=image.getImage();
    
    switch(PPRD.identifier){
        case("dog"):
            ImageIcon theimage=new ImageIcon(getClass().getResource("/images/biscuit.png"));  
            treat=theimage.getImage();
            break;
        case("cat"):
            ImageIcon theimage2=new ImageIcon(getClass().getResource("/images/fish.png"));  
            treat=theimage2.getImage();
            break;
        case("guinea pig"):
            ImageIcon theimage3=new ImageIcon(getClass().getResource("/images/carrot.png"));  
            treat=theimage3.getImage();
            break;
    }
    
    }
 
    @Override
    public void actionPerformed(ActionEvent e){
    repaint();    
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        arr=themaze.getMaze();
  
        for (int x=0;x<20;x++){
            for(int y=0;y<20;y++){
                switch (arr[y][x]) {
                    case 1:
                        g.drawImage(bush,x*50, y*50,null);
                        break;
                    case 0:
                        g.drawRect(x*50, y*50, 50,50);
                        g.setColor(new Color(224, 224, 224));
                        g.fillRect(x*50, y*50, 50, 50);
                        break;
                    case 9:
                        g.drawRect(x*50, y*50, 50,50);
                        g.setColor(new Color(224, 224, 224));
                        g.fillRect(x*50, y*50, 50, 50);
                        g.drawImage(treat,x*50, y*50,null);
                    default:
                        break;
                }
            }
        }
g.drawImage(sprite.getImage(),sprite.getxloc()*50, sprite.getyloc()*50,null);
repaint();
    } 
public Player getPlayer(){
    return sprite;
}
public int getMapVal(int x, int y){
    return arr[y][x];
    
}


}


