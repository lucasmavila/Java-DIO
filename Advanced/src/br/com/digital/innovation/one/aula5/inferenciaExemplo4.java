package br.com.digital.innovation.one.aula5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class inferenciaExemplo4 {

   public static void main(String[] args) throws IOException {
      connectAndPrintURLJavaOracle();
      connectAndPrintURLJavaOracle2();
   }

   private static void connectAndPrintURLJavaOracle() throws IOException {
      var url = new URL("Https://docs.oracle.com/javase/10/language/");
      var urlConnection = url.openConnection();
      var bufferedReader = new BufferedReader(new InputStreamReader((urlConnection.getInputStream())));
      System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
   }

   private static void connectAndPrintURLJavaOracle2() throws IOException {

      var url = new URL("Https://docs.oracle.com/javase/10/language/");
      var urlConnection = url.openConnection();

      try (var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
         System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}

