/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioaula02_1_2;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Dobro {
    private double numero;
    private double calculo;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }
    
    public void calcularDobro(){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        setNumero (leia.nextDouble());
        setCalculo (getNumero()*2);
        System.out.println("O dobro eh: " + getCalculo());
    }
}
