/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPRpackage;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Tessa
 */
public class Maze {
public int[][] map=new int[20][20];


public Maze(){
map[0] =new int[]{0,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1};
map[1] =new int[]{0,0,0,1,1,0,0,1,1,0,0,0,0,0,0,0,1,1,0,1,1};
map[2] =new int[]{0,1,0,1,0,0,1,1,1,1,1,1,1,1,1,0,1,0,0,1,1};
map[3 ]=new int[]{0,1,0,1,1,0,1,1,0,0,0,0,0,0,1,0,1,1,0,1,1};
map[4] =new int[]{0,1,0,0,0,0,1,1,0,1,1,1,0,1,1,0,1,1,0,1,1};
map[5] =new int[]{0,1,1,1,1,0,1,1,0,1,0,1,0,0,0,0,0,0,0,1,1};
map[6] =new int[]{0,0,0,1,1,0,0,0,0,0,0,1,0,1,1,1,1,1,0,1,1};
map[7] =new int[]{1,1,0,0,1,1,1,0,1,1,1,1,0,1,1,1,1,1,0,1,1};
map[8] =new int[]{1,1,1,0,0,0,1,0,0,0,0,1,0,0,0,0,1,1,0,1,1};
map[9] =new int[]{1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,0,0,0,1,1,1};
map[10]=new int[]{1,0,0,0,0,0,0,0,0,1,1,1,1,0,1,0,1,0,1,1,1};
map[11]=new int[]{0,0,1,1,1,1,1,0,1,1,0,0,0,0,1,0,1,0,0,1,1};
map[12]=new int[]{1,0,1,1,0,0,0,0,1,1,0,1,1,1,1,0,1,1,0,1,1};
map[13]=new int[]{1,0,0,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,1};
map[14]=new int[]{1,0,1,1,0,0,0,1,1,0,1,1,1,1,1,1,1,0,1,1,1};
map[15]=new int[]{1,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,1,1,1,0,1};
map[16]=new int[]{1,0,0,1,0,0,0,0,0,0,1,1,1,0,1,0,1,1,0,0,1};
map[17]=new int[]{1,0,1,1,0,1,1,1,1,0,0,0,1,0,1,1,1,0,0,1,1};
map[18]=new int[]{0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,1,1};
map[19]=new int[]{1,1,1,1,1,1,1,1,1,9,1,1,1,1,1,1,1,1,1,1,1};


}

public int[][] getMaze(){
    return map;
}


       
}

