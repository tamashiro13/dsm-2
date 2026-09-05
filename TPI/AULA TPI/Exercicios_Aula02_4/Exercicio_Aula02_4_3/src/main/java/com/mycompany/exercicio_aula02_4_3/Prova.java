/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_aula02_4_3;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Prova {
    private String nome;
    private double pontos;
    private String nivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    public void nivelProva(){
        setNome(JOptionPane.showInputDialog("Digite o nome: "));
        setPontos(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de pontos: ")));
        if (getPontos() <= 100){
            setNivel("Nível 1");
        }
        else if (getPontos() < 200){
            setNivel("Nível 2");
        }
        else if (getPontos() >= 200){
            setNivel("Nível 3");
        }
    }
    public void listarResultado() {
        JOptionPane.showMessageDialog(null, "Nome: " +getNome() + "\n" + "Pontos: " + getPontos() + "\n" + "Nível: " + getNivel());
    }
}
