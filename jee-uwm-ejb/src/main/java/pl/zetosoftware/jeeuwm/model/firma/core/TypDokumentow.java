package pl.zetosoftware.jeeuwm.model.firma.core;

/**
 * Created by grzegorzb on 20.03.17.
 */
public enum TypDokumentow {
    FAKTURA_VAT("FV"),
    PARAGON("PA");

    private String kod;

    TypDokumentow(String kod) {
        this.kod = kod;
    }

    public String getKod() {
        return kod;
    }

    static public TypDokumentow typDokFromStringKod(String kodTxt) {

        if (kodTxt == null) {
            return null;
        }

        for (TypDokumentow typ : TypDokumentow.values()) {
            if (typ.getKod().equals(kodTxt)) {
                return typ;
            }
        }
        return null;
    }
}
