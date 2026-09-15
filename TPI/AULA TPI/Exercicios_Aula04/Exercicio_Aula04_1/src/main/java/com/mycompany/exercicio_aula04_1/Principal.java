/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_aula04_1;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        CustoPiso piso = new CustoPiso();
        
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n 1-Inserir Valores do Cômodo \n 2-Calcular Preço por Área \n 3-Mostrar Valores \n 0-Sair"));
            
            switch(op){
                case 1:
                    piso.inserirValores();
                    break;
                case 2:
                    piso.calcularPrecoArea();
                    break;
                case 3:
                    piso.mostrarValores();
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
