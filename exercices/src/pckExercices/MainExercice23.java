package pckExercices;

import java.util.Scanner;

public class MainExercice23 {

	public static void main(String[] args) {
		// Exercice consistant à calculer le montant d'une remise en fonction du prix

		Scanner sc = new Scanner(System.in);
		double prix = 0.0;
		double remise = 0.0;
		System.out.println("Veuillez saisir le prix de votre article.");
		prix = sc.nextDouble();
		sc.nextLine();
		remise = prix < 100 ? 0.0 : prix <= 500 ? 0.05 : 0.08;
		System.out.println("La remise est de 5% à partir de 100€, et de 8% au delà de 500€");
		System.out.println("Votre article, au prix initial de " + prix + "€, coûtera " + (prix * (1 - remise))
				+ "€ après remise !");
		sc.close();
	}

}