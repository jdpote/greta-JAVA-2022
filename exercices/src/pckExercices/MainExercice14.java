package pckExercices;

public class MainExercice14 {

	public static void main(String[] args) {
		// Exercice consistant à interchanger les valeurs de 3 variables
		int x = 1;
		int y = 2;
		int z = 3;
		System.out.println("ETAT INITIAL : x = " + x + "; y = " + y + "; z = " + z + ";");
		// on commence par échanger x et y
		x = x + y;
		y = x - y;
		x = x - y;
		// ensuite on échange y et z
		y = y + z;
		z = y - z;
		y = y - z;
		System.out.println("ETAT FINAL : x = " + x + "; y = " + y + "; z = " + z + ";");
	}

}