/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo_case_if;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        Media med = new Media();
        
        int op;
        
        // COMANDO REPETIÇÃO DO-WHILE
        do{
        op = (Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção: \n 1-Inserir notas \n 2-Calcular média \n 3-Verificar situação \n 0-Sair")));
        
        switch(op){
                case 1:
                    med.inserirNotas();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, med.calcularMedia());
                    break;
                case 3:
                    med.verificarSituacao();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida");
                    break;
            }
        }while (op != 0);
    }
}
