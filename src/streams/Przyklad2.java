package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/*
    STREAMS: Sortowanie sekwencyjne VS sortowanie równoległe
 */
public class Przyklad2 {
    static List<String> values;

    public static void main(String[] args) {
         values = generujemyListe(1000000);
         sortowanieSekwencyjne();
         sortowanieRownolegle();
    }

    private static void sortowanieSekwencyjne() {
        long t0 = System.nanoTime();
        long count = values.stream().sorted().count();
        long t1 = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("sequential sort took: %d ms", millis));
    }

    private static void sortowanieRownolegle() {
        long t0 = System.nanoTime();
        long count = values.parallelStream().sorted().count();
        long t1 = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("parallel sort took: %d ms", millis));
    }

    private static List<String> generujemyListe(Integer max) {
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }
        return values;
    }

}
