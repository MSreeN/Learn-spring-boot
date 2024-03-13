package com.springboot.learnspringboot.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectsClass {

    @Around("execution(* com.springboot.learnspringboot.aspects.*.*(..))")
    public void aspectAround(ProceedingJoinPoint joinPoint)throws Throwable{
        System.out.println("before point cut execution");
        joinPoint.proceed();
        System.out.println("after pointcut execution");

    }
}
