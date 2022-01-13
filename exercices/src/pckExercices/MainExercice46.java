package pckExercices;

import java.util.Scanner;

public class MainExercice46 {

	public static void main(String[] args) {
		// Exercice consistant à saisir 5 valeurs int dans un tableau, et à afficher le
		// min.

		Scanner sc = new Scanner(System.in);
		int[] TableauEntiers = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Veuillez saisir un entier :");
			TableauEntiers[i] = sc.nextInt();
			sc.nextLine();
		}

		System.out.println("Voici les entiers contenus dans le tableau :");
		for (int i = 0; i < 5; i++) {
			System.out.print(TableauEntiers[i] + "; ");

		}
		System.out.print("\nVoici la valeur maximale du tableau : ");
		int maxTab = TableauEntiers[0];
		for (int i = 0; i < 5; i++) {
			if (maxTab < TableauEntiers[i])
				maxTab = TableauEntiers[i];
		}
		System.out.println(maxTab);
		sc.close();
	}

}