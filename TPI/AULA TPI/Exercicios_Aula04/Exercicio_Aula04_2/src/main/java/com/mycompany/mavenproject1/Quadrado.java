/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author Suporte
 */
public class Quadrado {
    private double areaQuadrado;
    private double perimetroQuadrado;

    public double getAreaQuadrado() {
        return areaQuadrado;
    }

    public void setAreaQuadrado(double areaQuadrado) {
        this.areaQuadrado = areaQuadrado;
    }

    public double getPerimetroQuadrado() {
        return perimetroQuadrado;
    }

    public void setPerimetroQuadrado(double perimetroQuadrado) {
        this.perimetroQuadrado = perimetroQuadrado;
    }
    
    public double calcularArea(double ladoA){
        setAreaQuadrado (Math.pow(ladoA,2));
        return getAreaQuadrado();
    }
    
    public double calcularPerimetro(double ladoA){
        setPerimetroQuadrado(4 * ladoA);
        return getPerimetroQuadrado();
    }
    
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null, "Área: " + getAreaQuadrado() + "\n Perímetro: " + getPerimetroQuadrado());   
    }
}
