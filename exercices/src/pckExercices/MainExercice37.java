package pckExercices;

import java.util.Scanner;

public class MainExercice37 {

	public static void main(String[] args) {
		// Exercice consistant à  display la table de multiplication d'un entier saisi
		// par l'utilisateur

		Scanner sc = new Scanner(System.in);
		int a = 0;
		int i = 0;
		char userBreakLoop = 'O';

		while (userBreakLoop != 'N') {
			System.out.println("De quel entier voulez-vous obtenir la table ?");
			a = sc.nextInt();
			sc.nextLine();

			while (i < 10) {
				System.out.println(a + "x" + i + "=" + (a * i));
				i++;
			}

			System.out.println("Voulez-vous afficher une autre table ? O/N");
			userBreakLoop = sc.nextLine().charAt(0);
			i = 0;
		}
		System.out.println("Bonne journée !");
		sc.close();
	}

}