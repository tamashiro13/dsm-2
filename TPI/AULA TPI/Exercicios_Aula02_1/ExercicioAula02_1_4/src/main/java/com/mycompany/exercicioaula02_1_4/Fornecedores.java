/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioaula02_1_4;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Fornecedores {
    private String nomeFornecedor;
    private String nomeProduto;
    private String descricaoProduto;

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    public void cadastrarFornecedor(String nomeProduto) {
        setNomeFornecedor (JOptionPane.showInputDialog("Digite o nome do fornecedor: "));
        setNomeProduto(nomeProduto);
        setDescricaoProduto (JOptionPane.showInputDialog("Digite a descrição do produto: "));
    }
    public String listarFornecedor(){
        return "Nome do Fornecedor: " + getNomeFornecedor() + "\n" +
               "Nome do Produto: " + getNomeProduto() + "\n" +
               "Descrição do Produto: " +getDescricaoProduto();
    }
}
