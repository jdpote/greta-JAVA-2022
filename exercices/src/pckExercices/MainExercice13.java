package pckExercices;

public class MainExercice13 {

	public static void main(String[] args) {
		// Exercice consistant à intervertir les valeurs de deux variables par deux
		// méthodes différentes

		int a = 5;
		int b = 12;
		int temp = 0;

		System.out.println("Valeurs initiales : a = " + a + ", b = " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("Abracadabra ! Maintenant, a = " + a + ", b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Alakazam ! Deuxième passe-passe et soudain, a = " + a + ", b = " + b);
	}

}