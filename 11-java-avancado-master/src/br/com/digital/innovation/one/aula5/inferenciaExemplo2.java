package br.com.digital.innovation.one.aula5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class inferenciaExemplo2 {

    public static void main(String[] args) throws IOException {

        URL url = new URL("Https://docs.oracle.com/javase/10/language/");
        URLConnection urlConnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((urlConnection.getInputStream())));
        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));

    }

}
