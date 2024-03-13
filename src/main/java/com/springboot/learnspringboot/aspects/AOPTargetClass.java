package com.springboot.learnspringboot.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
public class AOPTargetClass {

    public void pointCutMethod(){
        System.out.println("This log is from point cut method");
    }
}
