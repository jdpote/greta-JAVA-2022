package pckExercices;

import java.util.Scanner;

public class MainExercice16 {

	public static void main(String[] args) {
		// Exercice consistant à convertir une durée en secondes tapée au clavier en un
		// format h;m;s

		int input = 0;
		Scanner sc = new Scanner(System.in);
		int h = 0;
		int m = 0;
		int s = 0;

		System.out.println("Veuillez donner une durée en secondes :");
		input = sc.nextInt();
		System.out.print(input + " secondes est un temps équivalent à ");
		sc.nextLine();
		h = input / 3600;
		input = input % 3600;
		m = input / 60;
		s = input % 60;
		System.out.println(h + "h, " + m + "m, " + s + "s");
		sc.close();

	}

}