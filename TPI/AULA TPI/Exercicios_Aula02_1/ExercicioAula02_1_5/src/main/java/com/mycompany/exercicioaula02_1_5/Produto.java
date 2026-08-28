/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioaula02_1_5;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Produto {
    private String nomeProduto;
    private int quantidade;
    private double valor;
    private double total;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public void cadastrarProduto(int quantidade){
        setNomeProduto (JOptionPane.showInputDialog("Digite o nome do produto: "));
        setQuantidade (setQuantidade);
        setValor (Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: ")));
    }
    public double calcularTotal(){
        setTotal(getValor() * getQuantidade());
        return getTotal();
    }
}
