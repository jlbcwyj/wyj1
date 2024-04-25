import javax.swing.*;
import java.awt.*;
import java.beans.EventSetDescriptor;
import java.net.URL;

public class MyImageIcon extends JFrame {
    public MyImageIcon(){
        Container container=getContentPane();
        JLabel jl=new JLabel("this is a windows",JLabel.CENTER);
        URL url=MyImageIcon.class.getResource("imageButton.jpg");
        Icon icon=new ImageIcon(url);
        jl.setIcon(icon);
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        jl.setOpaque(true);
        container.add(jl);
        setSize(250,100);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyImageIcon();
    }
}
