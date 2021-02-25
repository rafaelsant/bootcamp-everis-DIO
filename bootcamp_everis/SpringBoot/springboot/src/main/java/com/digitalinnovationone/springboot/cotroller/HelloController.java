package com.digitalinnovationone.springboot.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String HelloWorld(){
        return "Hello World";
    }
}
