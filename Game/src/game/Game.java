
package game;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;



class dimensions{
    public static final int PWIDTH = 30;
    public static final int PHEIGHT = 4;
    public static final int WIDTH = 20;
    public static final int DELAY = 200;
    //public static final int MAX_LEVEL = 30;
}
class Square {
    private int x;
    private int y ;
    public Square(int x,int y )
    {
        this.x=x;
        this.y=y;
    }
    public int getX()
    {
        return this.x;
    }
    public boolean hasCollision(int x,int y )
    {
        if(this.getY()==y&&this.getX()==x)
        {
        return true;
        }
    
        return false;
}
    public void moveUP()
    {
        y++;
    }
    public void moveDOWN()
    {
        y--;
    }
    public int getY()
    {
        return this.y;
    }
    public void setX(int x)
            
    {
        this.x=x;
    }
    public void setY(int y)
            
    {
        this.y=y;
    }
    
    public void draw(Graphics g)
    {
        g.setColor(Color.BLUE);
        g.fillRect(getX()*dimensions.WIDTH, getY()*dimensions.WIDTH, dimensions.WIDTH,dimensions.WIDTH );
    }

    
}

public  class Game{

        
        public static void main(String[] args) throws IOException{
            Open o = new Open();
            o.setVisible(true);
            File file = new File("C:\\test\\score.txt");
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(file);
            pw.println("Name :"+ o.nameplayer() + "score :"+ Play.getnum());
            fw.close();
            pw.close();
        }

       
    
}
