package filtre;

public class MasaFiltre {
    private int bahis;
    private boolean hızlı;
    private boolean tekeTek;
    private boolean rovans;

    public MasaFiltre(int bahis, boolean hızlı, boolean tekeTek, boolean rovans) {
        this.bahis = bahis;
        this.hızlı = hızlı;
        this.tekeTek = tekeTek;
        this.rovans = rovans;
    }

    public int getBahis() {
        return bahis;
    }

    public void setBahis(int bahis) {
        if (this.bahis <= 200)
            this.bahis = 200;
        else if (this.bahis >= 5000) {
            this.bahis = 5000;
        } else
            this.bahis = bahis;
    }

    public boolean isHızlı() {
        return hızlı;
    }

    public void setHızlı(boolean hızlı) {
        this.hızlı = hızlı;
    }

    public boolean isTekeTek() {
        return tekeTek;
    }

    public void setTekeTek(boolean tekeTek) {
        this.tekeTek = tekeTek;
    }

    public boolean isRovans() {
        return rovans;
    }

    public void setRovans(boolean rovans) {
        this.rovans = rovans;
    }

    @Override
    public String toString() {
        return "Masa Özellikleri = " + "Bahis= " + bahis + ", Hızlı= " + hızlı + ", TekeTek=" + tekeTek + ", Rovans= " + rovans;
    }

}
