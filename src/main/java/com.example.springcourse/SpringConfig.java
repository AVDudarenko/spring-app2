package com.example.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("com.example.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    private Music classicMusic;
    private Music rockMusic;
    private Music popMusic;

    @Bean
    public List<Music> listOfMusicType() {
        // Этот лист неизменяемый (immutable)
        return Arrays.asList(classicMusic, rockMusic, popMusic);
    }
}
