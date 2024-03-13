package com.springboot.learnspringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"com.springboot.learnspringboot.aspects", "com.springboot.learnspringboot"})
public class ConfigClass {

//    @Bean
//    @Primary
//    public BridgeStone bridgeStoneSpeaker(){
//        return new BridgeStone();
//    }
//
//    @Bean
//    @Primary
//    public SonySpeakers sonySpeakers(){
//        return  new SonySpeakers();
//    }
//
//    @Bean
//    @Primary
//    public BoseSpeakers boseSpeakers(){
//        return  new BoseSpeakers();
//    }
}
