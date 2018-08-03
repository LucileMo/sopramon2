package sopramon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity

public class Capacite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CAPA_ID")
	private int id;

	@Column(name = "CAPA_pointsdevie", length = 45, nullable = false)
	@NotEmpty
	@Size(max = 50)
	private int pointsDeVie;

	@Column(name = "CAPA_attaque", length = 45, nullable = false)
	@NotEmpty
	@Size(max = 50)
	private int attaque;

	@Column(name = "CAPA_defense", length = 45, nullable = false)
	@NotEmpty
	@Size(max = 50)
	private int defense;

	@Column(name = "CAPA_esquive", length = 45, nullable = false)
	@NotEmpty
	@Size(max = 50)
	private int esquive;

	@Column(name = "CAPA_vitesse", length = 45, nullable = false)
	@NotEmpty
	@Size(max = 50)
	private int vitesse;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPointsDeVie() {
		return pointsDeVie;
	}

	public void setPointsDeVie(int pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}

	public int getAttaque() {
		return attaque;
	}

	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getEsquive() {
		return esquive;
	}

	public void setEsquive(int esquive) {
		this.esquive = esquive;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

}
