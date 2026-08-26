/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoclienteooparret;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        //INSTANCIAR OBJETO cli da classe Cliente
        Cliente cli = new Cliente();
        //Lê o rg para passar por parâmetro
        String rg = JOptionPane.showInputDialog("Digite o RG:");
        //chama o método cadastrar passando o parâmetro rg
        cli.cadastrarCliente(rg);
        
        System.out.println(cli.listarCliente());
        JOptionPane.showMessageDialog(null, cli.listarCliente());
    }
}
