package pckExercices;

public class MainExercice38 {

	public static void main(String[] args) {
		// Exercice consistant à afficher les entiers de 10 à 20 à l'exception du 13 en
		// utilisant l'instruction 'continue'

		for (int i = 10; i <= 20; i++) {
			if (i == 13)
				continue;
			System.out.println(i);
		}
	}
}