package sopramon.IDAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopramon.model.Sopramon;

	
	public interface IDAOSopramon extends JpaRepository<Sopramon, Integer> {
		
		@Query("select s from Sopramon s where s.pseudo = :Caprilu")
		public Sopramon findUnSopramon(@Param("Caprilu") String pseudo);
		
	//	public List<Sopramon> findByPrixBetween(double prix1, double prix2);
		
		public Sopramon save (Sopramon entity);
		
		public List<Sopramon> findByPseudo(String libelle);
		
		//public List<Sopramon> findByPrix(String libelle);

		public Sopramon findFirstByNom(String libelle);

		public List<Sopramon> findTop10ByNomContainingOrderByIdDesc(String libelle);

		public int countByNomContaining(String libelle);
		
		
		
		
	}
	 