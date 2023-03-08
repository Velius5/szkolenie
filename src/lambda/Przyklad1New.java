package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Przyklad1New {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (a, b) -> b.compareTo(a));
    }
}
