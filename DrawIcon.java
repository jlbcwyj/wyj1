import javax.swing.*;
import java.awt.*;
import java.util.GregorianCalendar;

public class DrawIcon implements Icon {
    private int width;
    private int height;
    public int getIconHeight(){
        return this.height;
    }
    public int getIconWidth(){
        return this.width;
    }
    public DrawIcon(int widht,int height){
        this.width=widht;
        this.height=height;
    }
    public void paintIcon(Component arg0, Graphics arg1, int x, int y){
        arg1.fillOval(x,y,width,height);
    }

    public static void main(String[] args) {
        DrawIcon icon=new DrawIcon(30,30);
        JLabel jl=new JLabel("test",icon,SwingConstants.CENTER);
        JFrame jf=new JFrame();
        Container c=jf.getContentPane();
        c.add(jl);
        jf.setSize(100,100);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

}
