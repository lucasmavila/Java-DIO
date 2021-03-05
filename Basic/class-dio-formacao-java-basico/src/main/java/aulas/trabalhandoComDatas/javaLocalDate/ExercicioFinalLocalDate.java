package aulas.trabalhandoComDatas.javaLocalDate;

import java.time.LocalDateTime;
import java.time.Month;

public class ExercicioFinalLocalDate {

  public static void main(String[] args) {

    LocalDateTime agora = LocalDateTime.of(2010, Month.MAY,15,10,00);

    System.out.println(agora);
    // 2019-07-15T00:02:16.076

    LocalDateTime futuro = agora.plusYears(4).plusMonths(6).plusHours(13);

    System.out.println(futuro);
    // 2019-07-17T01:02:28.076

  }
}
