/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_package;

import java.io.File;
import java.io.InputStream;
import javax.swing.JOptionPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author JOscar
 */
public class AudiosPlayer {

    InputStream song;
    public static MediaPlayer mediaPlayer;

    public AudiosPlayer(String filePath) {
        try {
            // Initializing the toolkit
            com.sun.javafx.application.PlatformImpl.startup(()->{});
            // Creating the song and playing it
            File f = new File(filePath);
            Media hit = new Media(f.toURI().toString());
            mediaPlayer = new MediaPlayer(hit);
            mediaPlayer.play();
            // exit from the toolkit
            //com.sun.javafx.application.PlatformImpl.exit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: in Audiosplayer class, " + e);
        }
    }
    
    /**
     * Pause the song method
     */
    public void pauseSong() {
        mediaPlayer.pause();
    }
    
    /**
     * Resume the song method
     */
    public void resumeSong() {
        mediaPlayer.play();
    }
    
    /**
     * Stop the song method
     */
    public void stopSong() {
        mediaPlayer.stop();
    }
    
    /**
     * Dispose the song method, it is used to open a new song
     */
    public void disposeSong() {
        mediaPlayer.dispose();
    }

}
