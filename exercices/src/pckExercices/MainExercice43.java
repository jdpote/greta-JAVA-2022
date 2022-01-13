package pckExercices;

import java.util.Scanner;

public class MainExercice43 {
	public static void main(String[] args) {
		// Exercice consistant Ã  supprimer toutes les lettres 'e' d'un texte saisi par
		// l'utilisateur

		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.println("Veuillez saisir un texte :");
		str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				str = str.substring(0, i) + str.substring(i + 1, str.length());
			}

		}
		System.out.println("Sans e, votre texte s'écrit : " + str);
		sc.close();
	}

}