/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo12java;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exemplo12Java {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int n1,n2,d,t;
        
        System.out.println("Digite o número um: ");
        n1 = leia.nextInt();
        System.out.println("Digite o número dois: ");
        n2 = leia.nextInt();
        d = n1 * 2;
        t = n2 * 3;
        
        System.out.println("O dobro do número " + n1 + " é " + d);
        System.out.println("O triplo do número " + n2 + " é " + t);
    }
}
