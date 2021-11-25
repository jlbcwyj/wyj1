import javax.swing.*;
import java.awt.*;

public class GridLayoutPosition extends JFrame {
    public GridLayoutPosition(){
        Container c=getContentPane();
        setLayout(new GridLayout(7,3,5,5));
        for(int i=0;i<20;i++){
            c.add(new JButton("button"+i));
        }
        setSize(300,300);
        setTitle("this is fram grid BJ.");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridLayoutPosition();
    }
}
