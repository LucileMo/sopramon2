package sopramon;

import java.util.Date;

import sopramon.DAO.IDAOSopramon;
import sopramon.DAO.IDAOUtilisateur;
import sopramon.DAO.Hibernate.DAOUtilisateurHibernate;
import sopramon.model.Utilisateur;

public class SopramonGenerator {

	public static void main(String[] args) {

		// Ajout d'un Utilisateur/Sopramon
		IDAOUtilisateur daoUtilisateur = new DAOUtilisateurHibernate();
		Utilisateur myUtilisateur = new Utilisateur();

		myUtilisateur.setNom("");
		myUtilisateur.setPrenom("");
		myUtilisateur.setUsername("");
		myUtilisateur.setPassword("");

		daoUtilisateur.save(myUtilisateur);
		
		
		
	}

}
