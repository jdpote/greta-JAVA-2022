package pckExercices;

import java.util.Scanner;

public class MainExercice22 {

	public static void main(String[] args) {
		// Exercice ayant pour but de résoudre une équation du premier degré
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 0;
		System.out.println("Nous vous proposons de résoudre l'équation ax + b = 0");
		System.out.println("Veuillez saisir une valeur pour a");
		a = sc.nextInt();
		sc.nextLine();
		System.out.println("Veuillez saisir une valeur pour b");
		b = sc.nextInt();
		sc.nextLine();
		switch (a) {
		case 0:
			if (b == 0)
				System.out
						.println("L'équation " + a + "x + " + b + " = 0 est vérifiée quelle que soit la valeur de x !");
			else
				System.out.println("L'équation " + a + "x + " + b + " = 0 n'a pas de solution...");
			break;
		default:
			System.out.println(a + "x + " + b + " = 0  est vérifiée lorsque x = " + ((double) -b / (double) a));
		}
		sc.close();
	}

}