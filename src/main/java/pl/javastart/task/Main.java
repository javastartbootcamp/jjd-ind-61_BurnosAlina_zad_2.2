package pl.javastart.task;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String name1 = "Mleko";
        String producer1 = "Mlekowita";
        double price1 = 2.5;
        String name2 = "Czekolada";
        String producer2 = "Wedel";
        double price2 = 2.19;
        System.out.printf(Locale.ENGLISH,"%s %s %.1fzł%n" , name1,producer1,price1);
        System.out.printf(Locale.ENGLISH, "%s %s %.2fzł",name2,producer2,price2);

    }
}
