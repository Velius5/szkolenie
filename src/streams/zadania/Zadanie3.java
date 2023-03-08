package streams.zadania;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Zadanie3 {

    public static void main(String[] args) {
        List<Book> listBooks = Arrays.asList(
                new Book(39.99, "Czysty kod", TypOkladki.TWARDA, false),
                new Book(49.99, "Pani jeziora", TypOkladki.MIEKKA, true),
                new Book(49.99, "Pani jeziora", TypOkladki.MIEKKA, true),
                new Book(19.99, "PHP w akcji", TypOkladki.MIEKKA, false),
                new Book(29.99, "Bajki", TypOkladki.TWARDA, true),
                new Book(19.99, "Żarty programistów", TypOkladki.TWARDA, true));

        List<Book> listBooks2 = Arrays.asList(
                new Book(39.99, "Czysty kod", TypOkladki.TWARDA, false),
                new Book(49.99, "Pani jeziora", TypOkladki.MIEKKA, true),
                new Book(49.99, "Pani jeziora", TypOkladki.MIEKKA, true));

        List<List<Book>> collectionOfListBooks = Arrays.asList(listBooks, listBooks2);

        Stream<List<Book>> streamOfListBooks = collectionOfListBooks.stream();

    /*
        1. Spłaszcz List<List<Book>> do jednej listy książek List<Book> za pomocą flatMap
        2. Usuń duplikaty
        3. Zrzuć wszystko do nowej kolekcji typu List
        4. Wrzuć na standardowe wyjście listę książek bez duplikatów - skorzystaj z parallelStream
     */





    /*
        Z tej samej listy bez duplikatów wrzuć na standardowe wyjście te, które są na promocji i mają twardą okładkę
     */
















        Map<Integer, Book> books = new HashMap<>();
        books.put(1, new Book(39.99, "Czysty kod", TypOkladki.TWARDA, false));
        books.put(2, new Book(39.99, "Czysty kod", TypOkladki.TWARDA, false));
        books.put(3, new Book(39.99, "Czysty kod", TypOkladki.TWARDA, false));
        books.put(4, new Book(39.99, "Czysty kod", TypOkladki.TWARDA, false));
        books.put(5, new Book(39.99, "Czysty kod", TypOkladki.TWARDA, false));
        books.put(6, new Book(39.99, "Czysty kod", TypOkladki.TWARDA, false));

        books.forEach((key, value) -> System.out.println(value));
    }



}
