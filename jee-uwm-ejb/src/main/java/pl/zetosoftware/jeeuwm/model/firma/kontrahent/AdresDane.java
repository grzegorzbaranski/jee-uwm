package pl.zetosoftware.jeeuwm.model.firma.kontrahent;

import pl.zetosoftware.jeeuwm.model.firma.core.TypAdres;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Converts;
import javax.persistence.Embeddable;

/**
 * Created by grzegorzb on 18.03.17.
 */
@Embeddable
public class AdresDane {

    @Column(name = "Typ_adresy", length = 10)
    @Convert(converter = TypAdresConverter.class)
    private TypAdres typAdresy;

    @Column(name = "miejscowosc", length = 150)
    private String miejscowosc;
    @Column(name = "ulica", length = 200)
    private String ulica;
    @Column(name = "nr_domu", length = 20)
    private String nrDomu;
    @Column(name = "nr_lokal", length = 20)
    private String nrLokal;
    @Column(name = "kod_pocztowy", length = 10)
    private String kodPocztowy;
    @Column(name = "poczta", length = 150)
    private String poczta;
    @Column(name = "woj", length = 100)
    private String woj;

    protected AdresDane() {
    }


    public AdresDane(String miejscowosc, String ulica, String nrDomu, String nrLokal, String kodPocztowy, String poczta, String woj) {
        this.miejscowosc = miejscowosc;
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.nrLokal = nrLokal;
        this.kodPocztowy = kodPocztowy;
        this.poczta = poczta;
        this.woj = woj;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(String nrDomu) {
        this.nrDomu = nrDomu;
    }

    public String getNrLokal() {
        return nrLokal;
    }

    public void setNrLokal(String nrLokal) {
        this.nrLokal = nrLokal;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getPoczta() {
        return poczta;
    }

    public void setPoczta(String poczta) {
        this.poczta = poczta;
    }

    public String getWoj() {
        return woj;
    }

    public void setWoj(String woj) {
        this.woj = woj;
    }
}
