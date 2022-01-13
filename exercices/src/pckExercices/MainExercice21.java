package pckExercices;

import java.util.Scanner;

public class MainExercice21 {

	public static void main(String[] args) {
		// Exercice consistant à déterminer si un nombre saisi par l'utilisateur est
		// pair ou impair

		Scanner sc = new Scanner(System.in);
		int input = 0;
		System.out.println("Veuillez saisir un nombre entier : ");
		input = sc.nextInt();
		sc.nextLine();
		switch (input % 2) {
		case 0:
			System.out.println("Le nombre " + input + " est pair.");
			break;
		case 1:
			System.out.println("Le nombre " + input + " est impair.");
			break;
		}
		sc.close();

	}

}