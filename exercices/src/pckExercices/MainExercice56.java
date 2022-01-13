package pckExercices;

import java.util.Scanner;

public class MainExercice56 {
	// Exercice consistant à afficher tous les nombres parfaits entre 1 et une borne
	// supérieure choisie par l'utilisateur. On a fait deux sous fonctions :
	// sommeDiv qui calcule la somme des diviseurs d'un integer, et estParfait qui
	// retourne true si l'entier entré est parfait et false sinon.

	public static void main(String[] args) {

		System.out.println("Veuillez entrer une borne supérieure :");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.nextLine();
		System.out.print("Entre 1 et " + k + ", les nombres parfaits sont : ");
		for (int i = 1; i <= k; i++) {
			if (estParfait(i))
				System.out.print(i + "; ");
		}
		sc.close();

	}

	static int sommeDiv(int n) {
		int sum = 0;

		// on pourrait mettre i<=(int)sqrt(n) comme condition d'arrêt de cette boucle
		// for pour optimiser.
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum = sum + i;
		}
		return sum;

	}

	static boolean estParfait(int n) {
		if (n == sommeDiv(n))
			return true;
		else
			return false;
	}

}