package pckExercices;

import java.util.Scanner;

public class MainExercice49 {
	public static void main(String[] args) {
		// Exercice consistant à renseigner deux tailles : celle d'un tableau pair et
		// celle d'un impair. L'utilisateur remplira alors ces deux tableaux
		// simultanément.
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien de nombres pairs allez-vous indiquer ?");
		int sizeEven = sc.nextInt();
		sc.nextLine();
		System.out.println("Combien de nombres impairs allez-vous indiquer ?");
		int sizeOdd = sc.nextInt();
		sc.nextLine();
		int[] tableauPairs = new int[sizeEven];
		int[] tableauImpairs = new int[sizeOdd];
		int temp = 0;
		int k1 = 0;
		int k2 = 0;

		for (int i = 0; i < sizeEven + sizeOdd; i++) {
			System.out.println("Veuillez saisir un entier : ");
			temp = sc.nextInt();
			sc.nextLine();
			if (temp % 2 == 0) {
				tableauPairs[k1] = temp;
				k1++;
			} else {
				tableauImpairs[k2] = temp;
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