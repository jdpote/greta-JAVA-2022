package pckExercices;

public class MainExercice58 {
	// Exercice visant à mettre en évidence que les fonctions prennent en paramètre
	// les valeurs des variables et pas leurs adresses. Cela veut dire qu'appeler
	// une fonction sur une variable ne modifiera pas sa valeur autre part que dans
	// l'instance de la fonction.

	public static void main(String[] args) {

		int A = 10;
		int B = 20;
		System.out.println("A dans le main avant appel de permut : " + A);
		System.out.println("B dans le main avant appel de permut : " + B);
		permut(A, B);
		System.out.println("A dans le main après appel de permut : " + A);
		System.out.println("B dans le main après appel de permut : " + B);

	}

	static void permut(int A, int B) {
		System.out.println("A dans la fonction permut avant permutation : " + A);
		System.out.println("B dans la fonction permut avant permutation : " + B);
		A = A + B;
		B = A - B;
		A = A - B;
		System.out.println("A dans la fonction permut après permutation : " + A);
		System.out.println("B dans la fonction permut après permutation : " + B);
	}

}