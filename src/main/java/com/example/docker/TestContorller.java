package com.example.docker;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TestContorller {
    
    @GetMapping("test")
    public String test() {
        return "hello test";
    }
    
}
