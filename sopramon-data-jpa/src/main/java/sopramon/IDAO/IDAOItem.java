package sopramon.IDAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopramon.model.Coup;
import sopramon.model.Item;
import sopramon.model.Sopramon;

	
	public interface IDAOItem extends JpaRepository<Item, Integer> {
		
		
		
		
	}
	 