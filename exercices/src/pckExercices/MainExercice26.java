package pckExercices;

import java.util.Scanner;

public class MainExercice26 {

	public static void main(String[] args) {

		// Exercice constituant à faire entrer par l'utilisateur deux valeurs entières
		// et un opérateur, et à renvoyer l'opération effectuée
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		char operator = '0';

		System.out.println("Veuillez entrer un entier :");
		a = sc.nextInt();
		sc.nextLine();
		System.out.println("Vous avez saisi : " + a);
		System.out.println("Veuillez entrer un entier :");
		b = sc.nextInt();
		sc.nextLine();
		System.out.println("Vous avez saisi : " + b);
		System.out.println("Quelle opération souhaitez vous effectuer ? (+ - * /)");
		operator = sc.nextLine().charAt(0);

		switch (operator) {

		case '+':
			System.out.println(a + "+" + b + "=" + (a + b));
			break;
		case '-':
			System.out.println(a + "-" + b + "=" + (a - b));
			break;
		case '*':
			System.out.println(a + "*" + b + "=" + (a * b));
			break;
		case '/':
			System.out.println(a + "/" + b + "=" + ((double) ((double) a / (double) b)));
			break;
		default:
			System.out.println("Erreur sur le choix de l'opérateur.");
			break;
		}
		sc.close();

	}

}