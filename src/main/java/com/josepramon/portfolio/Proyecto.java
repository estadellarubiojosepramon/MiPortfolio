package com.josepramon.portfolio;

import java.util.List;

public record Proyecto(
    String titulo,
    String descripcion,
    List<String> tecnologias,
    String urlGitHub,
    String urlDemo
) {}