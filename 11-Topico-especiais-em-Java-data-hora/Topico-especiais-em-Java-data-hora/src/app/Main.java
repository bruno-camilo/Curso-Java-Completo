package app;

import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //Inicio -Como instanciar uma data de agora
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " +d02.toString());
        System.out.println("d03 = " +d03.toString());
        //Fim -Como instanciar uma data de agora

       // Texto ISO8601
        LocalDate d04 = LocalDate.parse("2023-05-12");
        LocalDateTime d05 = LocalDateTime.parse("2023-05-12T01:30:26");
        Instant d06 = Instant.parse("2023-05-12T01:30:26Z");
        //Instant d07 = Instant.parse("2023-05-12T01:30:26-03:00");


        System.out.println("d04 "+ d04.toString());
        System.out.println("d05 "+ d05.toString());
        System.out.println("d06 "+ d06.toString());
       // System.out.println("d07 "+ d07.toString());

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d08 = LocalDate.parse("13/05/2023",fmt1) ;
        System.out.println("d08 "+ d08.toString());

         LocalDate d09 = LocalDate.of(2023,05,15);
         LocalDateTime d10 = LocalDateTime.of(2023,5,15,21,59);

        System.out.println("d09 "+ d09.toString());
        System.out.println("d10 "+ d10.toString());

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("d04 = " + d04.format(fmt2));
        System.out.println("d04 = " + fmt2.format(d04));

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d05 = " + fmt3.format(d05));
        System.out.println("d06 = "+ fmt4.format(d06));

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("R1 = "+ r1);
        System.out.println("R2 = "+ r2);


        LocalDate pastWeek = d04.minusDays(7);
        LocalDate nextWeek = d04.plusDays(7);
        System.out.println("Past Week " + pastWeek);
        System.out.println("Next Week " + nextWeek);

        Duration t1 = Duration.between(d04.atTime(0,0) ,nextWeek.atTime(0,0));

        System.out.println(t1.toDays());

    }
}
