package edu.eci.ieti.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/api")
    public String get() {
        return "Gabriela Castro Santamaria";
    }
}
