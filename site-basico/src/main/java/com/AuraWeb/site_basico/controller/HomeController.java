package com.AuraWeb.site_basico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home"; // Nome do arquivo HTML sem a extensão .html
    }

    @GetMapping("/servicos")
    public String servicos() {
        return "servicos"; // Nome do arquivo HTML sem a extensão .html
    }
}

