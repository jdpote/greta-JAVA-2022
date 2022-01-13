package pckExercices;

import java.util.Scanner;

public class MainExercice17 {

	public static void main(String[] args) {
		// Exercice consistant à demander deux entiers à l'utilisateur, et à produire
		// les résultats des 4
		// opérations classiques (i.e. somme, différence, produit et quotient)

		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 1;
		System.out.println("Veuillez entrer un nombre entier : ");
		a = sc.nextInt();
		System.out.println("Veuillez entrer un autre nombre entier NON NUL: ");
		b = sc.nextInt();
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " x " + b + " = " + (a * b));
		System.out.println(a + "/" + b + " = " + ((double) a / (double) b));
		sc.close();

	}

}