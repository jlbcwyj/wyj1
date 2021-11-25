import javax.swing.*;
import java.awt.*;

public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition(){
        setTitle("this is are LBJGLQ.");
        Container c=getContentPane();
        setLayout(new FlowLayout(2,10,10));
        for(int i=0;i<10;i++){
            c.add(new JButton("botton"+i));
        }
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}
