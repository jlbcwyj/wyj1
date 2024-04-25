import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class JButtonTest extends JFrame {
    public JButtonTest(){
        URL url=JButtonTest.class.getResource("imageButton.jpg");
        Icon icon=new ImageIcon(url);
        setLayout(new GridLayout(3,2,5,5));
        Container c=getContentPane();
        for(int i=0;i<20;i++){
            JButton j=new JButton("button"+i,icon);
            c.add(j);
            if(i%4==0){
                j.setEnabled(false);
            }
        }
        JButton jb=new JButton();
        jb.setMaximumSize(new Dimension(90,30));
        jb.setIcon(icon);
        jb.setHideActionText(true);
        jb.setToolTipText("picture button");
        jb.setBorderPainted(false);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"message");
            }
        });
        c.add(jb);
        setTitle("create text is picture");
        setSize(350,150);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonTest();
    }
}
