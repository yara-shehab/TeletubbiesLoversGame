
package game;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer.*;
import javax.swing.ImageIcon.*;
public class Play extends JFrame{
    private Random rand = new Random();
    private Image bg;
    private boolean loaded;
    static String num="0";
    JTextArea actualscore;
public Play()    
{
    this.setTitle("The Runner");
    this.setBounds(200, 200, dimensions.PWIDTH*dimensions.WIDTH,((dimensions.PWIDTH*4)+(32)));
    this.setMaximumSize(new Dimension(dimensions.PWIDTH*dimensions.WIDTH,dimensions.PWIDTH*4));
    this.setResizable(false);
    JPanel bottom = new JPanel();
    JLabel score = new JLabel("Score :");
    JTextArea actualscore = new JTextArea();
    actualscore.setText("0");
    loaded = false;
    javax.swing.Timer t;
    javax.swing.Timer t1;

    Container c = this.getContentPane();
    Square man = new Square(dimensions.PWIDTH/2,dimensions.PHEIGHT/2);
    int y = rand.nextInt(3);
    obstacle o = new obstacle(dimensions.PWIDTH-2,y);
    panelplay p = new panelplay(man);
    p.list1.add(o);
        p.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e)
        {
            if(e.getKeyCode()==KeyEvent.VK_UP)
            {
                int z = man.getY();
                if(z>0)
                {
                man.setY(--z);
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_DOWN)
            {
                int z = man.getY();
                if(z<4)
                {
                man.setY(++z);
                }
            }
           
        }
});
        p.setFocusable(true);
    t1 = new javax.swing.Timer(700, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
          int z = rand.nextInt(3);
          p.list1.add(new obstacle (dimensions.PWIDTH-2,z));  
          String s = actualscore.getText();
                int a = Integer.parseInt(s);
                a+=1;
                String f = a+"";
                actualscore.setText(f);
        }
    });
    t = new javax.swing.Timer(dimensions.DELAY, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            for (obstacle o : p.list1)  
            {
                o.move();
                
                
            if(man.hasCollision(o.getX(),o.getY()))
            {
                t1.stop();
                num = actualscore.getText();
            JOptionPane.showMessageDialog(null, "Game Over!");  
            
            System.exit(0);
            }
            else if(man.hasCollision(o.getX(),o.getY()+1))
            {
                t1.stop();
                 num = actualscore.getText();

                JOptionPane.showMessageDialog(null, "Game Over!");  
                System.exit(0);
            }
            else if(man.hasCollision(o.getX(),o.getY()+2))
            {
                t1.stop();
                 num = actualscore.getText();
                JOptionPane.showMessageDialog(null, "Game Over!");  
                System.exit(0);
            }
            else if(o.getY()==0)
            {
                if(man.hasCollision(o.getX(),(o.getY()+1))|| man.hasCollision(o.getX(),(o.getY()+2)))
                {
                     t1.stop();
                num = actualscore.getText();

                     JOptionPane.showMessageDialog(null, "Game Over!");  
                System.exit(0);
                }
            }
            t1.start();
          //  p.repaint();
            
            }
            }
        
    });
   bottom.add(score);
   bottom.add(actualscore);
   t.start();
   c.add(p);
   c.add(bottom,BorderLayout.SOUTH);
}

public static String getnum()
{
    return num;
}

    


}