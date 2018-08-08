package sopramon.IDAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopramon.model.Coup;
import sopramon.model.Item;
import sopramon.model.Sopramon;

	
	public interface IDAOItem extends JpaRepository<Item, Integer> {
		
		@Query("select c from Item s where s.id = :1")
		public Item findUnItem(@Param("1") String id);
		
	//	public List<Item> findByPrixBetween(double prix1, double prix2);
		
		public Item save (Item entity);
		
		public List<Item> findByid(String libelle);
		
		//public List<Item> findByPrix(String libelle);

		public Item findFirstByNom(String libelle);

		public List<Item> findTop10ByNomContainingOrderByIdDesc(String libelle);

		public int countByNomContaining(String libelle);
		
		
		
		
	}
	 