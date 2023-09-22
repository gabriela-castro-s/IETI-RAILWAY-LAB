package edu.eci.ieti.controller.health;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String get() {
        return "Gabriela Castro Santamaria";
    }
}
