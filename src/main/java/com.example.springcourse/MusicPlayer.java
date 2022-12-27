package com.example.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

/**
 * Class
 */
@Component
public class MusicPlayer {

    /**
     * Annotation Value inject value from musicPlayer.properties file in variable nameOfPlayer
     */
    @Value("${musicPlayer.name}")
    private String nameOfPlayer;

    @Value("${musicPlayer.volume}")
    private int volume;

    private final List<Music> listOfMusicType;

    /**
     * Constructor which said what bean we need
     *
     * @param listOfMusicType contains types of music
     */
    @Autowired
    public MusicPlayer(List<Music> listOfMusicType) {
        this.listOfMusicType = listOfMusicType;
    }

    /**
     * Method for playing music
     *
     * @return music song
     */
    public String playMusic() {
        Random random = new Random();

        return "Playing: " + listOfMusicType.get(random.nextInt(listOfMusicType.size())).getSong()
                + ", with volume: " + this.volume + ", name of player: " + this.nameOfPlayer;
    }
}