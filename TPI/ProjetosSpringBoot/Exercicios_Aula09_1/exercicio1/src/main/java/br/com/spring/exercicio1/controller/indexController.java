package br.com.spring.exercicio1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class indexController {
    @GetMapping("/eventos")
    public String abrirFormulario(){
    return "cadastro";
    }
    @PostMapping("/checkin")
    public String salvar(
            @RequestParam("data") String data,
            @RequestParam("tipo") String tipo,
            @RequestParam("quantidade") int quantidade,
            @RequestParam("meia") String meia,
            Model model
    ){
        model.addAttribute("d", data);
        model.addAttribute("t", tipo);
        model.addAttribute("q", quantidade);
        model.addAttribute("m" ,meia);
        model.addAttribute("sucesso", true);
        return "cadastro";
    }
}
