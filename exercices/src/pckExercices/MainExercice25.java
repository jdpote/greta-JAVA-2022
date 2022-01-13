package pckExercices;

import java.util.Scanner;

public class MainExercice25 {

	public static void main(String[] args) {
		// Exercice consistant à trier 3 nombres réels saisis par l'utilisateur

		Scanner sc = new Scanner(System.in);
		double a, b, c = a = b = 0.0;
		System.out.println("Veuillez saisir une valeur réelle :");
		a = sc.nextDouble();
		sc.nextLine();
		System.out.println("Veuillez saisir une autre valeur réelle :");
		b = sc.nextDouble();
		sc.nextLine();
		System.out.println("Veuillez saisir une dernière valeur réelle :");
		c = sc.nextDouble();
		sc.nextLine();

		if (a > b) {
			a = a + b;
			b = a - b;
			a = a - b;
		}
		if (b > c) {
			b = b + c;
			c = b - c;
			b = b - c;
		}
		if (a > b) {
			a = a + b;
			b = a - b;
			a = a - b;
		}

		System.out.println(a + "<=" + b + "<=" + c);
		sc.close();

	}

}