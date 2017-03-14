package pl.zetosoftware.jeeuwm.model.uwm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the wojewodztwo database table.
 * 
 */
@Entity
@NamedQuery(name="Wojewodztwo.findAll", query="SELECT w FROM Wojewodztwo w")
@Table(schema="uwm" ,name="wojewodztwo")
public class Wojewodztwo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="WOJEWODZTWO_ID_GENERATOR", sequenceName="UWM.WOJEWODZTWO_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="WOJEWODZTWO_ID_GENERATOR")
	private Long id;

	@Column(name="kod_teryt")
	private String kodTeryt;

	private String nazwa;

	private String skrot;

	public Wojewodztwo() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getSkrot() {
		return this.skrot;
	}

	public void setSkrot(String skrot) {
		this.skrot = skrot;
	}

}