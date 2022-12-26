package com.example.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Class
 */
@Component
public class MusicPlayer {
    private final Music rockMusic;
    private final Music classicMusic;

    /**
     * Constructor which said what bean we need
     *
     * @param rockMusic
     * @param classicMusic
     */
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic, @Qualifier("classicMusic") Music classicMusic) {
        this.rockMusic = rockMusic;
        this.classicMusic = classicMusic;
    }

    /**
     * Method for playing music
     *
     * @param musicType contains type of music
     * @return music song
     */
    public String playMusic(MusicType musicType) {
        switch (musicType) {
            case ROCK -> {
                return "Playing: " + rockMusic.getSong();
            }
            case CLASSIC -> {
                return "Playing: " + classicMusic.getSong();
            }
            default -> {
                return "No songs available";
            }
        }
    }
}