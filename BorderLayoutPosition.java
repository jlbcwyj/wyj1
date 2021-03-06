import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ConcurrentHashMap;

public class BorderLayoutPosition extends JFrame {
    String[] border={BorderLayout.CENTER,BorderLayout.NORTH,BorderLayout.SOUTH,BorderLayout.WEST,BorderLayout.EAST};
    String[] buttonName={"center button","north button","south button","west button","ease button"};
    public BorderLayoutPosition(){
        setTitle("this is are from BJBJGLQ.");
        Container c=getContentPane();
        setLayout(new BorderLayout());
        for (int i=0;i<border.length;i++){
            c.add(border[i],new JButton(buttonName[i]));
        }
        setSize(350,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutPosition();
    }
}
