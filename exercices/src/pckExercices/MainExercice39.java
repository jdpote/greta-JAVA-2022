package pckExercices;

import java.util.Scanner;

public class MainExercice39 {

	public static void main(String[] args) {
		// Exercice constituant à afficher des lignes d'étoiles de taille
		// décroissante
		Scanner sc = new Scanner(System.in);

		System.out.println("Quelle taille pour votre jolie pyramide ?");
		int k = sc.nextInt();
		sc.nextLine();

		while (k > 0) {
			int i = k;
			while (i > 0) {
				System.out.print("*");
				i--;
			}
			System.out.print("\n");
			k--;
		}
		sc.close();
	}

}

/*
 * Pour utiliser des boucles for à la place de while, remplacer par le code
 * suivant entre le premier println et sc.close();
 * 
 * 
 * for (int k = sc.nextInt();k>0; k--){ for(int i=k; i>0; i--){
 * System.out.print("*"); } System.out.print("\n"); }
 */