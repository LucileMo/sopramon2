package sopramon.DAO;

import sopramon.model.Sopramon;
import sopramon.DAO.IDAO;

public interface IDAOSopramon extends IDAO<Sopramon>{

	public Sopramon findByUtilisateur(String username, String password);

}