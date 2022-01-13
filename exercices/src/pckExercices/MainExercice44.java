package pckExercices;

public class MainExercice44 {

	public static void main(String[] args) {
		// Exercice qui consiste à afficher les caractères A à Z, puis les chiffres 0 à
		// 9 avec leurs codes et codes hexadécimaux respectifs
		for (int i = 65; i < 91; i++) {
			System.out.println("Character : " + (char) i + "\tcode : " + i + "\tcode hexa :" + Integer.toHexString(i));
		}
		for (int i = 48; i < 58; i++) {
			System.out.println("Character : " + (char) i + "\tcode : " + i + "\tcode hexa :" + Integer.toHexString(i));
		}
	}
}