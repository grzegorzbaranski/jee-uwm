package pl.zetosoftware.jeeuwm.model.firma.kontrahent;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import static pl.zetosoftware.jeeuwm.model.firma.core.FirmaJPAConsts.KONTRAHENT_TYP_FIRMA;
import static pl.zetosoftware.jeeuwm.model.firma.core.FirmaJPAConsts.KONTRAHENT_TYP_OSOBA_FIZYCZNA;

/**
 * Created by grzegorzb on 20.03.17.
 */
@Entity
@DiscriminatorValue(KONTRAHENT_TYP_FIRMA)
public class KontrahentFirma extends KontrahentOB {

    @Column(name =  "regon", length = 100)
    private String regon;


    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }


}
