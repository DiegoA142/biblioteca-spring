package com.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Restcontroller
@RequestMapping("/api")

public class HolaMundoController {

    @GetMapping("/hola")
    public String libro() {
        return "Hola Mundo";
    }
}
