package pckExercices;

import java.util.Scanner;

public class MainExercice311 {

	public static void main(String[] args) {
		// Exercice constituant à évaluer si un mot rentré par l'utilisateur est un
		// palindrome

		Scanner sc = new Scanner(System.in);
		String strSaisi = new String();
		String strReverse = new String();
		System.out.println("Veuillez saisir un mot :");

		strSaisi = sc.nextLine();
		strSaisi = strSaisi.toLowerCase();
		for (int i = 0; i < strSaisi.length(); i++) {
			strReverse = strReverse + strSaisi.charAt(strSaisi.length() - i - 1);

		}
		strReverse = strReverse.toLowerCase();
		System.out.println(strSaisi + ", quand on le renverse, donne " + strReverse + ".");
		if (strSaisi.compareTo(strReverse) == 0)
			System.out.println(strSaisi + " est donc bien un palindrome.");
		else
			System.out.println(strSaisi + " n'est donc pas un palindrome.");
		sc.close();
	}

}