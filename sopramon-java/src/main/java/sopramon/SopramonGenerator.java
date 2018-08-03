package sopramon;

import java.util.Date;



import sopramon.DAO.IDAOItem;
import sopramon.DAO.IDAOSopramon;
import sopramon.DAO.IDAOUtilisateur;
import sopramon.DAO.Hibernate.DAOItemHibernate;
import sopramon.DAO.Hibernate.DAOUtilisateurHibernate;
import sopramon.model.Item;
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
        

        // Ajout d'un Item
        IDAOItem daoItem = new DAOItemHibernate();
        Item myItem = new Item();

		myItem.setNom("");
		myItem.setPrix("");
		myItem.setCapacite("");
		myItem.setStock("");

        daoItem.save(myItem);
        
        
        
        
    }

}