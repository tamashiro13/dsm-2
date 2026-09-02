/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_aula02_4_2;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class OlimpiadaMatematica {
    private String nome;
    private String endereco;
    private double media;
    private double notamenor;
    private double notamaior;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getNotamenor() {
        return notamenor;
    }

    public void setNotamenor(double notamenor) {
        this.notamenor = notamenor;
    }

    public double getNotamaior() {
        return notamaior;
    }

    public void setNotamaior(double notamaior) {
        this.notamaior = notamaior;
    }
    
    public void calcularMedia(){
        setNome(JOptionPane.showInputDialog("Digite o nome: "));
        setEndereco(JOptionPane.showInputDialog("Digite o endereço: "));
        setNotamenor(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota menor: ")));
        setNotamaior(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota maior: ")));
        setMedia((getNotamenor() + getNotamaior()) / 2);
    }
    
    public void verificarMedia(){
        if(getMedia() > 9) {
            JOptionPane.showMessageDialog(null, "Aluno Inscrito" + "\n" + "Aluno: " +getNome()+ "\n" + "Endereço: " +getEndereco());
        }else{
            JOptionPane.showMessageDialog(null, "Média Insuficiente" + "\n" + "Aluno: " +getNome() + "\n" + "Endereço: " +getEndereco());
        }
    }
}
