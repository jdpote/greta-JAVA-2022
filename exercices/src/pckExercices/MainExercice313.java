package pckExercices;

import java.util.Scanner;

public class MainExercice313 {

	public static void main(String[] args) {
		// Exercice consistant à récupérer les initiales d'un nom entré par
		// l'utilisateur.
		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.println("Veuillez saisir votre nom :");
		str = sc.nextLine();
		System.out.print("Vos initiales sont : " + str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == ' ' || str.charAt(i) == '-')
				System.out.print(str.charAt(i + 1));
		}
		System.out.println("");
		sc.close();
	}

}