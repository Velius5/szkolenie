package lambda;

/*
    Dostęp do zmiennych lokalnych
 */
public class Przyklad3 {
    public static void main(String[] args) {
        final int num = 1;
        Converter<Integer, String> stringConverter = (Integer from) -> "Liczba: " + String.valueOf(from + num);
        System.out.println(stringConverter.convert(2));
    }
}
