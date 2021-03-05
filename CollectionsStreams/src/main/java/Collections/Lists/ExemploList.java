package Collections.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

  public static void main(String[] args){

    List<String> nomes = new ArrayList<>();

    nomes.add("Carlos");
    nomes.add("Pedro");
    nomes.add("Juliana");
    nomes.add("Anderson");
    nomes.add("Maria");
    nomes.add("João");

    System.out.println(nomes);
    nomes.set(2, "Larrisa");
    System.out.println(nomes);

    Collections.sort(nomes);
    nomes.set(2, "Wesley");
    System.out.println(nomes);

    nomes.remove(4);
    System.out.println(nomes);
    nomes.remove("Wesley");
    System.out.println(nomes);

    String nome = nomes.get(3); 
    System.out.println(nome);

    int posicao = nomes.indexOf("Carlos");
    System.out.println(posicao);

    posicao = nomes.indexOf("Wesley");
    System.out.println(posicao);

    int tamanho = nomes.size();
    System.out.println(tamanho);

    boolean temAnderson = nomes.contains("Anderson");
    System.out.println(temAnderson);

    for (String nomeDoItem: nomes) {
      System.out.println("---" + nomeDoItem);
    }

    Iterator<String> iterator = nomes.iterator();

    while (iterator.hasNext()){
      System.out.println(">>" + iterator.next());
    }

    boolean vazio = nomes.isEmpty();
    System.out.println(vazio);
    nomes.clear();
    vazio = nomes.isEmpty();
    System.out.println(vazio);

  }

}
