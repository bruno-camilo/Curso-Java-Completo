package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        LocalDateTime d07 = LocalDateTime.parse("2023-05-12T01:30:26-03:00");

        System.out.println("d04 "+ d04.toString());
        System.out.println("d05 "+ d05.toString());
        System.out.println("d06 "+ d06.toString());
        System.out.println("d07 "+ d07.toString());

    }
}