package com.example.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Classic music class
 */
@Component
@Scope("singleton")
public class ClassicMusic implements Music {

    /**
     * Annotation @PostConstruct initialized resources and ect.
     */
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    /**
     * Annotation @PreDestroy clear resources and ect.
     */
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

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