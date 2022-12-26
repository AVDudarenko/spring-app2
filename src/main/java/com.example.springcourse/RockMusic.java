package com.example.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Rock music class
 */
@Component
public class RockMusic implements Music {
    public String getSong() {
        return addListOfSongs();
    }

    @Override
    public String addListOfSongs() {
        List<String> rockMusicSongs = new ArrayList<>();
        rockMusicSongs.add("Bohemian Rhapsody");
        rockMusicSongs.add("Fear of the dark");
        rockMusicSongs.add("Enter the sandman");

        String song = "";
        Random random = new Random();

        for (int i = 0; i < rockMusicSongs.size(); i++) {

            song = rockMusicSongs.get(random.nextInt(rockMusicSongs.size()));
        }

        return song;
    }
}