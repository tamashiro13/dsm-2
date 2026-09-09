/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_aula03_2;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author fatec-dsm2
 */
public class Vendedor {
    private String nome;
    private double salarioBase;
    private double valorVendido;
    private double novoSalario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }
    
    public void entrarNome(){
        setNome (JOptionPane.showInputDialog("Digite o nome: "));
    }
    
    public void entrarSalarioBase(){
        setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base: ")));
    }
    
    public void entrarValorVendido(){
        setValorVendido(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor vendido: ")));
    }
    
    public double calculoComissao(){
        setNovoSalario(((getValorVendido()*10)/100)+getSalarioBase());
        return getNovoSalario();
    }
}
