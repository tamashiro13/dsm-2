/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioaula02_1_6;

import javax.swing.JOptionPane;

/**
 *
 * @author tamas
 */
public class Loja {
    private String razaoSocial;
    private String cpfCliente;
    private double valorCompra;
    private int qtdItensComp;
    private double valorTotalCompra;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getQtdItensComp() {
        return qtdItensComp;
    }

    public void setQtdItensComp(int qtdItensComp) {
        this.qtdItensComp = qtdItensComp;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }
    public void inserirDadosLoja() {
        setRazaoSocial (JOptionPane.showInputDialog("Digite a razao social: "));
        setCpfCliente (JOptionPane.showInputDialog("Digite o CPF do cliente: "));
        setValorCompra (Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra: ")));
        setQtdItensComp (Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de itens comprados: ")));
    }
    public double calcularCompraLoja() {
        setValorTotalCompra(getValorCompra() * getQtdItensComp());
        return getValorTotalCompra();
    }
    public String mostrarDadosLoja(){
        return "Razao social: " + getRazaoSocial() + "\n" +
               "CPF cliente: " +getCpfCliente() + "\n" +
               "Valor compra: " +getValorCompra() + "\n" +
               "Quantidade de itens comprados: " +getQtdItensComp() + "\n" +
               "Valor total da compra: "+ getValorTotalCompra();
    }
}
