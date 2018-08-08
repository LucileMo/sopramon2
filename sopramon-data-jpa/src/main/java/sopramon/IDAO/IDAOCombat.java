package sopramon.IDAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import sopramon.model.Combat;


public interface IDAOCombat extends JpaRepository<Combat, Integer> {
	
	@Query("select c from combat c where c.id = :1")
	public Combat findUnCombat(@Param("1") int combatid);
	
//	public List<Sopramon> findByPrixBetween(double prix1, double prix2);
	
	public Combat save (Combat entity);
	
	public List<Combat> findById(int combatid);
	
	//public List<Sopramon> findByPrix(String libelle);

	public Combat findFirstById(int combatid);

	public List<Combat> findTop10ByIdContainingOrderByIdDesc(int combatid);

	public int countByIdContaining(int combatid);

}