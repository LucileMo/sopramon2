package sopramon.DAO.Hibernate;

import java.util.List;

import sopramon.DAO.IDAOItem;
import sopramon.model.Item;


public class DAOItemHibernate extends DAOHibernate implements IDAOItem {
	

	
	 
	
	public List<Item> findAll() {
		return em.createQuery("select p from Produit p", Item.class).getResultList();
	}
	
	
	public Item save(Item entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		return entity;
		}
		
	
	
		public Item findById(int id) {
		return em.find(Item.class, id);
		}
		
	
	
		public void delete(Item entity) {
		em.getTransaction().begin();
		em.remove(em.merge(entity));
		em.getTransaction().commit();
		}
	
	
	public void deleteById(int id) {
		Item myItem = new Item();
		myItem.setId(id);
		delete(myItem);
	}


	public List<Item> findByAchatsClientId(int clientId) {
		return em
				.createQuery("select distinct p from Produit p left join fetch p.achats a where a.client.id = :clientId", Item.class)
				.setParameter("clientId", clientId)
				.getResultList();
	}


	public List<Item> findByGammeFournisseurId(int fournisseurId) {
		return em
				.createQuery("select distinct p from Produit p where p.gamme.fournisseur.id = :fournisseurId", Item.class)
				.setParameter("fournisseurId", fournisseurId)
				.getResultList();
	
	
	
}}