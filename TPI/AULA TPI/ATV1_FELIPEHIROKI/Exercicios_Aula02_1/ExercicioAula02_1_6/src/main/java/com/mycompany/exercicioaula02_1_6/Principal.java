/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioaula02_1_6;

import javax.swing.JOptionPane;

/**
 *
 * @author tamas
 */
public class Principal {

    public static void main(String[] args) {
        Loja loja = new Loja();
        
        loja.inserirDadosLoja();
        loja.calcularCompraLoja();
        JOptionPane.showMessageDialog(null, loja.mostrarDadosLoja());
    }
}
