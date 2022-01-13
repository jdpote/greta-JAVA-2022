package pckExercices;

import java.util.Scanner;

public class MainExercice12 {

	public static void main(String[] args) {
		// Exercice consistant à rentrer un montant unitaire HT, une TVA et un nombre
		// d'articles pour calculer un prix

		int HT = 0;
		double TVA = 0.0;
		int nbArticles = 0;
		double prixFinal = 0.0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez entrer le prix (unitaire) de l'article :");
		HT = sc.nextInt();
		sc.nextLine();
		System.out.println("Veuillez entrer le taux de TVA sur l'article :");
		TVA = sc.nextDouble();
		sc.nextLine();
		System.out.println("Veuillez entrer le nombre désiré d'articles :");
		nbArticles = sc.nextInt();
		sc.nextLine();
		prixFinal = (double) HT * (1.0 + TVA) * nbArticles;

		System.out.println(
				"Acheter " + nbArticles + " articles à " + HT + "€ pièce hors taxe, (sachant que la TVA s'élève \n à "
						+ (TVA * 100) + "%) vous coûterait " + prixFinal + "€");
		sc.close();

	}

}