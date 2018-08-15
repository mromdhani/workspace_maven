package be.businesstraining.client;



import be.businesstraining.repository.ComptesRepositoryImpl;
import be.businesstraining.repository.IComptesRepository;

public class App {

	
	public static void main(String[] args) {

	    IComptesRepository dao = new ComptesRepositoryImpl();
	    dao.findAll().forEach(System.out :: println);
		
		
	}
}
