
package game;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
public class Open extends JFrame{
    JButton btnplay = new JButton("PLAY");
    public String s5;
   // File f = new File(filename);
    JTextArea name = new JTextArea();
    Container c = this.getContentPane();
    private Image bg;
    private boolean loaded;
    /*File score;
    FileWriter fw;
    PrintWriter pw;
*/
        
    public Open()
    {
     /*   File score = new File("C:\\test\\score.txt");
        try
        {
        
        FileWriter fw = new FileWriter (score) ;
        }
        catch(Exception e)
        {
            
        }
        try
        {
        PrintWriter pw = new PrintWriter(score);
        }
        catch(Exception e)
        {
        
        }*/
     loaded = false;
        this.setTitle("The Runner");
        this.setBounds(200, 200, 500, 510);
        this.setMinimumSize(new Dimension(500,510));
        this.setResizable(false);
        Container c = this.getContentPane();
     loadpics();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btnplay = new JButton("PLAY");
        JLabel lblname = new JLabel("Name");
        JTextField txtname = new JTextField("Enter your name here", 20);
        JPanel bottom = new JPanel();
        bottom.setLayout(new FlowLayout());
        JButton halloffame = new JButton("Hall Of Fame");
        JTextArea name = new JTextArea();
        JPanel s = new JPanel();
        name.setText("THE RUNNER");
        bottom.add(lblname);
        bottom.add(txtname);
        bottom.add(btnplay);
        bottom.add(halloffame);
        c.add(name);
        c.add(bottom,BorderLayout.SOUTH);
        c.add(s,BorderLayout.CENTER);
        btnplay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Play p = new Play();
                p.setVisible(true);
                dispose();
                String s1 = txtname.getText();
                s5=s1;
            }
        });
    }
    
    @Override
    public void paint(Graphics g )
    {
        super.paint(g);

         if(loaded)
        {
        g.drawImage(bg,0,0,null);
        }
       // repaint();
    }

    

public void loadpics()
{
    bg = new ImageIcon("bg-open.jpg").getImage();
    loaded =true;
   // repaint();
    
}
public String nameplayer(){
    return s5;
}


}