package pckExercices;

public class MainExercice312 {

	public static void main(String[] args) {
		// Exercice constituant à vérifier combien de carrés d'entiers entre 0 et 1000
		// sont des palindromes

		int k = 0;

		for (int i = 0; i < 10001; i++) {

			if (i * i == reverseInt(i * i)) {
				k++;
			}
		}
		System.out.println(k);

	}

	static int reverseInt(int a) {
		String str = new String();
		if (a == 0)
			return 0;
		else
			while (a > 0) {
				str = str + (a % 10);
				a = a / 10;
			}
		return Integer.valueOf(str);
	}

}