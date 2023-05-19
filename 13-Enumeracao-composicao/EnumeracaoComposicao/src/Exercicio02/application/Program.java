package Exercicio02.application;

import Exercicio02.entities.Comment;
import Exercicio02.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class Program {
        public static void main(String[]args) throws ParseException {
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

            Comment c1 = new Comment("Have a nice trip");
            Comment c2 = new Comment("Woe that's awesome!");
            Comment c3 = new Comment("Goog night");
            Comment c4 = new Comment("May The Force be with you");

            Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this woderful country!", 12);
            post1.addComment(c1);
            post1.addComment(c2);

            Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"),
                    "Good night guys",
                    "See you tomorrow",
                    5);
            post2.addComment(c3);
            post2.addComment(c4);


            System.out.println( post1);
            System.out.println(post2);
        }
}
