import java.awt.* ; 
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.* ;

public class mine {
    
    JFrame frame = new JFrame("Window") ;
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();

    int width = 500;
    int height = 500 ;
    
    mine(){
        frame.setVisible(true);
        frame.setSize(width,height);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setFont(new Font("Aerial",Font.BOLD,25));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("HELLO");
        textLabel.setOpaque(true);

        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel) ;
    }
}
