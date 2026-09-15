/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author Suporte
 */
public class Principal {

    public static void main(String[] args) {
        Quadrado quad = new Quadrado();
        
        int op;
        double ladoA;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n 1-Calcular Área Quadrado \n 2-Calcular Perímetro Quadrado \n 3-Mostrar Valores \n 0-Sair"));
            
            switch(op){
                case 1: 
                    ladoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Lado A: "));
                    quad.calcularArea(ladoA);
                    break;
                case 2: 
                    ladoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Lado A: "));
                    quad.calcularPerimetro(ladoA);
                    break;
                case 3:
                    quad.mostrarValores();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando o programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
                    break;
            }
        }while(op!= 0);
    }
}
