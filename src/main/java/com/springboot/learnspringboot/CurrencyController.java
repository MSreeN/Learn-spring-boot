package com.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyController {
    @Autowired
    CurrencyServiceConfiguration currencyServiceConfiguration;
    @GetMapping("/currency-config")
    public CurrencyServiceConfiguration getCurrencyProperties(){
        return currencyServiceConfiguration;
    }

}
