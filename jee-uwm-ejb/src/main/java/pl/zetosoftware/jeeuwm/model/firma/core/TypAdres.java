package pl.zetosoftware.jeeuwm.model.firma.core;

/**
 * Created by grzegorzb on 20.03.17.
 */
public enum TypAdres {
    ADRES_ZAMELDOWANIA("AM");

    private String kod;

    TypAdres(String kod) {
        this.kod = kod;
    }

    public String getKod() {
        return kod;
    }

    static public TypAdres typAdresuFromStringKod(String kodTxt) {

        if (kodTxt == null) {
            return null;
        }

        for (TypAdres typ : TypAdres.values()) {
            if (typ.getKod().equals(kodTxt)) {
                return typ;
            }
        }
        return null;
    }
}
