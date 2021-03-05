package aulas.trabalhandoComDatas.javaCalendar;

import java.util.Calendar;

public class ExercicioFinalCalendar {

  public static void main(String[] args) {

    Calendar prazoPagar = Calendar.getInstance();
    System.out.println("Vencimento: " + prazoPagar.getTime());

    prazoPagar.add(Calendar.DATE , 11);
    System.out.println("Prazo automatico: " + prazoPagar.getTime() + " --- " + prazoPagar.get(Calendar.DAY_OF_WEEK));

    // Monday is 1 and Sunday is 7
    switch (prazoPagar.get(Calendar.DAY_OF_WEEK)){
      case Calendar.SATURDAY:
        prazoPagar.add(Calendar.DATE , 1);
      case Calendar.SUNDAY:
        prazoPagar.add(Calendar.DATE , 1);
    }
    System.out.println("Prazo corrigido: " + prazoPagar.getTime() + " --- " + prazoPagar.get(Calendar.DAY_OF_WEEK));

  }

}
