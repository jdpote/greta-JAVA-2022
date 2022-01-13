package pckExercices;

import java.util.Scanner;

public class MainExercice42 {

	public static void main(String[] args) {
		// Exercice consistant à évaluer si un caractère entré par l'utilisateur
		// appartient à un tableau fourni
		char tableauCaractere[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		Scanner sc = new Scanner(System.in);
		char saisie = ' ';
		boolean charDansTab = false;

		System.out.println("Veuillez saisir une lettre minuscule :");
		saisie = sc.nextLine().charAt(0);

		for (int i = 0; i < tableauCaractere.length; i++) {
			charDansTab = (charDansTab || saisie == tableauCaractere[i]);
		}
		if (charDansTab)
			System.out.println(saisie + " se trouve bien entre a et g");
		else
			System.out.println(saisie + " ne se trouve pas entre a et g");
		sc.close();
	}

}