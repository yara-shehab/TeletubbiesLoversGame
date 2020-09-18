
package game;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;
import javax.swing.ImageIcon.*;
public class obstacle {
    int x,y;
    private Random rand = new Random();
    javax.swing.Timer t;
    //private Image obst;
    //private boolean loaded;
    public obstacle(int x,int y)
    {
        //JPanel obst = new JPanel();
       // loaded = false;
        //loadpic();
        this.x=x;
        this.y=y;
    }

    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }
    public void move()
    {
        x--;
    }
    public void draw (Graphics g)
    {
            int f = rand.nextInt(3);
            g.setColor(Color.red);
            g.fillRect(getX()*dimensions.WIDTH,getY()*dimensions.WIDTH, dimensions.WIDTH,dimensions.WIDTH *3);    
    }
  
}
