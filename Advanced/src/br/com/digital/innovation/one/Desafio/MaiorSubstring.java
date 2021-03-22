package br.com.digital.innovation.one.Desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MaiorSubstring {
   static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter out = new PrintWriter(System.out);

   public static void main(String[] args) throws IOException {
      String StrA, StrB, min, max; //declare suas variaveis aqui
      while ((StrA = in.readLine()) !=null){ // complete seu código
               StrB = in.readLine();
         if (StrA.length() > StrB.length()) {
            min = StrB;
            max = StrA;
         } else {
            min = StrA;
            max = StrB;
         }
         int minLength = min.length();
         int maxS = minLength;
         boolean f = true;
         while (maxS > 0 && f) { //altere as variaveis, se achar necessario
            int diff = minLength - maxS;
            for (int i = 0; i <= diff; i++) { //complete o laco de repeticao
               if (max.contains(min.substring(i, i + maxS))) {
                  f = false;
                  maxS++;
                  break;
               }
            }
            maxS--;
         }
         System.out.println(maxS);
      }
      out.close();
   }
}


