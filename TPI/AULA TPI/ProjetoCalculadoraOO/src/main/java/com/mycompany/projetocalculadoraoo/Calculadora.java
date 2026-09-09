/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetocalculadoraoo;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Calculadora {
    private double n1;
    private double n2;
    private double resul;

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getResul() {
        return resul;
    }

    public void setResul(double resul) {
        this.resul = resul;
    }
    
    // método sem parâmetro e sem retorno
    public void somar(){
        setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: ")));
        setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: ")));
        setResul(getN1() + getN2());
        JOptionPane.showMessageDialog(null, "O valor da soma é: " + getResul());
    }
    
    // método com parâmetro e sem retorno
    public void subtrair(double a, double b){
        setResul(a - b);
        JOptionPane.showMessageDialog(null, "O valor da subtração é: " + getResul());
    }
    
    // método com retorno e sem parâmetro
    public double multiplicar(){
        setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: ")));
        setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: ")));
        setResul(getN1() * getN2());
        return getResul();
    }
    
    // método com retorno e com parâmetro
    public double dividir(double a, double b){
        setResul(a / b);
        return getResul();
    }
}
