package optional.zadanie;
import java.util.Optional;
import java.util.Random;

public class Zadanie {
    public static void main(String[] args) {
        Optional<Student> optionalStudent = getStudent();
        //Wyświetl powierzchnię basenu pływackiego, który znajdował się w szkole ukończonej przez naszego studenta o ile ten student ma na imię Andrzej
        Integer i = optionalStudent
                .filter(s -> s.getImie().equals("Andrzej"))
                .map(Student::getSzkolaSrednia)
                .map(SzkolaSrednia::getBasen)
                .map(Basen::getPowierzchnia)
                .orElse(0);
        System.out.println(i);
    }

    private static Optional<Student> getStudent() {
        Random generator = new Random();
        int num = generator.nextInt();
        if(num%3 == 0) {
            return Optional.of(new Student("Jan", "Nowak", new SzkolaSrednia(new SalaGimnastyczna(6000, true), null)));
        }
        if(num%5 == 0) {
            return Optional.of(new Student("Andrzej", "Nowak", new SzkolaSrednia(null, new Basen(2000))));
        }
        return Optional.of(new Student("Andrzej", "Kowalski", new SzkolaSrednia(null, new Basen(3000))));
    }

}
