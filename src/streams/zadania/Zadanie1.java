package streams.zadania;

import java.util.Arrays;
import java.util.List;

public class Zadanie1 {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("andrzej", "jakub", "tomasz", "bartosz", "patryk", "albert", "alicja", "monika", "ala", "jan");

        //Wyświetl te imiona, które zaczynają się na literę A i zawierają mniej niż 7 liter
        //Lista ta powinna być posortowana A->Z
        //Imiona powinny być napisane z wielkiej litery

        list.stream()
                .filter(a -> String.valueOf(a.charAt(0)).equals("a") && a.length() < 7)
                .sorted()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1, s.length()))
                .forEach(System.out::println);
    }
}
