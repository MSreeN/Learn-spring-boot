package com.springboot.learnspringboot.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
public class AOPTargetClass {

    public void pointCutMethod(int a, Boolean bool){
        System.out.println("This log is from point cut method");
    }
}
