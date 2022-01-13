package pckExercices;

import java.util.Scanner;

public class MainExercice310 {

	public static void main(String[] args) {
		// Exercice consistant à calculer le nombre de chiffres utilisés pour numéroter
		// les pages d'un livre de moins de 10 000 pages

		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum = 0;

		System.out.println("Entrez le nombre de pages (< 10 000) :");
		i = sc.nextInt();
		sc.nextLine();

		while (i > 0) {

			if (i > 999)
				sum += 4;
			else if (i > 99)
				sum += 3;
			else if (i > 9)
				sum += 2;
			else
				sum += 1;

			i--;
		}
		System.out.println("Le nombre de chiffres utilisés pour numéroter les pages est : " + sum);
		sc.close();
	}

}