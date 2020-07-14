/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPRpackage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;


/**
 *
 * @author Tessa
 */
public class Container {
private int happy;
private int hunger;
private int health;
public Container(){
JFrame theFrame=new JFrame(); 
theFrame.setTitle("Walk Your Dog Through the Maze!");
theFrame.setSize(1020,1050);
theFrame.setVisible(true);
Board theMaze=new Board();
theMaze.setFocusable(true);
theFrame.setFocusable(true);
happy=GUIMock3GUI.getHappy();
hunger=GUIMock3GUI.getHunger();
health=GUIMock3GUI.getHealth();

        theFrame.addKeyListener(new KeyListener(){
           
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
                int keyCode=e.getKeyCode();
                switch(keyCode){
                case KeyEvent.VK_UP:
                switch (theMaze.getMapVal(theMaze.getPlayer().getxloc(), theMaze.getPlayer().getyloc()-1)) {
                    case 1:
                        theMaze.getPlayer().move(0, 0);
                        if(health-5>=0){
                        health=health-5;
                         }
                        GUIMock3GUI.jLabel5.setText(Integer.toString(health) + "/100");
                        GUIMock3GUI.jTextArea1.setText("Why are you trying to walk your pet into the bushes :( ");
                       
                        break;
                    case 0:
                        theMaze.getPlayer().move(0, -1);
                        break;
                    case 9:
                        theFrame.dispose();
                        break;
                    default:
                        break;
                }
                        break;
                    case KeyEvent.VK_DOWN:
                        switch (theMaze.getMapVal(theMaze.getPlayer().getxloc(), theMaze.getPlayer().getyloc()+1)) {
                    case 1:
                        theMaze.getPlayer().move(0, 0);
                        if(health-5>=0){
                        health=health-5;
                         }
                        GUIMock3GUI.jLabel5.setText(Integer.toString(health) + "/100");
                        GUIMock3GUI.jTextArea1.setText("Why are you trying to walk your pet into the bushes :( ");
                      
                        break;
                    case 0:
                        theMaze.getPlayer().move(0, 1);
                        break;
                    case 9:
                        if(happy+15<=85){
                        happy=happy+15;    
                        }
                        GUIMock3GUI.jLabel7.setText(Integer.toString(happy)+"/100");
                        GUIMock3GUI.jTextArea1.setText("Good job, you successfully walked your pet through the maze!");
                        theFrame.dispose();
                        
                        //xp
                        Random newr = new Random();
                        int newxp = (newr.nextInt(20));
                        GUIMock3GUI.totalxp += newxp;
                        GUIMock3GUI.gameIdentifier = "maze";
                        int newstuff = (newr.nextInt(15));
                        int newstuff2 = (newr.nextInt(15));
                        GUIMock3GUI.hunger -= newstuff;
                        GUIMock3GUI.happy += newstuff2;
                        GUIMock3GUI.endxp();
                        
                        break;
                    default:
                        break;
                }
                       
                        break;
                    case KeyEvent.VK_LEFT:
                        switch (theMaze.getMapVal(theMaze.getPlayer().getxloc()-1, theMaze.getPlayer().getyloc()+0)) {
                    case 1:
                        theMaze.getPlayer().move(0, 0);
                       if(health-5>=0){
                        health=health-5;
                         }
                        GUIMock3GUI.jLabel5.setText(Integer.toString(health) + "/100");
                        GUIMock3GUI.jTextArea1.setText("Why are you trying to walk your pet into the bushes :( ");
                        
                        break;
                    case 0:
                        theMaze.getPlayer().move(-1, 0);
                        break;
                    case 9:
                        theFrame.dispose();
                        break;
                    default:
                        break;
                }
                       break;
                    case KeyEvent.VK_RIGHT:
                        switch (theMaze.getMapVal(theMaze.getPlayer().getxloc()+1, theMaze.getPlayer().getyloc()+0)) {
                    case 1:
                        theMaze.getPlayer().move(0, 0);
                        if(health-5>=0){
                        health=health-5;
                         }
                        GUIMock3GUI.jLabel5.setText(Integer.toString(health) + "/100");
                        GUIMock3GUI.jTextArea1.setText("Why are you trying to walk your pet into the bushes :( ");
                        
                        break;
                    case 0:
                        theMaze.getPlayer().move(1, 0);
                        break;
                    case 9:
                        theFrame.dispose();
                        break;
                    default:
                        break;
                }
                        break;
                }
                
                
                
                //if you hurt da dog
                 if (health == 0 || happy == 0 || hunger == 0 || health == 1 || happy == 1 || hunger == 1) {
                    Fail newone = new Fail();
                    newone.setVisible(true);
                }
                
                
                
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        
        
        theFrame.add(theMaze);
    }
}
