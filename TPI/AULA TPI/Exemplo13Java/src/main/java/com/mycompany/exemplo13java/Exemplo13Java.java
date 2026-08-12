/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo13java;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exemplo13Java {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double n1,q;
        
        System.out.println("Digite o número: ");
        n1 = leia.nextDouble();
        q = Math.pow(n1,2);
        System.out.println("O número " + n1 + " elevado ao quadrado é: " +q);
    }
}
