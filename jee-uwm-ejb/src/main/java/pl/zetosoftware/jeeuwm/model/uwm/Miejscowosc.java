package pl.zetosoftware.jeeuwm.model.uwm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the miejscowosc database table.
 * 
 */
@Entity
@NamedQuery(name="Miejscowosc.findAll", query="SELECT m FROM Miejscowosc m")
@Table(schema="uwm" ,name="miejscowosc")
public class Miejscowosc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MIEJSCOWOSC_ID_GENERATOR", sequenceName="UWM.MIEJSCOWOSC_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MIEJSCOWOSC_ID_GENERATOR")
	private Long id;

	@OneToOne
	@JoinColumn(name="fk_gmina")
	private Gmina gmina;

	@Column(name="fk_kraj")
	private Long fkKraj;

	@Column(name="kod_teryt")
	private String kodTeryt;

	private String nazwa;

	public Miejscowosc() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Long getFkKraj() {
		return this.fkKraj;
	}

	public void setFkKraj(Long fkKraj) {
		this.fkKraj = fkKraj;
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