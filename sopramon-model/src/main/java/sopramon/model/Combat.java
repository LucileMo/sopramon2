package sopramon.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "combat")

public class Combat {

	// CLE PRIMAIRE

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COMB_ID")
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	@Column(name = "COMB_ARENE", length = 45, nullable = false)
	@NotEmpty
	@Size(max = 50)
	private Arene arene;

	@Column(name = "COMB_TYPE", length = 45, nullable = false)
	@NotEmpty
	@Size(max = 50)
	private Type type;

	@Column(name = "COMB_TOUR", length = 45, nullable = false)
	@NotEmpty
	@Size(max = 50)
	private int tours;

	// CLE ETRANGERE
	@ManyToOne
	@JoinColumn(name = "COMBAT_SOPRAMON_ID")
	private Sopramon sopramon;

	// CLE ETRANGERE
	@ManyToOne
	@JoinColumn(name = "COMBAT_BOSS_ID")
	private Boss boss;
	
	@OneToMany(mappedBy = "combat")
	private List<Coup> coups;

	private ICombattant joueur1;

	private ICombattant joueur2;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ICombattant getJoueur1() {
		return joueur1;
	}

	public void setJoueur1(ICombattant joueur1) {
		this.joueur1 = joueur1;
	}

	public ICombattant getJoueur2() {
		return joueur2;
	}

	public void setJoueur2(ICombattant joueur2) {
		this.joueur2 = joueur2;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Arene getArene() {
		return arene;
	}

	public void setArene(Arene arene) {
		this.arene = arene;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getTours() {
		return tours;
	}

	public void setTours(int tours) {
		this.tours = tours;
	}

	public Sopramon getSopramon() {
		return sopramon;
	}

	public void setSopramon(Sopramon sopramon) {
		this.sopramon = sopramon;
	}

	public Boss getBoss() {
		return boss;
	}

	public void setBoss(Boss boss) {
		this.boss = boss;
	}

	public List<Coup> getCoups() {
		return coups;
	}

	public void setCoups(List<Coup> coups) {
		this.coups = coups;
	}

	public void duel() {

	}

}
