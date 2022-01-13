package pckExercices;

import java.util.Scanner;

public class MainExercice47 {

	public static void main(String[] args) {
		// Exercice consistant à saisir n valeurs int dans un tableau, et à afficher le
		// min.

		Scanner sc = new Scanner(System.in);
		int sizeTab = -1;
		while (sizeTab < 1) {
			System.out.println(
					"Veuillez saisir une taille pour votre tableau (La taille doit être strictement positive): ");
			sizeTab = sc.nextInt();
			sc.nextLine();
		}

		int[] TableauEntiers = new int[sizeTab];

		for (int i = 0; i < sizeTab; i++) {
			System.out.println("Veuillez saisir un entier :");
			TableauEntiers[i] = sc.nextInt();
			sc.nextLine();
		}

		System.out.println("Voici les entiers contenus dans le tableau :");
		for (int i = 0; i < sizeTab; i++) {
			System.out.print(TableauEntiers[i] + "; ");

		}
		System.out.print("\nVoici la valeur maximale du tableau : ");
		int maxTab = TableauEntiers[0];
		for (int i = 0; i < sizeTab; i++) {
			if (maxTab < TableauEntiers[i])
				maxTab = TableauEntiers[i];
		}
		System.out.println(maxTab);
		sc.close();
	}

}