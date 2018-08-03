package sopramon;

import sopramon.DAO.IDAOItem;
import sopramon.DAO.Hibernate.DAOHibernate;
import sopramon.DAO.Hibernate.DAOItemHibernate;
import sopramon.model.Item;

public class SopramonHibernate {

	public static class PrincipalHibernate {

		public static void main(String[] args) {
//			printItems();
//		printFournisseurs();
//		printProduits();
//		printProduitByClientId(2);
//		printProduitByFournisseurId(1);

    }

			public static void printItems() {
				IDAOItem daoItem = new DAOItemHibernate();
				
				for (Item i : IDAOItem.findAll()) {
					System.out.println(i.getNom());
				}
			}
		
			
			
	}

	}

}