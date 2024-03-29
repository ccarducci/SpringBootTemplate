package com.crick.artcomm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProgettiController {

    // inject via application.properties
    @Value("${welcome.message}")
    private String message;
	
    private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
    
    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("message", message);
        model.addAttribute("tasks", tasks);
        return "index"; //view
    }
    
    @GetMapping("/user")
    public String user(Model model) {
        model.addAttribute("message", message);
        model.addAttribute("tasks", tasks);
        return "index"; //view
    }
}
