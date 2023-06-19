package maze;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * 
 * @author Amir
 * 
 */

public class Player {
    private int tilex, tiley;
    private Image player;

    public Player() {
        ImageIcon img = new ImageIcon(".//resources//Robot.png");
        player = img.getImage();
        tilex = 1;
        tiley = 1;
    }

    public Image getPlayer() {
        return player;
    }

    public int getTileX() {
        return tilex;
    }

    public int getTileY() {
        return tiley;
    }

    public void move(int dx, int dy) {
        tilex += dx;
        tiley += dy;
    }
}
