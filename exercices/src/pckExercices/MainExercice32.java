package pckExercices;

import java.util.Scanner;

public class MainExercice32 {

	public static void main(String[] args) {
		// Exercice constituant à calculer la somme des carrés de 1 à n, n étant saisi
		// par l'utilisateur

		Scanner sc = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		System.out.println("Veuillez saisir un entier :");
		n = sc.nextInt();
		sc.nextLine();
		System.out.print("La somme des carrés d'entiers compris entre 1 et " + n + " vaut ");
		while (n > 0) {
			sum = sum + n * n;
			n--;
		}
		System.out.println(sum + ".");
		sc.close();

	}

}