package be.businesstraining.client;

import be.businesstraining.metier.Calcul;

public class App {
	public static void main(String[] args) {
		Calcul calcul = new Calcul();
		int somme = calcul.additionner(11, 22);
		System.out.println(somme);
		
		
	}
}
