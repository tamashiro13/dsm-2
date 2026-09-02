/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicioaula02_1_3;
import javax.swing.JOptionPane;
/**
 *
 * @author fatec-dsm2
 */
public class Principal {
public static void main(String[] args) {
    Passagem pass = new Passagem();
    
    pass.cadastrarDadosPassageiro(); 
    pass.cadastrarDadosPassagem();
    
    System.out.println(pass.mostrarDadosPassageiro());
    JOptionPane.showMessageDialog(null, pass.mostrarDadosPassageiro());
    
    pass.mostrarDadosPassagem();
}
}