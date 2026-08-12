/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo4java;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exemplo4Java {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int idade, dias;
        
        System.out.println("Digite a sua idade: ");
        idade = leia.nextInt();
        dias = 365 * idade;
        System.out.println("Você viveu " + dias + " dias");
    }
}
