package sopramon;

import java.util.Date;

import sopramon.DAO.IDAOSopramon;
import sopramon.DAO.IDAOUtilisateur;
import sopramon.DAO.Hibernate.DAOSopramonHibernate;
import sopramon.DAO.Hibernate.DAOUtilisateurHibernate;
import sopramon.model.Sopramon;
import sopramon.model.Utilisateur;




public class SopramonGenerator {
	
	public static void main(String[] args) {
		
		//Ajout d'un Utilisateur/Sopramon
	IDAOUtilisateur daoUtilisateur = new DAOUtilisateurHibernate();
		Utilisateur myUtilisateur = new Utilisateur();
		
		myUtilisateur.setNom("");
		myUtilisateur.setPrenom("");
		myUtilisateur.setUsername("");
		myUtilisateur.setPassword("");
		
		daoUtilisateur.save(myUtilisateur);
		
		//Ajout d'un Sopramon
		IDAOSopramon daoSopramon = new DAOSopramonHibernate();
		Sopramon mySopramon = new Sopramon();
		
		mySopramon.setNom("");
		//mySopramon.setDate(12/05/2000);
		mySopramon.setExperience(1);
		mySopramon.setNiveau(1);
		mySopramon.setArgent(1);
		//mySopramon.setCapacite(myCapacite);
		//mySopramon.setSigne(mySigne);
		
		daoUtilisateur.save(myUtilisateur);
		
		
		
		
	}

}

