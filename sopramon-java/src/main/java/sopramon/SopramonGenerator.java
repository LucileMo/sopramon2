package sopramon;

import java.util.Date;

<<<<<<< Updated upstream
import org.springframework.beans.factory.annotation.Autowired;
=======
>>>>>>> Stashed changes

import sopramon.IDAO.IDAOItem;
import sopramon.IDAO.IDAOSopramon;
import sopramon.IDAO.IDAOCombat;
import sopramon.IDAO.IDAO;
import sopramon.IDAO.IDAOUtilisateur;
import sopramon.model.Item;
import sopramon.model.Utilisateur;



<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
public class SopramonGenerator {
	


<<<<<<< Updated upstream
		@Autowired
			
			private IDAOSopramon daosopramon;
			
			public void run (String[] args) {

				daosopramon.findUnSopramon("planche"); 
			}	
				
    	
    	
=======
    public static void(String[] args) {
>>>>>>> Stashed changes

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
