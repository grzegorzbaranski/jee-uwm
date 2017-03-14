package pl.zetosoftware.jeeuwm.model.uwm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the powiat database table.
 * 
 */
@Entity
@NamedQuery(name="Powiat.findAll", query="SELECT p FROM Powiat p")
@Table(schema="uwm" ,name="powiat")
public class Powiat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="POWIAT_ID_GENERATOR", sequenceName="UWM.POWIAT_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="POWIAT_ID_GENERATOR")
	private Long id;

	@Column(name="fk_woj")
	private Long fkWoj;

	@Column(name="kod_teryt")
	private String kodTeryt;

	private String nazwa;

	public Powiat() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFkWoj() {
		return this.fkWoj;
	}

	public void setFkWoj(Long fkWoj) {
		this.fkWoj = fkWoj;
	}

	public String getKodTeryt() {
		return this.kodTeryt;
	}

	public void setKodTeryt(String kodTeryt) {
		this.kodTeryt = kodTeryt;
	}

	public String getNazwa() {
		return this.nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

}