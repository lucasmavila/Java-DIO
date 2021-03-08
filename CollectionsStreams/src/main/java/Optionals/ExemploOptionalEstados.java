package Optionals;

import java.util.Optional;

public class ExemploOptionalEstados {
  public static void main(String[] args){

    Optional<String> optionalString = Optional.of("Valor presente");
    System.out.println("Valor opcional que esta presente");
    optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

    Optional<String> optionalNull = Optional.ofNullable(null);
    System.out.println("Valor opcional que não esta presente");
    optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

    Optional<String> emptyOptional = Optional.empty();
    System.out.println("Valor opcional que não esta presente");
    emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

    Optional<String> optionalNullErro = Optional.of(null);
    System.out.println("Valor opcional que esta presente");
    optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

  }

}
