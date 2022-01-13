package pckExercices;

import java.util.Scanner;

public class MainExercice48 {

	public static void main(String[] args) {
		// Exercice consistant à faire remplir un tableau d'entiers par l'utilisateur.
		// Le programme créée en conséquence un tableau de pairs et un tableau d'impairs
		// qu'il remplit.

		Scanner sc = new Scanner(System.in);
		int[] tableauEntiers = new int[10];
		int sizeEven = 0;
		int sizeOdd = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Veuillez saisir un entier : ");
			tableauEntiers[i] = sc.nextInt();
			sc.nextLine();
			if (tableauEntiers[i] % 2 == 0)
				sizeEven++;
			else
				sizeOdd++;
		}
		int[] tableauPairs = new int[sizeEven];
		int[] tableauImpairs = new int[sizeOdd];
		int k1 = 0;
		int k2 = 0;

		for (int i = 0; i < 10; i++) {
			if (tableauEntiers[i] % 2 == 0) {
				tableauPairs[k1] = tableauEntiers[i];
				k1++;
			} else {
				tableauImpairs[k2] = tableauEntiers[i];
				k2++;
			}
		}
		System.out.println("Tableau de pairs :");
		for (int i = 0; i < sizeEven; i++) {
			System.out.print(tableauPairs[i] + "; ");
		}
		System.out.println("");

		System.out.println("Tableau d'impairs :");
		for (int i = 0; i < sizeOdd; i++) {
			System.out.print(tableauImpairs[i] + "; ");
		}

		sc.close();
	}

}