package com.josepramon.portfolio;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    private final List<Proyecto> proyectos = List.of(
        new Proyecto(
            "Proyecto de ejemplo 1",
            "Descripción breve de lo que hace este proyecto.",
            List.of("Java", "Spring Boot", "MySQL"),
            "https://github.com/tu-usuario/proyecto1",
            null
        ),
        new Proyecto(
            "Proyecto de ejemplo 2",
            "Descripción breve de lo que hace este proyecto.",
            List.of("Java", "Maven"),
            "https://github.com/tu-usuario/proyecto2",
            null
        )
    );

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("nombre", "Josep Ramon Estadella Rubió");
        model.addAttribute("rol", "Desarrollador Java | Spring Boot");
        model.addAttribute("proyectos", proyectos);
        return "index";
    }
}