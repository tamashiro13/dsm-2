/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo3java;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exemplo3Java {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double n1,n2,n3,n4,n5,n6,m1,m2,s;
        
        System.out.println("Digite sua nota 1: ");
        n1 = leia.nextDouble();
        System.out.println("Digite sua nota 2:");
        n2 = leia.nextDouble();
        System.out.println("Digite sua nota 3:");
        n3 = leia.nextDouble();
        System.out.println("Digite sua nota 4:");
        n4 = leia.nextDouble();
        System.out.println("Digite sua nota 5:");
        n5 = leia.nextDouble();
        System.out.println("Digite sua nota 6:");
        n6 = leia.nextDouble();
        m1 = (n1+n2+n3)/3;
        System.out.println("Sua primeira média é: " + m1);
        m2 = (n4+n5+n6)/3;
        System.out.println("Sua segunda média é: " + m2);
        s = m1 + m2;
        System.out.println("A soma das suas duas médias é: " + s);
    }
}
