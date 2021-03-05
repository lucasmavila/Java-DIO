package aulas.trabalhandoComDatas.javaDate;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ExercicioFinal {
    public static void main(String[] args) throws Exception{

        String nascimentoStr = "15/06/1994";
        String dataRefStr = "15/05/2010";
        SimpleDateFormat formatoSdf = new SimpleDateFormat("dd/MM/yyyy");

        Date nascimentoFormatada = formatoSdf.parse(nascimentoStr);
        long milis = nascimentoFormatada.getTime();

        Date dataRef = formatoSdf.parse(dataRefStr);

        int comparacao = nascimentoFormatada.compareTo(dataRef);
        System.out.println(milis);
        System.out.println(nascimentoFormatada);
        System.out.println(comparacao);

    }
}
