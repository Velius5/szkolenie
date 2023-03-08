package streams.zadania;

public class Book {
    private double cena;
    private String tytul;
    private TypOkladki typOkladki;
    private boolean promocja;

    public Book(double cena, String tytul, TypOkladki typOkladki, boolean promocja) {
        this.cena = cena;
        this.tytul = tytul;
        this.typOkladki = typOkladki;
        this.promocja = promocja;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public TypOkladki getTypOkladki() {
        return typOkladki;
    }

    public void setTypOkladki(TypOkladki typOkladki) {
        this.typOkladki = typOkladki;
    }

    public boolean isPromocja() {
        return promocja;
    }

    public void setPromocja(boolean promocja) {
        this.promocja = promocja;
    }

    @Override
    public String toString() {
        return "Book{" +
                "cena=" + cena +
                ", tytul='" + tytul + '\'' +
                ", typOkladki=" + typOkladki +
                ", promocja=" + promocja +
                '}';
    }
}
