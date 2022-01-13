package pckExercices;

public class MainExercice57 {
	// Exercice consistant à utiliser la surcharge d'une méthode (plusieurs
	// fonctions ayant le même nom mais des effets différents en fonction du nombre
	// et des types des paramètres.
	public static void main(String[] args) {
		conversion(3661);
		conversion(217, 3334);
		conversion(1, 1, 1);

	}

	static void conversion(int s) {
		System.out.println(s + " secondes se convertit en : " + (s / 3600) + " heures, " + (s % 3600) / 60
				+ " minutes, et " + (s % 60) + " secondes.");
	}

	static void conversion(int m, int s) {
		System.out.println(m + " minutes et " + s + " secondes se convertit en : " + ((s + 60 * m) / 3600) + " heures, "
				+ ((s + 60 * m) % 3600) / 60 + " minutes, et " + ((s + 60 * m) % 60) + " secondes.");
	}

	static void conversion(int h, int m, int s) {
		System.out.println(h + " heures, " + m + " minutes et " + s + " secondes correspondent à "
				+ (3600 * h + 60 * m + s) + " secondes.");
	}

}