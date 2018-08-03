package sopramon;

import sopramon.DAO.IDAOItem;
import sopramon.DAO.Hibernate.DAOItemHibernate;
import sopramon.model.Item;

public class SopramonHibernate {


		public static void main(String[] args) {

			printItems();

		}

		public static void printItems() {
			IDAOItem daoItem = new DAOItemHibernate();

			for (Item i : daoItem.findAll()) {
				System.out.println(i.getNom());
			}
		}

	}

