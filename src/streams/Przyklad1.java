package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Przyklad1 {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(2,4,1,5,3);

        //Filtrowanie
        System.out.println("Przefiltrowana lista:");
        List<String> integers2 = integers
                .parallelStream()
                .filter((s) -> s > 2)
                .map(Long::toString)
                .collect(Collectors.toList());

        //Sortowanie
        System.out.println("Posortowana lista:");
        integers
                .stream()
                .forEach(System.out::println);

        //Mapowanie obiektów
        System.out.println("Lista po mapowaniu:");
        integers
                .stream()
                .map(a -> String.valueOf(a))
                .forEach(System.out::println);

        //Matche
        boolean anyIsBiggerThen3 =
                integers
                        .stream()
                        .anyMatch(i -> i > 3);

        System.out.println("Jakiś większy niż 3? " + anyIsBiggerThen3);

        boolean allAreBiggerThen3 =
                integers
                        .stream()
                        .allMatch(i -> i > 3);

        System.out.println("Wszystkie są większe niż 3? " + allAreBiggerThen3);

        boolean noneAreBiggerThen3 =
                integers
                        .stream()
                        .noneMatch(i -> i > 3);

        System.out.println("Żaden nie jest większy niż 3? " + noneAreBiggerThen3);

        //Zliczanie
        Long biggerThen3 =
                integers
                        .stream()
                        .filter(s -> s > 2)
                        .count();

        System.out.println("Wszystkich elementów: " + biggerThen3.toString());

        //Redukcja
        Optional<Integer> reduced =
                integers
                        .stream()
                        .reduce((s1, s2) -> s1 + s2);

        reduced.ifPresent(System.out::println);


    }
}
