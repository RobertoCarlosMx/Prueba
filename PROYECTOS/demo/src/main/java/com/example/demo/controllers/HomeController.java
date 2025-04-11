package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String mostrarFormulario() {
        return "index"; // busca index.html en /templates
    }

    @GetMapping("/menu")
    public String irAlMenu() {
        return "menu"; // crea también menu.html si deseas redirigir ahí
    }
}

