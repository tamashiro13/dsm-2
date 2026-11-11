/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2_triangulo;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Triangulo {
    private double area;
    private double base;
    private double altura;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void inserirDadosTriangulo(){
        setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura:")));
        setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a Base:")));        
    }
    public void calcularArea(){
        setArea((getAltura() * getBase()) / 2);
    }
    public double mostrarAreaTriangulo(){
        JOptionPane.showMessageDialog(null, "Área Triângulo: " + getArea());
        return getArea();
    }
}
