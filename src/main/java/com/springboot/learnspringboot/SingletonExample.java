package com.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingletonExample {

    SingletonExample(){}
    @Autowired
    SingletonExample(PrototypeExample prototypeExample){
        System.out.println("Singleton bean has been initiated");
    }
}
