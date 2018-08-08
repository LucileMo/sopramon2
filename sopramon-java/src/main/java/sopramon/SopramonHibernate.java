package sopramon;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.Query;

import sopramon.IDAO.IDAOSopramon;
import sopramon.IDAO.IDAOCombat;
import sopramon.IDAO.IDAOItem;
import sopramon.IDAO.IDAOUtilisateur;
import sopramon.model.Item;
import sopramon.model.Sopramon;
import sopramon.model.Utilisateur;

public class SopramonHibernate {

	@Autowired
	private IDAOSopramon daosopramon;
	@Autowired

	private IDAOUtilisateur daoutilisateur;
	@Autowired
	private IDAOCombat daocombat;

	@Autowired
	IDAOItem daoitem;

	public void run(String[] args) {

		// R READ ITEM


		
		
		daoitem.findByNomContaining("Hache");

		daoitem.findAll();

		// U UPDATE ITEM

	//	daoitem.updateAnItem(1);
	}

}
//		Item myItem = new Item();
//		daoproduit.findUnProduit("Planche");
//		daoproduit.findByNom("planche"); 
//
//		

// U UPDATE

// @Query("update i from Item s where s.id = :1, ")
// Stream<Item> updateAnItem();

// D DELETE

// public Item deleteById(int itemid);

//

/*
 * 
 * 
 * static String lireChaine() { Scanner myScanner = new Scanner(System.in);
 * 
 * try { return myScanner.next(); }
 * 
 * catch (Exception ex) { return null; } }
 * 
 * public static void printItems() { IDAOItem daoItem = new DAOItemHibernate();
 * 
 * for (Item i : daoItem.findAll()) { System.out.println(i.getNom()); }
 * 
 * 
 * }
 * 
 * public static void findByUtilisateur() { IDAOUtilisateur daoUtilisateur = new
 * DAOUtilisateurHibernate(); IDAOSopramon daoSopramon = new
 * DAOSopramonHibernate(); System.out.println("Username : "); String u
 * =lireChaine(); System.out.println("Password : "); String p =lireChaine();
 * Sopramon s = daoSopramon.findByUtilisateur(u, p);
 * System.out.println("Sopramon : " + s.getPseudo());
 * 
 * }
 * 
 * 
 * 
 * public static void main(String[] args) {
 * 
 * //printItems();
 * 
 * findByUtilisateur();
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 */
