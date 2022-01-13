package pckExercices;

public class MainExercice34 {

	public static void main(String[] args) {
		// Exercice constituant à afficher tous les entiers entre 1 et 20 ainsi que leur
		// parité
		int i = 1;
		boolean estPair = false;
		while (i < 20) {
			System.out.print(i + " est ");
			if (estPair) {
				System.out.println("pair.");
				estPair = false;
			} else {
				System.out.println("impair.");
				estPair = true;
			}
			i++;

		}
	}
}