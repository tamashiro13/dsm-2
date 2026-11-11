/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetorevisao;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        //Instanciar o objeto
        Pessoa pes = new Pessoa();
        int op;
        
        do{
            op= Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção: \n 1-Cadastrar \n 2-Mostrar \n 3-Calcular \n 0-Sair"));
            
            switch(op){
                case 1:
                    pes.cadastrarSystem();
                    pes.cadastrarJOption();
                    break;
                case 2:
                    pes.mostrarSystem();
                    pes.mostrarJOption();
                    break;
                case 3:
                    System.out.println("" + pes.calcularAposentadoriaIdade());
                    JOptionPane.showMessageDialog(null, pes.calcularAposentadoriaIdade());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo Sistema");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Incorreta");
                    break;
            }
        }while(op !=0);
    }
}
