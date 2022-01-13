package pckExercices;

import java.util.Scanner;

public class MainExercice19 {

	public static void main(String[] args) {
		// Exercice consistant à évaluer le signe d'un int fourni par l'utilisateur
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 500;
		System.out.println("Veuillez saisir un nombre entier (les négatifs sont autorisés) :");
		a = sc.nextInt();
		b = (a < 0) ? -1 : (a == 0) ? 0 : 1;
		System.out.println(b);
		sc.close();
	}

}