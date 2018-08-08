package sopramon;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import sopramon.IDAO.IDAOItem;
import sopramon.IDAO.IDAOSopramon;
import sopramon.IDAO.IDAOCombat;

import sopramon.IDAO.IDAOUtilisateur;
import sopramon.model.Item;
import sopramon.model.Utilisateur;

public class SopramonGenerator {

	@Autowired
	IDAOItem daoitem;

	@Autowired
	private IDAOSopramon daosopramon;

	@Autowired
	private IDAOUtilisateur daoutilisateur;

	@Autowired
	private IDAOCombat daocombat;

	public void run(String[] args) {

		// S SAVE ITEM

		Item myItem = new Item();

		myItem.setNom("Le DESTRUCTOR");
		myItem.setPrix(400);
		myItem.setCapacite("10");
		myItem.setStock(500);

		daoitem.save(myItem);

		// D DELETE ITEM BY ID

		daoitem.deleteById(10);

	}

}
// Ajout d'un Utilisateur/Sopramon
/*
 * daoUtilisateur = new DAOUtilisateurHibernate(); Utilisateur myUtilisateur =
 * new Utilisateur();
 * 
 * myUtilisateur.setNom(""); myUtilisateur.setPrenom("");
 * myUtilisateur.setUsername(""); myUtilisateur.setPassword("");
 * 
 * daoUtilisateur.save(myUtilisateur);
 */

// Ajout d'un Item
/*
 * IDAOItem daoItem = new DAOItemHibernate(); Item myItem = new Item();
 * 
 * myItem.setNom("Arc"); myItem.setPrix(54);
 * myItem.setCapacite("Tire des fleches"); myItem.setStock(58);
 * 
 * daoItem.save(myItem);
 * 
 * 
 */
