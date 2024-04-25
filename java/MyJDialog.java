import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyJDialog extends JDialog {
    public MyJDialog(){
        super(new MyFrame(),"this is 1st.",true);
        Container container=getContentPane();
        container.add(new JLabel("this is a text."));
        setSize(100,100);
    }

    public static void main(String[] args) {
        new MyJDialog();
    }
}
class MyFrame extends JFrame{
    public MyFrame(){
        Container container=getContentPane();
        container.setLayout(null);
        JLabel jl=new JLabel("this is a froam windows.");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        JButton bl=new JButton("this is message");
        bl.setBounds(10,10,100,21);
        bl.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e){
                new MyJDialog().setVisible(true);
            }
        });
        container.add(bl);
        container.setBackground(Color.BLUE);
        setSize(200,200);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

    }
}
