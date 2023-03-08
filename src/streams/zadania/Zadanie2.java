package streams.zadania;

import optional.User;
import optional.zadanie.Basen;
import optional.zadanie.SalaGimnastyczna;
import optional.zadanie.Student;
import optional.zadanie.SzkolaSrednia;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zadanie2 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Jan", "Nowak", new SzkolaSrednia(new SalaGimnastyczna(3000, false), null)),
                new Student("Jakub", "Kowalski", new SzkolaSrednia(new SalaGimnastyczna(5000, true), new Basen(6000))),
                new Student("Andrzej", "Nowak", new SzkolaSrednia(new SalaGimnastyczna(10000, true), new Basen(2000))),
                new Student("Tomasz", "Nowak", new SzkolaSrednia(null, new Basen(6000))),
                new Student("Roman", "Nowak", new SzkolaSrednia(null, new Basen(3000)))
        );

        //Wyświetl powierzchnię sali gimnastycznej szkoły średniej tych studentów, którzy w szkole średniej mieli salę gimnastyczną
        // z bramkami i basen o powierzchni większej niż 3000m2.
        //Posortuj malejąco
        //Wykorzystaj stream


        //Policz ilu studentów chodziło do szkoły średniej z basenem większym niż 3000m2


        //Sprawdź czy jakiś student nie miał w szkole średniej basenu ani bramek na sali gimnastycznej


    }
}
