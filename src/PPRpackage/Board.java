/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPRpackage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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

    
    public Board(){
    themaze=new Maze();
    sprite=new Player();  
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
                        g.drawRect(x*50, y*50, 50, 50);
                        g.setColor(new Color(8, 94, 31));
                        g.fillRect(x*50, y*50, 50, 50);
                        break;
                    case 0:
                        g.drawRect(x*50, y*50, 50,50);
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillRect(x*50, y*50, 50, 50);
                        break;
                    case 9:
                        g.drawRect(x*50, y*50, 50,50);
                        g.setColor(Color.CYAN);
                        g.fillRect(x*50, y*50, 50, 50);
                    default:
                        break;
                }
            }
        }
g.drawImage(sprite.getImage(),sprite.getxloc(), sprite.getyloc(),null);
repaint();
    } 
public Player getPlayer(){
    return sprite;
}


}


