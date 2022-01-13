package pckExercices;

import java.util.Scanner;

public class MainExercice41 {

	public static void main(String[] args) {
		// Exercice consistant à évaluer le nombre de lettres 'e' dans un texte saisi
		// par l'utilisateur

		Scanner sc = new Scanner(System.in);
		String str = new String();
		int nbe = 0;
		System.out.println("Veuillez saisir un texte : ");
		str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e')
				nbe++;
		}
		System.out.println("Le caractère 'e' apparaît " + nbe + " fois dans votre texte.");
		sc.close();

	}

}