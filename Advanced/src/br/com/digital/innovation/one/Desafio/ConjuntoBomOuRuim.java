package br.com.digital.innovation.one.Desafio;

import java.util.*;

public class ConjuntoBomOuRuim {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in, "ISO-8859-1");

      while (true) {
         int N = Integer.parseInt(sc.nextLine());

         if (N == 0) {
            break;
         }
         List<String> entradas = new ArrayList<String>();
         for (int i = 0; i < N; i++) {
            entradas.add(sc.nextLine());
         }
         entradas.sort(Comparator.comparing(String::length));
         boolean conjuntoRuim = false;

         for (int i = 0; i < N; i++) {
            String entradaAgora = entradas.get(i);
            if ((i+1) < entradas.size()) {
               List<String> subEntradas = entradas.subList(i + 1, entradas.size());
               for (String subEntrada : subEntradas) {
                  conjuntoRuim = subEntrada.substring(0,entradaAgora.length()).equals(entradaAgora);
                  if (conjuntoRuim){break;}
               }
            }
            if (conjuntoRuim){break;}
         }
         System.out.println(conjuntoRuim ? "Conjunto Ruim" : "Conjunto Bom");
      }

   }

}
