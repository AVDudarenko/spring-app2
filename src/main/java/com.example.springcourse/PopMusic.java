package com.example.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class PopMusic implements Music {

    @Override
    public String getSong() {
        return addListOfSongs();
    }

    @Override
    public String addListOfSongs() {
        List<String> popMusicSongs = new ArrayList<>();
        popMusicSongs.add("Soul");
        popMusicSongs.add("Give it to me");
        popMusicSongs.add("Sera");

        String song = "";
        Random random = new Random();

        for (int i = 0; i < popMusicSongs.size(); i++) {

            song = popMusicSongs.get(random.nextInt(popMusicSongs.size()));
        }
        return song;
    }
}
