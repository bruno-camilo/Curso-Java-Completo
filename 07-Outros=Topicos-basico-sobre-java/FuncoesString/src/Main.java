import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String original = "abcde FGHIJ  ABC abc DEFG     ";
        //Converte em minusculas.
        String s01 = original.toLowerCase();
        //Converte em maiuscula
        String s02 = original.toUpperCase();
        // retira espaço em branco
        String s03 = original.trim();
        // retorna somente do caracter 2 em diante
        String s04 = original.substring(2);
        // retorna somente do caracter 2 em diante
        String s05 =  original.substring(2,9);
        //
        String s06 = original.replace('a' , 'x');
        String s07 = original.replace("abc" , "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");


        System.out.println("Original : -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("Trim: -" + s03 + "-");
        System.out.println("Substring: -" + s04 + "-");
        System.out.println("Substring: -" + s05 + "-");
        System.out.println("Substring: -" + s06 + "-");
        System.out.println("Substring: -" + s07 + "-");
        System.out.println("Substring: -" + i + "-");
        System.out.println("Index Of bc :" + i);
        System.out.println("Index Of bc :" + j);
    }
}

