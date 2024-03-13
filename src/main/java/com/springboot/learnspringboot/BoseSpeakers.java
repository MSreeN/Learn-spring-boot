package com.springboot.learnspringboot;

import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers{

    private String name = "Bose";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeSound(){
        return "Bose speakers making sound";
    }
}
