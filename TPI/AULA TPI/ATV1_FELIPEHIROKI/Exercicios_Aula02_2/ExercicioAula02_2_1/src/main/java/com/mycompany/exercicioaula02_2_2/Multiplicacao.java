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
public class Multiplicacao {
    private int valor;
    private int resultado;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    
    
    public int multiplicacao10(){
        setValor (Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: ")));
        return getValor();
    }
    public void mostrarMultiplicacao() {
        setResultado (getValor() * 10);
        JOptionPane.showMessageDialog (null, "A multiplicacao de" + getValor() + " por 10 e igual a: " + getResultado());
    }
}
