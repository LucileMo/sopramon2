package sopramon;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import sopramon.IDAO.IDAOItem;
import sopramon.IDAO.IDAOSopramon;
import sopramon.IDAO.IDAOCombat;
import sopramon.IDAO.IDAO;
import sopramon.IDAO.IDAOUtilisateur;
import sopramon.model.Item;
import sopramon.model.Utilisateur;



public class SopramonGenerator {

		@Autowired
			
			private IDAOSopramon daosopramon;
			
			public void run (String[] args) {

				daosopramon.findUnSopramon("planche"); 
			}	
				
    	
    	

        // Ajout d'un Utilisateur/Sopramon
      /* daoUtilisateur = new DAOUtilisateurHibernate();
        Utilisateur myUtilisateur = new Utilisateur();

        myUtilisateur.setNom("");
        myUtilisateur.setPrenom("");
        myUtilisateur.setUsername("");
        myUtilisateur.setPassword("");

        daoUtilisateur.save(myUtilisateur);*/
        

        // Ajout d'un Item
  /*      IDAOItem daoItem = new DAOItemHibernate();
        Item myItem = new Item();

		myItem.setNom("Arc");
		myItem.setPrix(54);
		myItem.setCapacite("Tire des fleches");
		myItem.setStock(58);

        daoItem.save(myItem);
        
        
    */    
        
    }
