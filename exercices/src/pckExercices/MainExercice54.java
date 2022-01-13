package pckExercices;

public class MainExercice54 {

	public static void main(String[] args) {
		System.out.println("3h, 25mn et 44s se convertissent en " + conversionHMStoS(3, 25, 44) + " secondes.");

	}

	static int conversionHMStoS(int h, int m, int s) {
		return 3600 * h + 60 * m + s;
	}

}