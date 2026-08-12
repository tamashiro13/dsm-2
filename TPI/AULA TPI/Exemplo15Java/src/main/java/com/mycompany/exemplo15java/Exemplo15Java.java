/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo15java;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exemplo15Java {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double vp,tj,m,va;
        
        System.out.println("Digite o valor da parcela: ");
        vp = leia.nextDouble();
        System.out.println("Digite a taxa de juros: ");
        tj = leia.nextDouble();
        System.out.println("Digite os meses de atraso: ");
        m = leia.nextDouble();
        
        va = vp + (vp *(tj / 100) * m);
        System.out.println("O valor da parcela em atraso é: " +va);
    }
}
