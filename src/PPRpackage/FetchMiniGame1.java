package PPRpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import PPRpackage.GUIMock3GUI;   //“Download Free Png Tennis Ball PNG Image, Download PNG Image with ... .” DLPNG, 2018, dlpng.com/png/6560212.
import PPRpackage.PPRD;           //Tennis Ball Image Source
import java.awt.event.KeyEvent;
import java.util.Random;

/**
 *
 * @author reedsikorski
 */
public class FetchMiniGame1 extends javax.swing.JFrame {
    
    private static int dogx;
    private static int dogy;
    
    //private static int treatx;
    //private static int treaty;
    
    private int points = 0;
    private static int count = 1;
    
    private static int closexminus;
    private static int closexplus;
    private static int closeyminus;
    private static int closeyplus;
    
    //identify type of game for text area
    //public static String gameIdentifier = "Fetch";
    
    public FetchMiniGame1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fetch");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setFocusable(false);
        jPanel1.setMinimumSize(new java.awt.Dimension(494, 506));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/ballresize93.png"))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/ballresize93.png"))); // NOI18N

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/ballresize93.png"))); // NOI18N

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/ballresize93.png"))); // NOI18N

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/ballresize93.png"))); // NOI18N

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/ballresize93.png"))); // NOI18N

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/ballresize93.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/ballresize93.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/rock_50x50.png"))); // NOI18N
        jLabel13.setFocusable(false);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/grass_1_45x45.png"))); // NOI18N
        jLabel14.setFocusable(false);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/rock_50x50.png"))); // NOI18N
        jLabel15.setAutoscrolls(true);
        jLabel15.setFocusable(false);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/grass_1_45x45.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/grass_1_45x45.png"))); // NOI18N
        jLabel17.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel14)
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel17)
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(86, 86, 86))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel16)
                .addGap(178, 178, 178))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4))
                .addGap(44, 44, 44)
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addComponent(jLabel12)
                .addGap(64, 64, 64)
                .addComponent(jLabel5)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jButton1.setText("Start Game!");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Score: 0");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("You have 20 seconds to get as many balls as you can!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed

    }//GEN-LAST:event_jPanel1KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
     int direction = evt.getKeyCode();
     int locationhor=jLabel1.getLocation().x;
     int locationver=jLabel1.getLocation().y;
     
     dogx = locationhor;
     dogy = locationver;
     
     run();
      
     //debugging
     //System.out.println(dogx + "," + dogy);
     System.out.println(count);
     
     switch(PPRD.identifier) {
         
                case "dog": {
         
                         switch(direction) {
                                case KeyEvent.VK_UP:
                                        
                                    if (jLabel1.getLocation().y<=-300){
                                            jLabel1.setLocation(locationhor+0,locationver-0);
                                        }else{
                                            jLabel1.setLocation(locationhor+0,locationver-10);
                                        }
                                    break;

                                    case KeyEvent.VK_DOWN:
                                    if (jLabel1.getLocation().y>=400){
                                            jLabel1.setLocation(locationhor+0,locationver+0);
                                        }else{
                                           jLabel1.setLocation(locationhor+0,locationver+10);
                                        }
                                    break;

                                    case KeyEvent.VK_RIGHT:
                                    if (jLabel1.getLocation().x>=750){
                                        jLabel1.setLocation(locationhor+0,locationver+0);
                                        }else{
                                        jLabel1.setLocation(locationhor+10,locationver+0);
                                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/transparent_dog_resize_1_75x75_flip.png")));
                                        }
                                    break;

                                    case KeyEvent.VK_LEFT:
                                    if (jLabel1.getLocation().x<=-350){
                                            jLabel1.setLocation(locationhor+10,locationver+0);
                                        }else{
                                        jLabel1.setLocation(locationhor-10,locationver+0);
                                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/transparent_dog_resize_1_75x75 (1).png")));
                                        }
                                    break;  
                                           }
                         break;
                                    }
                    
                case "cat": {
                        
                        switch(direction) {
                                case KeyEvent.VK_UP:
                                        
                                    if (jLabel1.getLocation().y<=-300){
                                            jLabel1.setLocation(locationhor+0,locationver-0);
                                        }else{
                                            jLabel1.setLocation(locationhor+0,locationver-10);
                                        }
                                    break;

                                    case KeyEvent.VK_DOWN:
                                    if (jLabel1.getLocation().y>=400){
                                            jLabel1.setLocation(locationhor+0,locationver+0);
                                        }else{
                                           jLabel1.setLocation(locationhor+0,locationver+10);
                                        }
                                    break;

                                    case KeyEvent.VK_RIGHT:
                                    if (jLabel1.getLocation().x>=750){
                                        jLabel1.setLocation(locationhor+0,locationver+0);
                                        }else{
                                        jLabel1.setLocation(locationhor+10,locationver+0);
                                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/Pixel_pet_cat_flip_75x75.png")));
                                        }
                                    break;

                                    case KeyEvent.VK_LEFT:
                                    if (jLabel1.getLocation().x<=-350){
                                            jLabel1.setLocation(locationhor+10,locationver+0);
                                        }else{
                                        jLabel1.setLocation(locationhor-10,locationver+0);
                                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/Pixel_pet_cat_75x75.png")));
                                        }
                                    break;  
                                           }
                        break;
                    }
                    case "guinea pig": {
                       
                        switch(direction) {
                                case KeyEvent.VK_UP:
                                        
                                    if (jLabel1.getLocation().y<=-300){
                                            jLabel1.setLocation(locationhor+0,locationver-0);
                                        }else{
                                            jLabel1.setLocation(locationhor+0,locationver-10);
                                        }
                                    break;

                                    case KeyEvent.VK_DOWN:
                                    if (jLabel1.getLocation().y>=400){
                                            jLabel1.setLocation(locationhor+0,locationver+0);
                                        }else{
                                           jLabel1.setLocation(locationhor+0,locationver+10);
                                        }
                                    break;

                                    case KeyEvent.VK_RIGHT:
                                    if (jLabel1.getLocation().x>=750){
                                        jLabel1.setLocation(locationhor+0,locationver+0);
                                        }else{
                                        jLabel1.setLocation(locationhor+10,locationver+0);
                                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/pixel_pet_guinea_pig_75x75.png")));
                                        }
                                    break;

                                    case KeyEvent.VK_LEFT:
                                    if (jLabel1.getLocation().x<=-350){
                                            jLabel1.setLocation(locationhor+10,locationver+0);
                                        }else{
                                        jLabel1.setLocation(locationhor-10,locationver+0);
                                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/pixel_pet_guinea_pig_Flip_75x75.png")));
                                        }
                                    break;  
                                           }
                        break;
                    }
                }
    }//GEN-LAST:event_formKeyPressed

    private static int setclosexminus(int xminus) {
        closexminus = xminus - 40;
        return closexminus;
    }
    
    private static int setclosexplus(int xplus) {
        closexplus = xplus + 40;
        return closexplus;
    }
    
    private static int setcloseyminus(int yminus) {
        closeyminus = yminus - 40;
        return closeyminus;
    }
    
    private static int setcloseyplus(int yplus) {
        closeyplus = yplus + 40;
        return closeyplus;
    }
    
    private int randCount(){
         Random rand = new Random();
         int randomcnt = rand.nextInt(8) + 1;
         count = randomcnt;
         return count;
    } 
    
    private void run() {
       if (count == 1) {
            jLabel2.setVisible(true);
            
            int x1 = jLabel2.getLocation().x;
            int y1 = jLabel2.getLocation().y;
            setclosexminus(x1);
            setclosexplus(x1);
            setcloseyminus(y1);
            setcloseyplus(y1);
            if (closeyminus <= dogy && dogy <= closeyplus && closexminus <= dogx && dogx <= closexplus) {
                    System.out.println("boop1");
                    points++;
                    //count++;
                    jLabel3.setText("Points: " + Integer.toString(points));
                    jLabel2.setVisible(false);
                    randCount();
                    //jLabel4.setVisible(true);

        }
       } else if (count == 2) {
            jLabel4.setVisible(true);
            
            int x2 = jLabel4.getLocation().x;
            int y2 = jLabel4.getLocation().y;
            setclosexminus(x2);
            setclosexplus(x2);
            setcloseyminus(y2);
            setcloseyplus(y2);
            if (closeyminus <= dogy && dogy <= closeyplus && closexminus <= dogx && dogx <= closexplus) {
                    System.out.println("boop1");
                    points++;
                    //count++;
                    jLabel3.setText("Points: " + Integer.toString(points));
                    jLabel4.setVisible(false);
                    randCount();
                    //jLabel5.setVisible(true);
                  
           }
       } else if (count == 3) {
            jLabel5.setVisible(true);
            
            int x3 = jLabel5.getLocation().x;
            int y3 = jLabel5.getLocation().y;
            setclosexminus(x3);
            setclosexplus(x3);
            setcloseyminus(y3);
            setcloseyplus(y3);
            if (closeyminus <= dogy && dogy <= closeyplus && closexminus <= dogx && dogx <= closexplus) {
                    System.out.println("boop1");
                    points++;
                    //count++;
                    jLabel3.setText("Points: " + Integer.toString(points));
                    jLabel5.setVisible(false);
                    randCount();
                   // jLabel6.setVisible(true);
            }
        } else if (count == 4) {
            jLabel6.setVisible(true);
             
            int x4 = jLabel6.getLocation().x;
            int y4 = jLabel6.getLocation().y;
            setclosexminus(x4);
            setclosexplus(x4);
            setcloseyminus(y4);
            setcloseyplus(y4);
            if (closeyminus <= dogy && dogy <= closeyplus && closexminus <= dogx && dogx <= closexplus) {
                    System.out.println("boop1");
                    points++;
                    //count++;
                    jLabel3.setText("Points: " + Integer.toString(points));
                    jLabel6.setVisible(false);
                    //jLabel12.setVisible(true);
                    randCount();
                    
        }
       
       } else if (count == 5) {
            jLabel12.setVisible(true);
             
            int x5 = jLabel12.getLocation().x;
            int y5 = jLabel12.getLocation().y;
            setclosexminus(x5);
            setclosexplus(x5);
            setcloseyminus(y5);
            setcloseyplus(y5);
            if (closeyminus <= dogy && dogy <= closeyplus && closexminus <= dogx && dogx <= closexplus) {
                    System.out.println("boop1");
                    points++;
                    //count++;
                    jLabel3.setText("Points: " + Integer.toString(points));
                    jLabel12.setVisible(false);
                    //jLabel8.setVisible(true);
                    randCount();
        }
       } else if (count == 6) {
             jLabel8.setVisible(true);
             
            int x6 = jLabel8.getLocation().x;
            int y6 = jLabel8.getLocation().y;
            setclosexminus(x6);
            setclosexplus(x6);
            setcloseyminus(y6);
            setcloseyplus(y6);
            if (closeyminus <= dogy && dogy <= closeyplus && closexminus <= dogx && dogx <= closexplus) {
                    System.out.println("boop1");
                    points++;
                    //count++;
                    jLabel3.setText("Points: " + Integer.toString(points));
                    jLabel8.setVisible(false);
                    //jLabel9.setVisible(true);
                    randCount();
        }
       } else if (count == 7) {
            jLabel9.setVisible(true);
             
            int x7 = jLabel9.getLocation().x;
            int y7 = jLabel9.getLocation().y;
            setclosexminus(x7);
            setclosexplus(x7);
            setcloseyminus(y7);
            setcloseyplus(y7);
            if (closeyminus <= dogy && dogy <= closeyplus && closexminus <= dogx && dogx <= closexplus) {
                    System.out.println("boop1");
                    points++;
                    //count++;
                    jLabel3.setText("Points: " + Integer.toString(points));
                    jLabel9.setVisible(false);
                    //jLabel10.setVisible(true);
                    randCount();
        }
       }
       else if (count == 8) {
             jLabel10.setVisible(true);
             
            int x8 = jLabel10.getLocation().x;
            int y8 = jLabel10.getLocation().y;
            setclosexminus(x8);
            setclosexplus(x8);
            setcloseyminus(y8);
            setcloseyplus(y8);
            if (closeyminus <= dogy && dogy <= closeyplus && closexminus <= dogx && dogx <= closexplus) {
                    System.out.println("boop1");
                    points++;
                    //count++;
                    jLabel3.setText("Points: " + Integer.toString(points));
                    jLabel10.setVisible(false);
                    randCount();
            }
       }
}
   
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
           switch (PPRD.identifier) {
                   case "dog": {
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/transparent_dog_resize_1_75x75_flip.png")));
                        break;
                   }
                   case "cat": {
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/Pixel_pet_cat_flip_75x75.png")));
                        break;
                   }
                   case "guinea pig": {
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FetchMiniGameImages/pixel_pet_guinea_pig_Flip_75x75.png")));
                        break;
                   }
           }
          
           points = 0;
           count = 1;
           jLabel3.setText("Points: " + points);
           
           jButton1.setVisible(false);
           jLabel2.setVisible(true);
           jLabel4.setVisible(false);
           jLabel5.setVisible(false);
           jLabel6.setVisible(false);
           jLabel12.setVisible(false);
           jLabel8.setVisible(false);
           jLabel9.setVisible(false);
           jLabel10.setVisible(false);
           
            new java.util.Timer().schedule( 
            new java.util.TimerTask() {
            @Override
            public void run() {
                jLabel2.setVisible(false);
                jLabel4.setVisible(false);
                jLabel5.setVisible(false);
                jLabel6.setVisible(false);
                jLabel12.setVisible(false);
                jLabel8.setVisible(false);
                jLabel9.setVisible(false);
                jLabel10.setVisible(false);
                jLabel1.setVisible(false);
                jLabel3.setText("Game Over! Your Score is " + points);
            }
        }, 
        20000 
        );        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        //set random variable
        Random newr = new Random();
        int newpercent = (newr.nextInt(10));
        int finalnum = 2 * points + newpercent;
        
        //debugging
        System.out.println(finalnum);
        
        //set variables
        GUIMock3GUI.totalxp += finalnum;
        GUIMock3GUI.gameIdentifier = "fetch";
        GUIMock3GUI.pointsFetch = points;
        
        int newhappy = newr.nextInt(6) + 5;
        GUIMock3GUI.happy += newhappy;
        
        int newhung = newr.nextInt(11) + 10;
        GUIMock3GUI.hunger -= newhung;
        
        //run setting function
        GUIMock3GUI.endRun();
        
        
        
            new java.util.Timer().schedule( 
            new java.util.TimerTask() {
            @Override
            public void run() {
                GUIMock3GUI.jTextArea1.setText("You just played fetch with your animal and scored " + Integer.toString(points) + " points!");
            }
            }, 
            10000 
            );        
        
        
    }//GEN-LAST:event_formWindowClosing

   
    
    public int getFetchPoints() {
        return points;
    }
    
    public static void main(String args[]) {
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FetchMiniGame1().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
