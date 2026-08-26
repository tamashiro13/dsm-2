/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioaula02_1_4;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        Fornecedores forn = new Fornecedores();
        
        String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto: ");
        forn.cadastrarFornecedor(nomeProduto);
        
        System.out.println(forn.listarFornecedor());
        JOptionPane.showMessageDialog(null, forn.listarFornecedor());
    }
}
