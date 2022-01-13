package pckExercices;

public class MainExercice411 {

	public static void main(String[] args) {
		// Exercice consistant à extraire les deux lignes d'une matrice
		int pairImpair[][] = { { 0, 2, 4, 6, 8 }, { 1, 3, 5, 7, 9 } };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(pairImpair[i][j]);
			}
			System.out.println("");
		}

	}

}