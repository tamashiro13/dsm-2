package br.com.spring.Hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class indexController {
    @GetMapping("/")
    public String abrirFormulario() {return "cadastro";}
    @PostMapping("/reservas")
    public String salvar(
            @RequestParam ("nome") String nome,
            @RequestParam ("checkin") String checkin,
            @RequestParam ("checkout") String checkout,
            @RequestParam ("tipoQuarto") String tipoQuarto,
            @RequestParam ("quantidadeHospedes") int quantidadeHospedes,
            @RequestParam ("cafeManha") String cafeManha,
            @RequestParam ("estacionamento") String estacionamento,
            @RequestParam ("formaPagamento") String formaPagamento,
            @RequestParam ("valorDiaria") double valorDiaria,
            Model model
    ){
        model.addAttribute("n", nome);
        model.addAttribute("i", checkin);
        model.addAttribute("o", checkout);
        model.addAttribute("t", tipoQuarto);
        model.addAttribute("q", quantidadeHospedes);
        model.addAttribute("c", cafeManha);
        model.addAttribute("e", estacionamento);
        model.addAttribute("f", formaPagamento);
        model.addAttribute("v", valorDiaria);
        model.addAttribute("sucesso", true);
        return "cadastro";
    }
}
