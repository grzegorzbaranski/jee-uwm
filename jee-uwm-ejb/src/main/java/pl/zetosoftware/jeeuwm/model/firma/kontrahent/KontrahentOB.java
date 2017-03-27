package pl.zetosoftware.jeeuwm.model.firma.kontrahent;

import pl.zetosoftware.jeeuwm.model.firma.core.FirmaJPAConsts;

import javax.persistence.*;

/**
 * Created by grzegorzb on 18.03.17.
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="typ",discriminatorType=DiscriminatorType.STRING)
@Table(schema = FirmaJPAConsts.SCHEMA_KONTRAHENT, name = "kontrahent")
public abstract class KontrahentOB {

    @Id
    @SequenceGenerator(name = "KONTRAHENT_ID_GENERATOR", sequenceName = FirmaJPAConsts.SCHEMA_KONTRAHENT + ".KONTRAHENT_ID_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "KONTRAHENT_ID_GENERATOR")
    private Long id;

    @Embedded
    private KontrahentDanePodstawowe danePodstawowe;

    @Embedded
    private AdresDane adresDane;

    @Version
    private Long wersja;

    public KontrahentOB() {
    }

    public AdresDane getAdresDane() {
        return adresDane;
    }

    public void setAdresDane(AdresDane adresDane) {
        this.adresDane = adresDane;
    }

    public KontrahentDanePodstawowe getDanePodstawowe() {
        return danePodstawowe;
    }

    public void setDanePodstawowe(KontrahentDanePodstawowe danePodstawowe) {
        this.danePodstawowe = danePodstawowe;
    }
}
