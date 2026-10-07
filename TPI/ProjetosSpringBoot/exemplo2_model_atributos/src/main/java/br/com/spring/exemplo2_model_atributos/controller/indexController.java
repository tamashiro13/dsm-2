package br.com.spring.exemplo2_model_atributos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("mensagem", "Testando Envio Dados");
        model.addAttribute("ano", 2026);
        return "index";
    }
}
