package optional.zadanie;

public class SzkolaSrednia {
    private SalaGimnastyczna salaGimnastyczna;
    private Basen basen;

    public SzkolaSrednia(SalaGimnastyczna salaGimnastyczna, Basen basen) {
        this.salaGimnastyczna = salaGimnastyczna;
        this.basen = basen;
    }

    public SalaGimnastyczna getSalaGimnastyczna() {
        return salaGimnastyczna;
    }

    public void setSalaGimnastyczna(SalaGimnastyczna salaGimnastyczna) {
        this.salaGimnastyczna = salaGimnastyczna;
    }

    public Basen getBasen() {
        return basen;
    }

    public void setBasen(Basen basen) {
        this.basen = basen;
    }
}
