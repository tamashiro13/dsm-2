/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo2java;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exemplo2Java {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double n1,n2,a,s,m,d;
        
        System.out.println("Digite seu primeiro número: ");
        n1 = leia.nextDouble();
        System.out.println("Digite seu segundo número: ");
        n2 = leia.nextDouble();
        a = n1 + n2;
        s = n1 - n2;
        m = n1 * n2;
        d = n1 / n2;
        System.out.println("O valor da sua adição é: " + a);
        System.out.println("O valor da sua subtração é: " + s);
        System.out.println("O valor da sua multiplicação é: " + m);
        System.out.println("O valor da sua divisão é:" + d);
    }
}
