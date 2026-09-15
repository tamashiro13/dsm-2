/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_aula04_1;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class CustoPiso {
    private double comprimentoComodo;
    private double larguraComodo;
    private double precoporArea;
    private double custoTotalComodo;

    public double getComprimentoComodo() {
        return comprimentoComodo;
    }

    public void setComprimentoComodo(double comprimentoComodo) {
        this.comprimentoComodo = comprimentoComodo;
    }

    public double getLarguraComodo() {
        return larguraComodo;
    }

    public void setLarguraComodo(double larguraComodo) {
        this.larguraComodo = larguraComodo;
    }

    public double getPrecoporArea() {
        return precoporArea;
    }

    public void setPrecoporArea(double precoporArea) {
        this.precoporArea = precoporArea;
    }

    public double getCustoTotalComodo() {
        return custoTotalComodo;
    }

    public void setCustoTotalComodo(double custoTotalComodo) {
        this.custoTotalComodo = custoTotalComodo;
    }
    
    public void inserirValores(){
        setComprimentoComodo (Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do cômodo: ")));
        setLarguraComodo (Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do cômodo: ")));
        setPrecoporArea (Double.parseDouble(JOptionPane.showInputDialog("Digite o preço por área: ")));
    }
    
    public void calcularPrecoArea(){
        setCustoTotalComodo(getComprimentoComodo()*getLarguraComodo()*getPrecoporArea());
    }
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null, "Comprimento Cômodo: " +getComprimentoComodo()+ "\n Largura Cômodo: " + getLarguraComodo() + "\n Preço por área: " + getPrecoporArea()
        + "\n Custo total: " + getCustoTotalComodo());
    }
}
