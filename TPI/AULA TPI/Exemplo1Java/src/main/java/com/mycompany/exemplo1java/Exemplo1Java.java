/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo1java;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exemplo1Java {

    public static void main(String[] args) {
        //COMANDO PARA DAR ENTRADA DE DADOS
        Scanner leia = new Scanner(System.in);
        //DECLARAR VARIÁVEIS
        double nota1, nota2, media;
        String aluno;
        //COMANDO PARA MOSTRAR MENSAGEM
        System.out.println("Digite o nome do aluno: ");
        aluno = leia.next();
        System.out.println("Digite a primeira nota: ");
        nota1 = leia.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = leia.nextDouble();
        media = (nota1+nota2)/2;
        System.out.println("A média do aluno " + aluno + " é " + media);
    }
}
