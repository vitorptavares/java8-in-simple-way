package session14.date.and.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTImeIntro {

    public static void main(String[] args) {
        //Para pegar a data atual do sistema
        System.out.println(LocalDate.now().toString());

        //Para pegar a hora atual do sistema
        System.out.println(LocalTime.now().toString());

        //Para pegar a data e a hora atual do sistema
        LocalDateTime dateTime = LocalDateTime.now();

        int nano = dateTime.getNano();
        int minutes = dateTime.getMinute();
        int seconds = dateTime.getSecond();
        int hour = dateTime.getHour();
        int dayOfMonth = dateTime.getDayOfMonth();
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        int dayOfYear = dateTime.getDayOfYear();
        int monthValue = dateTime.getMonthValue();
        int year = dateTime.getYear();

        System.out.printf("nano: "+ "%d" + " |minutes: "+"%d"+ " |seconds: "+"%d"+ " |hour: "
                +"%d"+ " |day of month: "+"%d"+ " |day of week: "+"%d"+ " |day of year: "+"%d"
                + " |month Value: "+"%d"
                + " |year: "+"%d", nano, minutes, seconds, hour, dayOfMonth, dayOfWeek.getValue(), dayOfYear, monthValue, year);

        System.out.println();
        //Operacoes com data
        System.out.println("Depois de 6 meses: " +dateTime.plusMonths(6));
        System.out.println("Antes de 6 meses: " +dateTime.minusMonths(6));

    }
}
