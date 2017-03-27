package pl.zetosoftware.jeeuwm.model.firma.kontrahent;

import javax.persistence.*;

/**
 * Created by grzegorzb on 18.03.17.
 */
@Embeddable
public class KontrahentDanePodstawowe {

    @Column(name = "nazwa_pelna",length = 1000,nullable = false)
    private  String nazwaPelna;
    @Column(name = "nazwa_skrocona", length = 100,nullable = false)
    private  String nazwaSkrocona;
    @Column(name = "nip", length = 20,nullable = false)
    private String nip;

    public KontrahentDanePodstawowe() {
    }

    public KontrahentDanePodstawowe(String nazwaPelna, String nazwaSkrocona, String nip) {
        this.nazwaPelna = nazwaPelna;
        this.nazwaSkrocona = nazwaSkrocona;
        this.nip = nip;
    }

    public String getNazwaPelna() {
        return nazwaPelna;
    }

    public void setNazwaPelna(String nazwaPelna) {
        this.nazwaPelna = nazwaPelna;
    }

    public String getNazwaSkrocona() {
        return nazwaSkrocona;
    }

    public void setNazwaSkrocona(String nazwaSkrocona) {
        this.nazwaSkrocona = nazwaSkrocona;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}
