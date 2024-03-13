package com.springboot.learnspringboot;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Lazy
public class PrototypeExample {

    PrototypeExample(){
        System.out.println("Prototype Bean has been initiated");
    }
}
