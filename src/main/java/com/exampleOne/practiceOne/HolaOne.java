package com.exampleOne.practiceOne;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HolaOne {

    @GetMapping("/app/foo")
    public Map<String,String> foo(){
        Map<String,String> json= new HashMap<>();
        json.put("message","Hola mundo esta es mi prierma aplicacion en spring boot apir rest");
        json.put("message","Hola mundo....");

        return json;
    }
}
