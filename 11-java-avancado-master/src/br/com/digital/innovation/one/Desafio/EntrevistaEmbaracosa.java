package br.com.digital.innovation.one.Desafio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class EntrevistaEmbaracosa {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      //StringTokenizer st = new StringTokenizer(br.readLine(),"");
      //insira sua solução aqui
      String palavraCorrigida;
      List<String> vogais = Arrays.asList(new String[]{"a", "e", "i", "o", "u"});

      while (true){
         String palavra = br.readLine();

         List<String> vetLetras = new ArrayList(Arrays.asList(palavra.split("")));
         List<String> vetLetrasA = new ArrayList<>();

         vetLetras.forEach(letra -> {
            if (!vetLetrasA.contains(letra) || (letra.equals(vetLetrasA.get(vetLetrasA.size()-1)) && !vogais.contains(letra))){
               vetLetrasA.add(letra);
            }
         });
         palavraCorrigida = vetLetrasA.stream().collect(Collectors.joining());
         System.out.println(palavraCorrigida);

      }

   }

}
