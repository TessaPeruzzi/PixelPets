/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPRpackage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import java.awt.Graphics;

/**
 *
 * @author Tessa
 */
public class Container {
    
public Container(){
JFrame theFrame=new JFrame(); 
theFrame.setTitle("Walk Your Dog Through the Maze!");
theFrame.setSize(1020,1050);
theFrame.setVisible(true);
Board theMaze=new Board();
theMaze.setFocusable(true);
//theFrame.add(theMaze);
theFrame.setFocusable(true);
        theFrame.addKeyListener(new KeyListener(){
           
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode=e.getKeyCode();
                switch(keyCode){
                    case KeyEvent.VK_UP:
                        theMaze.getPlayer().move(0, -50);
                        break;
                    case KeyEvent.VK_DOWN:
                       theMaze.getPlayer().move(0, 50);
                        break;
                    case KeyEvent.VK_LEFT:
                       theMaze.getPlayer().move(-50, 0);
                       break;
                    case KeyEvent.VK_RIGHT:
                        theMaze.getPlayer().move(50, 0);
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        
        
        theFrame.add(theMaze);
    }
}
