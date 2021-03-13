package br.com.digital.innovation.one.aula5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class inferenciaExemplo3 {

   public static void main(String[] args) throws IOException {

      var url = new URL("Https://docs.oracle.com/javase/10/language/");
      var urlConnection = url.openConnection();
      var bufferedReader = new BufferedReader(new InputStreamReader((urlConnection.getInputStream())));
      System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">",">\n"));

   }

}
