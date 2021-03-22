package br.com.digital.innovation.one.aula6.Me;

import java.util.stream.Collectors;

public class StringLines {
   public static void main(String[] args) {
      String html = "<html>\n <head>\n </head>\n  <body>\n  </body>\n</html>";
      System.out.println(html.lines().filter(s -> s.contains("head")).collect(Collectors.joining()));
   }
}
