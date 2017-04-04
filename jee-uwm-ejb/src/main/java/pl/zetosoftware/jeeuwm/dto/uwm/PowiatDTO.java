package pl.zetosoftware.jeeuwm.dto.uwm;

import pl.zetosoftware.jeeuwm.model.uwm.Wojewodztwo;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the powiat database table.
 * 
 */
public class PowiatDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	private Long fkWoj;
	private String nazwaWoj;

	private String kodTeryt;

	private String nazwa;

	public PowiatDTO() {
	}

	public PowiatDTO(Long id, Long fkWoj, String nazwaWoj, String kodTeryt, String nazwa) {
		this.id = id;
		this.fkWoj = fkWoj;
		this.nazwaWoj = nazwaWoj;
		this.kodTeryt = kodTeryt;
		this.nazwa = nazwa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFkWoj() {
		return fkWoj;
	}

	public void setFkWoj(Long fkWoj) {
		this.fkWoj = fkWoj;
	}

	public String getNazwaWoj() {
		return nazwaWoj;
	}

	public void setNazwaWoj(String nazwaWoj) {
		this.nazwaWoj = nazwaWoj;
	}

	public String getKodTeryt() {
		return kodTeryt;
	}

	public void setKodTeryt(String kodTeryt) {
		this.kodTeryt = kodTeryt;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
}