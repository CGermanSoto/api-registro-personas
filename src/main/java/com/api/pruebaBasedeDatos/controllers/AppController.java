package com.api.pruebaBasedeDatos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/saludo")
    public String saludo(){
        return "Saludingui";
    }

    @GetMapping
    public String inicio(){
        return "Holaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    }
}
