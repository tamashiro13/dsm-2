/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_aula02_4_1;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Cliente {
    private String nome;
    private int numeroConta;
    private double saldoMedio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoMedio() {
        return saldoMedio;
    }

    public void setSaldoMedio(double saldoMedio) {
        this.saldoMedio = saldoMedio;
    }
    
    public void cadastrarCliente() {
        setNome(JOptionPane.showInputDialog("Digite o nome do cliente: "));
        setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: ")));
        setSaldoMedio(Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo médio: ")));
    }
    public void verificarSaldo(){
        if (getSaldoMedio() < 1000){
            JOptionPane.showMessageDialog(null, getNome()+ " da conta número " +getNumeroConta() + " é um Cliente Comum.");
        }else if (getSaldoMedio() >= 1000 && (getSaldoMedio() < 2500)) {
            JOptionPane.showMessageDialog(null, getNome()+ " da conta número " +getNumeroConta() + " é um Cliente Prata.");
        }else if (getSaldoMedio() >= 2500){ 
            JOptionPane.showMessageDialog(null, getNome()+ " da conta número " +getNumeroConta() + " é um Cliente Ouro.");
        }
    }
}
