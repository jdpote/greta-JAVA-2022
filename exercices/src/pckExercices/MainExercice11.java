package pckExercices;

import java.util.Scanner;

public class MainExercice11 {

	public static void main(String[] args) {
		// Exercice consistant à additionner deux short rentrés par l'utilisateur.
		short val1 = 0;
		short val2 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez rentrer une première valeur : ");
		val1 = sc.nextShort();
		System.out.println("Vouz avez saisi la valeur : " + val1);
		sc.nextLine();
		System.out.println("Veuillez rentrer une deuxième valeur : ");
		val2 = sc.nextShort();
		System.out.println("Vouz avez saisi la valeur : " + val2);
		sc.nextLine();

		System.out.println("la somme des valeurs " + val1 + " et " + val2 + " est égale à " + (val1 + val2));

		sc.close();

	}

}