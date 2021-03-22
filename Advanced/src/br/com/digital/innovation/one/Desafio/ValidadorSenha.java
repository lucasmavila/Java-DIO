package br.com.digital.innovation.one.Desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ValidadorSenha {

   public final static int MAX = 200;

   public static void main(String[] args) throws IOException {
      //String8  = new String8(MAX);

      //insira sua resolução aqui
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String strSenha;
      try {
         while ((strSenha = br.readLine()) !=null) {
            String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
            char ch;
            boolean capitalFlag = false;
            boolean lowerCaseFlag = false;
            boolean numberFlag = false;
            boolean spaceFlag = false;
            boolean specialFlag = false;

            boolean lenghtFlag = (strSenha.length() >= 6 && strSenha.length() <= 32);
            for (int i = 0; i < strSenha.length(); i++) {
               ch = strSenha.charAt(i);
               if (Character.isDigit(ch)) {
                  numberFlag = true;
               } else if (Character.isUpperCase(ch)) {
                  capitalFlag = true;
               } else if (Character.isLowerCase(ch)) {
                  lowerCaseFlag = true;
               } else if (Character.isSpaceChar(ch)) {
                  spaceFlag = true;
               } else if (specialChars.contains(String.valueOf(ch))) {
                  specialFlag = true;
               }
            }
            if (numberFlag && capitalFlag && lowerCaseFlag && !spaceFlag && !specialFlag && lenghtFlag) {
               System.out.println("Senha valida.");
            }
            else
               System.out.println("Senha invalida.");
         }
      } catch (NullPointerException e) {

      }
   }
}

