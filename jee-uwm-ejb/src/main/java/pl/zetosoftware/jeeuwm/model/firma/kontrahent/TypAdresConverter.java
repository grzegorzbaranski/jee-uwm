package pl.zetosoftware.jeeuwm.model.firma.kontrahent;

import pl.zetosoftware.jeeuwm.model.firma.core.TypAdres;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Created by grzegorzb on 20.03.17.
 */
@Converter
public class TypAdresConverter implements AttributeConverter<TypAdres, String> {
    @Override
    public String convertToDatabaseColumn(TypAdres typAdres) {
        if (typAdres != null) {
            return  typAdres.getKod();
        }else{
            return null;
        }

    }

    @Override
    public TypAdres convertToEntityAttribute(String s) {
        return TypAdres.typAdresuFromStringKod(s);
    }
}
