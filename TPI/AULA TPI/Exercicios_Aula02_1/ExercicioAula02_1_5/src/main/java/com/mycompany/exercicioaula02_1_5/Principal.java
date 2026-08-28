/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioaula02_1_5;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        Produto prod = new Produto();
        
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));
        prod.cadastrarProduto(quantidade);
        
        double total = prod.calcularTotal();
        JOptionPane.showMessageDialog(null, "Total: " + total);
}
}
