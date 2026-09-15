/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import javax.swing.JOptionPane;

/**
 *
 * @author Suporte
 */
public class Eleitores {
    private int numeroTotalEleitores;
    private int numeroVotosBrancos;
    private int numeroVotosNulos;
    private int numeroVotosValidos;
    private double percBrancos;
    private double percNulos;
    private double percValidos;

    public int getNumeroTotalEleitores() {
        return numeroTotalEleitores;
    }

    public void setNumeroTotalEleitores(int numeroTotalEleitores) {
        this.numeroTotalEleitores = numeroTotalEleitores;
    }

    public int getNumeroVotosBrancos() {
        return numeroVotosBrancos;
    }

    public void setNumeroVotosBrancos(int numeroVotosBrancos) {
        this.numeroVotosBrancos = numeroVotosBrancos;
    }

    public int getNumeroVotosNulos() {
        return numeroVotosNulos;
    }

    public void setNumeroVotosNulos(int numeroVotosNulos) {
        this.numeroVotosNulos = numeroVotosNulos;
    }

    public int getNumeroVotosValidos() {
        return numeroVotosValidos;
    }

    public void setNumeroVotosValidos(int numeroVotosValidos) {
        this.numeroVotosValidos = numeroVotosValidos;
    }

    public double getPercBrancos() {
        return percBrancos;
    }

    public void setPercBrancos(double percBrancos) {
        this.percBrancos = percBrancos;
    }

    public double getPercNulos() {
        return percNulos;
    }

    public void setPercNulos(double percNulos) {
        this.percNulos = percNulos;
    }

    public double getPercValidos() {
        return percValidos;
    }

    public void setPercValidos(double percValidos) {
        this.percValidos = percValidos;
    }
    
    public void inserirQtdVotos(){
        setNumeroVotosBrancos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Votos Brancos: ")));
        setNumeroVotosNulos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Votos Nulos: ")));
        setNumeroVotosValidos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Votos Válidos: ")));
    };
    
    public void calcularTotalEleitores(){
        setNumeroTotalEleitores(getNumeroVotosBrancos() + getNumeroVotosNulos() + getNumeroVotosValidos());
    }
    
    public void calcularPercentualVotos(){
        setPercBrancos((numeroVotosBrancos*100)/getNumeroTotalEleitores());
        setPercNulos((numeroVotosNulos*100)/getNumeroTotalEleitores());
        setPercValidos((numeroVotosValidos*100)/getNumeroTotalEleitores());
        JOptionPane.showMessageDialog(null, "Total de Eleitores: " + getNumeroTotalEleitores());
        JOptionPane.showMessageDialog(null, "Percentual de Votos Brancos: " +getPercBrancos());
        JOptionPane.showMessageDialog(null, "Percentual de Votos Nulos: " +getPercNulos());
        JOptionPane.showMessageDialog(null, "Percentual de Votos Válidos: " +getPercValidos());
    }
}
