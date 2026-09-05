/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_aula02_4_5;

import javax.swing.JOptionPane;

/**
 *
 * @author Suporte
 */
public class Principal {

    public static void main(String[] args) {
        Combustivel comb = new Combustivel();
        
        int op;
        double km, valorComb;
        
        do{
           op = (Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção: \n 1-Álcool \n 2-Gasolina \n 0-Sair")));
           switch(op){
                case 1:
                    km = (Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de KM rodados: ")));
                    valorComb =(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do combustível: ")));
                   comb.calcularLitrosAlcool(km);
                   comb.calcularTotalGasto(valorComb);
                   break;
                case 2:
                    km = (Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de KM rodados: ")));
                    valorComb =(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do combustível: ")));
                   comb.calcularLitrosGasolina(km);
                   comb.calcularTotalGasto(valorComb);
                   break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
           }
        }while (op != 0);
    }
}
