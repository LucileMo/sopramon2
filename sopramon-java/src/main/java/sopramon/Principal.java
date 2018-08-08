package sopramon;

import java.util.Date;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import java.text.SimpleDateFormat;
import sopramon.model.Combat;
import sopramon.model.Sopramon;
import sopramon.model.Utilisateur;
import sopramon.IDAO.IDAOSopramon;
import sopramon.IDAO.IDAOCombat;
import sopramon.IDAO.IDAOUtilisateur;

public class Principal {

	static int lireEntier() {

		Scanner myScanner = new Scanner(System.in);

		try {
			return myScanner.nextInt();
		}

		catch (Exception ex) {
			return 0;

		}

	}

	static String lireChaine() {
		Scanner myScanner = new Scanner(System.in);
		try {
			return myScanner.next();
		} catch (Exception ex) {
			return null;
		}
	}

	/*
	 * public void findByUsernameAndPassword() { // IDAOUtilisateur daoUtilisateur =
	 * new DAOUtilisateurHibernate(); // IDAOSopramon daoSopramon = new
	 * DAOSopramonHibernate();
	 * 
	 * System.out.println("Username : "); String u = lireChaine();
	 * System.out.println("Password : "); String p = lireChaine(); Sopramon s =
	 * (Sopramon) daoutilisateur.findByUsernameAndPassword(u, p);
	 * System.out.println("Sopramon : " + s.getPseudo());
	 * 
	 * }
	 */

	@Autowired
	private IDAOSopramon daosopramon;

	@Autowired
	private IDAOUtilisateur daoutilisateur;

	@Autowired
	private IDAOCombat daocombat;

	public void run(String[] args) {

		System.out.println("Bienvenue dans Sopramongame !");
		System.out.println("Quel est votre nom de joueur et votre mot de passe ? ");

		System.out.println("Username : ");
		String u = lireChaine();
		System.out.println("Password : ");
		String p = lireChaine();
		Sopramon s = (Sopramon) daoutilisateur.findByUsernameAndPassword(u, p);
        
		
		if (s != null) {
			System.out.println("Votre sopramon : " + s.getPseudo());

			int m = 0;
			while (m < 1 || m > 2) {
				System.out.println("....................");
				System.out.println("........menu........");
				System.out.println("....................");

				System.out.println("1 : Liste des Sopramons");

				System.out.println("2 : Affronter le Boss");

				System.out.println("Saisir un mode : ");

				m = lireEntier();
//      IDAOSopramon daoSopramon = new DAOSopramonSQL();
//      IDAOCombat daoCombat = new DAOCombatSQL();
//      IDAOUtilisateur daoUtilisateur = new DAOUtilisateurSQL();

				switch (m) {
				case 1:
					System.out.println("Liste des Sopramons : ");

					for (Sopramon p1 : daosopramon.findAll()) {
						System.out.println("Pour " + p1.getPseudo());
						System.out.println(p1.getCapacite().getPointsdevie() + " points de vie.");
						System.out
								.println("Signe : " + p1.getSigne().getNom() + " Type : " + p1.getSigne().getTypeNom());
						System.out.println("-----------------------------");

						/*
						 * private IDAOSopramon daosopramon; daosopramon.findAll();
						 */

					}

					break;
				case 2:
					System.out.println("Combat contre le boss !");

					System.out.println("S�l�ctionner l'identifiant de votre Sopramon : ");
					for (Sopramon p2 : daosopramon.findAll()) {
						System.out.println(p2.getPseudo());
						System.out.println(p2.getCapacite().getPointsdevie() + " points de vie.");
						System.out.println(p2.getSigne().getNom());
						System.out.println("-----------------------------");
					}
					int p2 = lireEntier();

					System.out.println("Indiquer la date du jour : ");
					String j = lireChaine();

					try {
						SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
						Date date = formatter.parse(j);

						Combat nouveauCombat = new Combat();

						// nouveauCombat.setSopramon(s);
						nouveauCombat.setDate(date);

						daocombat.save(nouveauCombat);
					}

					catch (Exception e) {
						e.printStackTrace();
					}
					break;

				default:
					System.out.println("Veuillez saisir � nouveau : ");
					m = lireEntier();

				}
			}

		}

		else {
			System.out.println("Mauvaise saisie ou compte inexistant. ");
			System.out.println("Creer un compte");

			System.out.println("Nom : ");
			String a = lireChaine();
			System.out.println("Prenom : ");
			String b = lireChaine();
			System.out.println("Nom de joueur : ");
			String c = lireChaine();
			System.out.println("Mot de passe : ");
			String g = lireChaine();
			System.out.println("Date de Naissance : ");

			String d = lireChaine();
			System.out.println("Signe Astrologique : ");
			String f = lireChaine();

			System.out.println("F�licitations votre compte est cr�� ! Donnez maintenant un nom � votre Sopramon : ");
			String n = lireChaine();
			System.out.println("F�licitations votre Sopramon est n� !");

			// IDAOSopramon daoSopramon = new DAOSopramonSQL();

			try {
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				Date date = formatter.parse(d);

				Utilisateur nouveauUtilisateur = new Utilisateur();

				nouveauUtilisateur.setNom(a);
				nouveauUtilisateur.setPrenom(b);
				nouveauUtilisateur.setUsername(c);
				nouveauUtilisateur.setPassword(g);

				daoutilisateur.save(nouveauUtilisateur);

				Sopramon nouveauSopramon = new Sopramon();

				nouveauSopramon.setNom(n);
				nouveauSopramon.setDateNaissance(date);

				daosopramon.save(nouveauSopramon);

			}

			catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}
