package com.example.memorypalace.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping()
    public String hej(){
        return "hejsa venner";
    }
}
