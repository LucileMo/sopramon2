package sopramon.model;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name = "boss")
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="BOSS_ID")),
	@AttributeOverride(name="nom", column=@Column(name="BOSS_NOM")),
	@AttributeOverride(name="signe", column=@Column(name="BOSS_SIGNE")),
	@AttributeOverride(name="niveau", column=@Column(name="BOSS_NIVEAU")),
	@AttributeOverride(name="capacite", column=@Column(name="BOSS_ADRESSE"))
})	

public class Boss implements ICombattant {
	
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOSS_ID")
	public int id;

	@Column(name = "BOSS_NOM", length = 45, nullable = false)
	@NotEmpty
	@Size(max = 50)
	public String nom;	

	@Column(name = "BOSS_NIVEAU", length = 50, nullable = false)
	@NotEmpty
	@Size(max = 50)
	public int niveau;
	
	//CLE ETRANGERE
	@OneToOne
	@JoinColumn(name="BOSS_CAPACITE_ID")
	private Capacite capacite;
	
	//CLE ETRANGERE
	@OneToMany(mappedBy="boss")
	private List<Combat> combat;
	
	@Column(name = "BOSS_SIGNE", length = 45, nullable = false)
	@NotEmpty
	@Size(max = 50)
	public Signe signe;	
	
	public Signe getSigne() {
		return signe;
	}

	public void setSigne(Signe signe) {
		this.signe = signe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public List<Combat> getCombat() {
		return combat;
	}

	public void setCombat(List<Combat> combat) {
		this.combat = combat;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public Capacite getCapacite() {
		return capacite;
	}

	public void setCapacite(Capacite capacite) {
		this.capacite = capacite;
	}

	public void attaquer() {
		// TODO Auto-generated method stub
		
	}
}
