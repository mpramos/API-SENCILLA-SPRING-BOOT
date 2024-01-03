package com.exampleOne.practiceOne;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class Hola {
    @GetMapping("/hola")
    public String saludar (){
        return "Hola esta es mi primera aplicacion en Spring Boot";
    }
}
