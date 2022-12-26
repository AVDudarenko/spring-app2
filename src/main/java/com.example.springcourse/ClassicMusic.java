package com.example.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music {
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}