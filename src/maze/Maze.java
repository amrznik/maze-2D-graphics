package maze;

import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Maze Game with 2D Graphics
 * 
 * @author Amir
 * 
 */

public class Maze {
    public static void main(String args[]) throws IOException, LineUnavailableException {
        FullScreen f = new FullScreen("");
        f.add(new Ground());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}