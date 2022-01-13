package pckExercices;

import java.util.Scanner;

public class MainExercice31 {

	public static void main(String[] args) {
		// Exercice constituant à retourner la somme d'une série d'entiers saisie par
		// l'utilisateur.
		System.out.println(" Vous allez saisir des entiers. Pour terminer, saisissez 0.");

		Scanner sc = new Scanner(System.in);
		int a = 1;
		int sum = 0;
		while (a != 0) {
			System.out.println("Saisissez une valeur : ");
			a = sc.nextInt();
			sc.nextLine();
			sum = sum + a;
		}
		System.out.println("La somme des entiers saisis vaut : " + sum);
		sc.close();

	}

}