/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioaula02_2_2;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Quadrado {
    private double numero;
    private double Resultado;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getResultado() {
        return Resultado;
    }

    public void setResultado(double Resultado) {
        this.Resultado = Resultado;
    }
    
    public double calcularQuadrado() {
        setNumero(Double.parseDouble(JOptionPane.showInputDialog("Digite o numero: ")));
        return getNumero();
    }
    
    public void mostrarQuadrado(){
        setResultado (Math.pow(numero, 2));
        JOptionPane.showMessageDialog(null, "O numero " +getNumero()+ "elevado ao quadrado e: " +getResultado());
    }
}
