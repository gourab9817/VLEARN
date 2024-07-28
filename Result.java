package LoginSystem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

class Result
{
    JFrame frame=new JFrame();
    JLabel welcomelabel=new JLabel();
    public Result(int c)
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        frame.setLayout(null);
        frame.setVisible(true);
        welcomelabel.setBounds(0,0,300,55);
        welcomelabel.setFont(new Font(null,Font.PLAIN,25));
        welcomelabel.setText("RESULT "+c);
        frame.add(welcomelabel);
    }
    
}


