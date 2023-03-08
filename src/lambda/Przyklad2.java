package lambda;

/*
    Interfejsy funkcyjne
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}

public class Przyklad2 {
    public static void main(String[] args) {
        Converter<Integer, String> stringConverter = from -> "Liczba: " + String.valueOf(from);
        Converter<String, Integer> intConverter = Integer::valueOf;
        System.out.println(stringConverter.convert(2));

        //Predykaty
        Predicate<String> predicate = (s) -> s.length() > 0;

        predicate.test("foo");              // true
        predicate.negate().test("foo");     // false

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

        //Funkcje
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        backToString.apply("123");     // "123"

        //Dostawcy
        Supplier<Person> personSupplier = Person::new;
        personSupplier.get();   // new Person

        //Konsumenci
        Consumer<Person> greeter = (p) -> System.out.println("Cześć " + p.firstName + "!");
        greeter.accept(new Person("Adam", "Nowak"));

        //Komparatory
        Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);
        Person p1 = new Person("Jan", "Kowalski");
        Person p2 = new Person("Adam", "Nowak");
        comparator.compare(p1, p2);             // > 0
        comparator.reversed().compare(p1, p2);  // < 0

    }
}

