package pckExercices;

public class MainExercice110 {

	public static void main(String[] args) {
		// Exercice consistant à afficher le code ASCII et le code hexa du char 'A'

		String st = "A";
		int a = st.charAt(0);
		System.out
				.println("le char 'A' a pour code ascii " + a + " et pour code hexadécimal " + Integer.toHexString(a));

	}

}