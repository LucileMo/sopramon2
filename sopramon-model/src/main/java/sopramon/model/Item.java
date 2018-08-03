package sopramon.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Entity

public class Item {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="ACH_ID")	
private int id;
@Column(name="ITEM_NOM")
@NotEmpty
@Size(max=45)
private String nom;
@Column(name="ITEM_PRIX", nullable=false)
@Positive
private Double prix;
@Column(name="ITEM_CAPACITE", nullable=false)
private String capacite;
@OneToMany(mappedBy="item")
private List<Achat> achats;
@Column(name="ITEM_STOCK")
@PositiveOrZero
private int Stock;



public int getStock() {
	return Stock;
}
public void setStock(int stock) {
	Stock = stock;
}
public List<Achat> getAchats() {
	return achats;
}
public void setAchats(List<Achat> achats) {
	this.achats = achats;
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
public Double getPrix() {
	return prix;
}
public void setPrix(Double prix) {
	this.prix = prix;
}
public String getCapacite() {
	return capacite;
}
public void setCapacite(String capacite) {
	this.capacite = capacite;
}


}
