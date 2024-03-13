package com.springboot.learnspringboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers  implements  Speakers{
    String name = "Sony";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeSound(){
        return "Sony speakers making sound";
    }
}
