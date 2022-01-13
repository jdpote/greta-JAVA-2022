package pckExercices;

import java.util.Scanner;

public class MainExercice15 {
	public static void main(String[] args) {
		// Exercice consistant à convertir une durée tapée au clavier au format h;m;s en
		// secondes

		Scanner sc = new Scanner(System.in);
		int input = 0;
		int output = 0;
		System.out.println("Veuillez indiquer un nombre d'heures : ");
		input = sc.nextInt();
		output = output + 3600 * input;
		System.out.println("Veuillez indiquer un nombre de minutes : ");
		input = sc.nextInt();
		output = output + 60 * input;
		System.out.println("Veuillez indiquer un nombre de secondes : ");
		input = sc.nextInt();
		output = output + input;
		System.out.println("Tout ce joli temps est équivalent à une durée totale de " + output + "s.");
		sc.close();

	}

}