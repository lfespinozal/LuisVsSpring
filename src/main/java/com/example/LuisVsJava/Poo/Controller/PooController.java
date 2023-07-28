package com.example.LuisVsJava.Poo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/poo")
public class PooController {

    @RequestMapping("/test")
    public String testController() {
        return "ok";
    }
    
}
