/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1_idade;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Idade {
    private int anoAtual;
    private int anoNasc;
    private int idade;
    private String nome;

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void cadastrarDados(){
        setAnoAtual(Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano Atual:")));
        setAnoNasc(Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano Nascimento:")));
        setNome(JOptionPane.showInputDialog("Digite o Nome:"));
    }
    public void calcularIdade(){
        setIdade(getAnoAtual() - getAnoNasc());
    }
    public void mostrarDados(){
        JOptionPane.showMessageDialog(null, "Ano Atual:" + getAnoAtual() +
                                      "\n Ano Nascimento: " + getAnoNasc() +
                                      "\n Idade: " + getIdade() +
                                      "\n Nome: " + getNome());
    }
}
