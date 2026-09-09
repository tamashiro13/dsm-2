/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_aula03_2;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        Vendedor vend = new Vendedor();
        
        int op;
        
        do{
            op= Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n 1-Nome \n 2-Salário Base \n 3-Valor Vendido \n 4-Calcular Comissão \n 0-Sair"));
            
            switch(op){
                case 1:
                    vend.entrarNome();
                    break;
                case 2:
                    vend.entrarSalarioBase();
                    break;
                case 3:
                    vend.entrarValorVendido();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "O Vendedor " + vend.getNome() + " Teve Salário Final de " + vend.calculoComissao());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando o programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }while(op != 0);
    }
}
