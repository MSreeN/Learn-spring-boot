package com.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class VehicleServices {

    @Autowired
    @Qualifier("sonySpeakers")
    private Speakers speakers;

    @Autowired
    private Tyres tyres;

    public String playMusic(){
        return speakers.makeSound();
    }

    public void moveVehicle(){
        tyres.rotate();
    }
}
