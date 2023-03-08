package ciekawostki;

public class Ciekawostka1 {
    public static void main(String[] args) {
        //Konkatynacja Stringów od Javy 8
        //https://klolo.github.io/blog/2017/08/04/czy-warto-sie-przejmowac-konkatenacja-stringow-w-java/

        String result = "";
        for (int i = 0; i < 100; i++) {
            result += i + " ";
        }
        System.out.println(result);


        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append(i).append(" ");
        }
        System.out.println(builder.toString());
    }
}
