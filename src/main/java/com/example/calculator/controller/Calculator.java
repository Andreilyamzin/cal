package com.example.calculator.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    @GetMapping("/calculator")
    public String hello(){
        return "Добро пожаловать в калькулятор";
    }


}
