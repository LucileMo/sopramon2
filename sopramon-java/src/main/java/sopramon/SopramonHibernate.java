package sopramon;

import java.util.Scanner;

import sopramon.DAO.IDAOSopramon;
import sopramon.DAO.Hibernate.DAOItemHibernate;
import sopramon.DAO.Hibernate.DAOSopramonHibernate;
import sopramon.DAO.Hibernate.DAOUtilisateurHibernate;
import sopramon.IDAO.IDAOItem;
import sopramon.IDAO.IDAOUtilisateur;
import sopramon.model.Item;
import sopramon.model.Sopramon;
import sopramon.model.Utilisateur;



public class SopramonHibernate {
	
	static String lireChaine() {
		Scanner myScanner = new Scanner(System.in);

		try {
			return myScanner.next();
		}

		catch (Exception ex) {
			return null;
		}
	}
	
	public static void printItems() {
		IDAOItem daoItem = new DAOItemHibernate();

		for (Item i : daoItem.findAll()) {
			System.out.println(i.getNom());
		}
		
	
		}
	
	public static void findByUtilisateur() {
		IDAOUtilisateur daoUtilisateur = new DAOUtilisateurHibernate();	
		IDAOSopramon daoSopramon = new DAOSopramonHibernate();
		System.out.println("Username : ");
		String u =lireChaine();
		System.out.println("Password : ");	
		 String p =lireChaine();
		 Sopramon s = daoSopramon.findByUtilisateur(u, p);
		 System.out.println("Sopramon : " + s.getPseudo());
		
	}
	


		public static void main(String[] args) {

	//printItems();
		
		findByUtilisateur();
		
		
		
			}

		
		
			
		}	
			

	
		


