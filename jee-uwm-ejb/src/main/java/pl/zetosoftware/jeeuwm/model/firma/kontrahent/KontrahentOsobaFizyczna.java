package pl.zetosoftware.jeeuwm.model.firma.kontrahent;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import static pl.zetosoftware.jeeuwm.model.firma.core.FirmaJPAConsts.KONTRAHENT_TYP_OSOBA_FIZYCZNA;

/**
 * Created by grzegorzb on 20.03.17.
 */
@Entity
@DiscriminatorValue(KONTRAHENT_TYP_OSOBA_FIZYCZNA)
public class KontrahentOsobaFizyczna extends KontrahentOB {

    @Column(name =  "telefon_kontaktowy", length = 100)
    private String telefonPrywatny;

    public String getTelefonPrywatny() {
        return telefonPrywatny;
    }

    public void setTelefonPrywatny(String telefonPrywatny) {
        this.telefonPrywatny = telefonPrywatny;
    }
}
