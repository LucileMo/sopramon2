package sopramon.IDAO;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopramon.IDAO.IDAO;
import sopramon.model.Utilisateur;

public interface IDAOUtilisateur extends IDAO<Utilisateur>{

	@Query("select c from combat c where c.id = :1")
	public Utilisateur findUnCombat(@Param("") String nom);
	
//	public List<Sopramon> findByPrixBetween(double prix1, double prix2);
	
	public Utilisateur save (Utilisateur entity);
	
	public List<Utilisateur> findByNom(String nom);
	
	//public List<Sopramon> findByPrix(String libelle);

	public Utilisateur findFirstByNom(String nom);

	public List<Utilisateur> findTop10ByNomContainingOrderByIdDesc(String nom);

	public int countByNomContaining(String nom);

}