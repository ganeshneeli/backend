package com.example.datefinder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyController {

    @GetMapping("/")
    public String plusDays(){
        return "27-03-2024";
    }
}

