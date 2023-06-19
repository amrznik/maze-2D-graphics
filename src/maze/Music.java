package maze;

import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

/**
 * 
 * @author Amir
 * 
 */

// To have a background music, add a music (music.wav) to the resources and uncomment lines for the object of Music in Ground.java
 public class Music {
    public Music() throws IOException, LineUnavailableException {
        // KeyListener s;

        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(
                    new File(".//resources//music.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        } catch (UnsupportedAudioFileException uae) {
            System.out.println(uae);
        } catch (IOException ioe) {
            System.out.println(ioe);
        } catch (LineUnavailableException lua) {
            System.out.println(lua);
        }
    }

}
