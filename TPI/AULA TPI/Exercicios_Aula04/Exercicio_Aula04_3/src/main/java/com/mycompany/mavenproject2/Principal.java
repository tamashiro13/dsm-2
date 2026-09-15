/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import javax.swing.JOptionPane;

/**
 *
 * @author Suporte
 */
public class Principal {

    public static void main(String[] args) {
        Eleitores eleit = new Eleitores();
        
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n 1-Inserir Quantidade de Votos \n 2-Calcular Total Eleitores \n 3-Calcular Percentual Votos \n 0-Sair"));
            switch(op){
                case 1:
                    eleit.inserirQtdVotos();
                    break;
                case 2:
                    eleit.calcularTotalEleitores();
                    break;
                case 3:
                    eleit.calcularPercentualVotos();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando o programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
                    break;
            }
        }while(op != 0);
    }
}
