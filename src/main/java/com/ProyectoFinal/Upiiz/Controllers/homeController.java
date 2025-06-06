package com.ProyectoFinal.Upiiz.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    @GetMapping
    public String home() {
        return "index";
    }
    @GetMapping("/carreras")
    public String carreras() {
        return "listado-carrera";
    }
    @GetMapping("/aspirantes")
    public String aspirantes() {
        return "listado_aspirantes";
    }
}
