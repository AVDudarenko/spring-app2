package com.example.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Classic music class
 */
@Component
public class ClassicMusic implements Music {

    public String getSong() {
        return addListOfSongs();
    }

    @Override
    public String addListOfSongs() {
        List<String> classicMusicSongs = new ArrayList<>();
        classicMusicSongs.add("Hungarian Rhapsody");
        classicMusicSongs.add("Sonata N5");
        classicMusicSongs.add("Vivaldi");

        String song = "";
        Random random = new Random();

        for (int i = 0; i < classicMusicSongs.size(); i++) {

            song = classicMusicSongs.get(random.nextInt(classicMusicSongs.size()));
        }
        return song;
    }
}