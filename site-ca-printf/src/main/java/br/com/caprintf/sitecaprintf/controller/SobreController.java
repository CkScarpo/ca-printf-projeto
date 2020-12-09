package br.com.caprintf.sitecaprintf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SobreController {
    
    @GetMapping("/sobre")
    public String sobre() {
        return "sobre";
    }
}
