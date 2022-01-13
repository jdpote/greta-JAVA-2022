package pckExercices;

public class MainExercice53 {

	public static void main(String[] args) {
		conversionStoHMS(3661);
		conversionStoHMS(12344);

	}

	static void conversionStoHMS(int s) {
		System.out.println(s + " secondes se convertit en : " + (s / 3600) + " heures, " + (s % 3600) / 60
				+ " minutes, et " + (s % 60) + " secondes.");
	}

}