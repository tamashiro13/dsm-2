/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_aula02_4_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Suporte
 */
public class Principal {

    public static void main(String[] args) {
        Temperatura temp = new Temperatura();
        
        int op;
        
        do{
            op= (Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção: \n 1-Conveter Fahrenheit-Celsius \n 2-Converter Celsius-Fahrenheit \n 0-Sair")));
            switch(op){
                case 1:
                    double f = (Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit: ")));
                    temp.calcularTempCelsius(f);
                    break;
                case 2:
                    double c = (Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius: ")));
                    temp.calcularTempFahrenheit(c);
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
