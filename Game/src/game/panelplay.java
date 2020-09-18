
package game;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon.*;
public class panelplay extends JPanel{
    private Square man ;
    public ArrayList<obstacle> list1 = new ArrayList<obstacle>();
    private Random rand = new Random();
    javax.swing.Timer t;
    Image bg ;
    Image obst;
    Image mann;
    boolean loaded;
   // private JPanel range;
    
public panelplay(Square man)
    {
        loaded= false;
        loadpics();
        this.setLayout(null);
        this.man=man;
    }
public void addObstacle(obstacle o )
{
    list1.add(o);
}
    @Override
    public void paint(Graphics g )
    {
        super.paint(g);
        
        if(loaded)
        {
        g.drawImage(bg,0,0,null);
        }
        g.drawImage(mann, man.getX()*dimensions.WIDTH, man.getY()*dimensions.WIDTH, null);
        for (obstacle o : list1) 
        {
            //o.draw(g);
            g.drawImage(obst,o.getX()*dimensions.WIDTH,o.getY()*dimensions.WIDTH,null);
        }
      repaint();
        
    }
    private void loadpics()
    {
         bg = new ImageIcon("bg.jpg").getImage();
         obst = new ImageIcon("obstacle.jpg").getImage();
         mann = new ImageIcon("man.jpg").getImage();
         loaded = true;
         repaint();
    }
    
}
