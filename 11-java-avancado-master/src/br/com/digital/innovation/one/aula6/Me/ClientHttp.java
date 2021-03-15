package br.com.digital.innovation.one.aula6.Me;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.util.concurrent.ThreadFactory;

public class ClientHttp {

   static ExecutorService executor = Executors.newFixedThreadPool(6, new ThreadFactory() {
      @Override
      public Thread newThread(Runnable runnable) {
         Thread thread = new Thread(runnable);
         System.out.println("Nova Thread criada :: " +
               (thread.isDaemon() ? "deamon" : "") + "Thread Group :: " + thread.getThreadGroup());
//            return null;
         return thread;
      }
   });

   public static void main(String[] args) throws Exception {
      connectAndPrintURLJavaOracle();
   }

   public static void connectAndPrintURLJavaOracle() throws IOException, InterruptedException {
      HttpRequest request = HttpRequest.newBuilder()
            .GET().uri(URI.create("Https://docs.oracle.com/javase/10/language/"))
            .build();

      HttpClient httpClient = HttpClient.newHttpClient();
      HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
      System.out.println("Status code:: " + response.statusCode());
      System.out.println("Headers response:: " + response.headers());
      System.out.println(response.body());
   }


}

