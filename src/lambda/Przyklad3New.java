package lambda;

/*
    Dostęp do zmiennych statycznych
 */
public class Przyklad3New {
    static int num;
    public static void main(String[] args) {
        num = 1;
        Converter<Integer, String> stringConverter = (from) -> "Liczba: " + String.valueOf(from + num);
        System.out.println(stringConverter.convert(2));
        num = 5;
    }
}