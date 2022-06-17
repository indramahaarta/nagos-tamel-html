package com.hackathon.nagostamel.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "")
public class MainController {
    @GetMapping(path = "")
    public String mainPage(Model model) {
        model.addAttribute("message", "Hello, Nagos Tamel!!");
        return "main";
    }
}
