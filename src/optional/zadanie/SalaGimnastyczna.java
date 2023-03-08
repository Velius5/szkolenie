package optional.zadanie;

public class SalaGimnastyczna {
    private Integer powierzchnia;
    private boolean bramki;

    public SalaGimnastyczna(Integer powierzchnia, boolean bramki) {
        this.powierzchnia = powierzchnia;
        this.bramki = bramki;
    }

    public Integer getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(Integer powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public boolean isBramki() {
        return bramki;
    }

    public void setBramki(boolean bramki) {
        this.bramki = bramki;
    }
}
