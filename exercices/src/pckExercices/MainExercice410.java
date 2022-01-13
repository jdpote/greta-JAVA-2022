package pckExercices;

import java.util.Scanner;

public class MainExercice410 {

	public static void main(String[] args) {
		// Exercice consistant à afficher une jolie pyramide d'étoiles à l'aide d'un
		// array de Strings en fonction du nombre de lignes renseigné apr l'utilisateur

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nombre de lignes pour notre jolie pyramide :");
		int lignes = sc.nextInt();

		for (int i = 0; i < lignes; i++) {
			for (int j = 0; j < lignes - i - 1; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}

			for (int j = 0; j < lignes - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		sc.close();
	}

}