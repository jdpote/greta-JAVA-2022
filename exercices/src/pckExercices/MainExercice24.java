package pckExercices;

import java.util.Scanner;

public class MainExercice24 {

	// Exercice ayant pour objectif de vérifier si trois entiers donnés sont rangés
	// apr ordre croissant
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b, c = a = b = 0;
		System.out.println("Veuillez saisir un entier :");
		a = sc.nextInt();
		sc.nextLine();
		System.out.println("Veuillez saisir un autre entier :");
		b = sc.nextInt();
		sc.nextLine();
		System.out.println("Veuillez saisir un dernier entier :");
		c = sc.nextInt();
		sc.nextLine();

		if (a > b || b > c)
			System.out.println("Les entiers saisis ne sont pas dans l'ordre croissant.");
		else
			System.out.println("Les entiers saisis sont dans l'ordre croissant.");
		sc.close();

	}
}