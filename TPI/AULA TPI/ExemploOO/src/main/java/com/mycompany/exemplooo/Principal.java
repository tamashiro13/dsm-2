/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplooo;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        //INSTANCIAR OBJETO usu
        Usuario usu = new Usuario();
        
        //PASSAR OS DADOS PARA CLASSE USUARIO
//        usu.setNome("Felipe Hiroki");
//        usu.setIdade(18);
//        usu.setEmail("felipe@email.com");
//        usu.setTelefone("(13)98765-4321");
        
        //CHAMAR MÉTODO CADASTRAR DADOS
        usu.cadastrarDados();

        //CHAMAR MÉTODO MOSTRAR DADOS DA CLASSE USUARIO
        usu.mostrarDados();
    }
}
