package be.businesstraining.repository;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import be.businesstraining.domain.Compte;

public class ComptesRepositoryImpl implements IComptesRepository {
	
	private static String url = "jdbc:mysql://localhost:3306/BanqueDB";
	private static String user="root";
	private static String password = "password";

	
	// CRUD ...
	/* (non-Javadoc)
	 * @see be.businesstraining.dao.IComptesDAO#findAll()
	 */
	@Override
	public List<Compte> findAll() {
		
		List<Compte> resultat = new ArrayList<>();
		
		try {
			// Charger le connector en mémoire
			Class.forName("com.mysql.jdbc.Driver");

			// Se connecter sur la BDD	
			
			Connection connection = DriverManager.getConnection(url, user, password);

			// Elaborer un énoncé
			Statement statement = connection.createStatement();

			String sql = "SELECT * FROM COMPTES";
			
			// Lancer l'énoncé et récuprér le résulatSet
			ResultSet resultSet =  statement.executeQuery(sql );

			// Parcourir le resultset et afficher les rows
			while (resultSet.next()) {
				String numero = resultSet.getString("Numero");
				String proprio = resultSet.getString("Proprietaire");
				BigDecimal solde = resultSet.getBigDecimal("Solde");	
				
				resultat.add(new Compte(numero, proprio, solde));
			//	System.out.println("===> Compte : "+ numero+ " - "+ proprio+ " - "+ solde);
				
			}

			// Clean up ...
			resultSet.close();
			statement.close();
			connection.close();
		} catch (ClassNotFoundException  | SQLException e) {
			System.out.println("LOG - Attention, il y a eu l'exception : "+e);
		}

		
		return resultat;
	}

}
