package maze;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author Amir
 * 
 */

public class FullScreen extends JFrame {
    public FullScreen(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, screenSize.height);
        getContentPane().add(new JLabel("Maze Game"), BorderLayout.NORTH);
    }
}
