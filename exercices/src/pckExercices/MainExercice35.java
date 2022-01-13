package pckExercices;

import java.util.Scanner;

public class MainExercice35 {

	public static void main(String[] args) {
		// Exercice consistant à afficher tous les pairs compris entre deux bornes
		// saisis par l'utilisateur

		Scanner sc = new Scanner(System.in);
		int bBasse = 0;
		System.out.println("Veuillez saisir une borne entière inférieure :");
		bBasse = sc.nextInt();
		sc.nextLine();
		int bHaute = bBasse - 1;
		while (bHaute < bBasse) {
			System.out.println("Veuillez saisir une borne entière supérieure :");
			bHaute = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Les nombres pairs strictement compris entre " + bBasse + " et " + bHaute + " sont :");
		if (bBasse % 2 == 1)
			bBasse++;
		else
			bBasse += 2;

		if (bHaute % 2 == 1)
			bHaute--;
		else
			bHaute -= 2;

		while (bBasse <= bHaute) {
			System.out.print(bBasse + " ; ");
			bBasse += 2;
		}
		sc.close();
	}

}