import javax.swing.*;

public class Engine {
    
    public static void main(String[] args) {
        
        
        JFrame mainFrame = new JFrame("Eric's Game of Life");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mainFrame.setSize(500,500);

        JPanel mainMenu = new JPanel();

        //TODO: Create the main menu for the game.
        mainFrame.add(mainMenu);


        mainFrame.setVisible(true);

        

    }
    
}
