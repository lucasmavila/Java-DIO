package br.com.digital.innovation.one.Desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidadorSenha {

    public final static int MAX = 200;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String8  = new String8(MAX);

        //insira sua resolução aqui
        try {


            StringBuilder senha = new StringBuilder().append(br.readLine());

            boolean minuscula = false;
            boolean maiuscula = false;
            boolean numero = false;
            int tamanho = 0;

//        if( ||  ||  ||  == 0) { //complete o if de acordo com suas variaveis
//            System.out.println("Senha invalida.");
//        } else {
//            System.out.println("Senha valida.");
//        }
//    } else {
//        System.out.println("Senha invalida.");
//    }
//}
        } catch (NullPointerException e) {

        }
    }
}
