package sopramon.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.PositiveOrZero;

public class Sopramon extends Utilisateur implements ICombattant {
	

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="SOP_ID")
private int id;
@Column(name="SOP_DATE")
@Temporal(TemporalType.TIMESTAMP)
private java.util.Date Date;
private Date dateNaissance;
@Column(name="SOP_EXPERIENCE")
@PositiveOrZero
private int experience;
@Column(name="SOP_NIVEAU")
@PositiveOrZero
private int niveau;
@Column(name="SOP_ARGENT")
@PositiveOrZero
private double argent;
//lien capacite
private Capacite capacite;
//lien signe
private Signe signe;
//lien utilisateur
private Utilisateur utilisateur;
@OneToMany(mappedBy="Sopramon")
private List<Achat> achats;
@OneToMany(mappedBy="Sopramon")
private List<Combat> combats;



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public Capacite getCapacite() {
	return capacite;
}
public void setCapacite(Capacite capacite) {
	this.capacite = capacite;
}
public Date getDateNaissance() {
	return dateNaissance;
}
public void setDateNaissance(Date dateNaissance) {
	this.dateNaissance = dateNaissance;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
public int getNiveau() {
	return niveau;
}
public void setNiveau(int niveau) {
	this.niveau = niveau;
}
public double getArgent() {
	return argent;
}
public void setArgent(double argent) {
	this.argent = argent;
}

public Signe getSigne() {
	return signe;
}
public void setSigne(Signe signe) {
	this.signe = signe;
}


public java.util.Date getDate() {
	return Date;
}
public void setDate(java.util.Date date) {
	Date = date;
}
public Utilisateur getUtilisateur() {
	return utilisateur;
}
public void setUtilisateur(Utilisateur utilisateur) {
	this.utilisateur = utilisateur;
}
public List<Achat> getAchats() {
	return achats;
}
public void setAchats(List<Achat> achats) {
	this.achats = achats;
}
public List<Combat> getCombats() {
	return combats;
}
public void setCombats(List<Combat> combats) {
	this.combats = combats;
}
public void attaquer(){
}

}

