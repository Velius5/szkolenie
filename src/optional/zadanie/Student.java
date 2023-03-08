package optional.zadanie;

public class Student {
    private String imie;
    private String nazwisko;
    private SzkolaSrednia szkolaSrednia;

    public Student(String imie, String nazwisko, SzkolaSrednia szkolaSrednia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.szkolaSrednia = szkolaSrednia;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public SzkolaSrednia getSzkolaSrednia() {
        return szkolaSrednia;
    }

    public void setSzkolaSrednia(SzkolaSrednia szkolaSrednia) {
        this.szkolaSrednia = szkolaSrednia;
    }
}
