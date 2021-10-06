import javax.swing.*;
import java.awt.*;

public class Engine {
    
    public static void main(String[] args) {
        //TODO:Implement the JFrame
        
        JFrame mainFrame = new JFrame("Eric's Game of Life");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mainFrame.setSize(500,500);

        mainFrame.getContentPane().add(new JLabel("Destroy all Humans",SwingConstants.CENTER));
        mainFrame.setVisible(true);

    }
    
}
