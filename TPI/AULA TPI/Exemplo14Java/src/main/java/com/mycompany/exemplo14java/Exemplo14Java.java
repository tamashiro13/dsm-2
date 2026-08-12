/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo14java;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exemplo14Java {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int qv,st;
        
        System.out.println("Digite a quantidade de móveis vendidos: ");
        qv = leia.nextInt();
        st = 1000 + (50*qv);
        System.out.println("O salário total desse funcionário é: " +st);
    }
}
