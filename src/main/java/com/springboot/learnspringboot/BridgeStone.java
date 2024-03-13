package com.springboot.learnspringboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BridgeStone implements Tyres {

    private String name = "Bridge Stone";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void rotate(){
        System.out.println("Bridge stone tyres rotating");
    }
}
