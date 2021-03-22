package br.com.digital.innovation.one.Desafio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class EntrevistaEmbaracosa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stEntrada = new StringTokenizer(br.readLine());
        //insira sua solução aqui

        try {
            while (stEntrada.hasMoreTokens()) {
                StringBuilder palavra = new StringBuilder().append(stEntrada.nextToken());
                String parteInicial;
                String parteFinal;
                boolean nenhumCorte = true;

                for (int corte = 1; corte < palavra.length() ; corte ++){
                    parteInicial = palavra.substring(0,corte);
                    parteFinal = palavra.substring(corte,palavra.length());
                    if (parteInicial.endsWith(parteFinal)) {
                        System.out.println(parteInicial);
                        nenhumCorte = false;
                    }
                }
                if (nenhumCorte){System.out.println(palavra.toString());}
                stEntrada = new StringTokenizer(br.readLine());
            }
        } catch (NullPointerException e) {

        }
    }
}
