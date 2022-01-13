package pckExercices;

public class MainExercice51 {

	public static void main(String[] args) {
		int[] tableau = { 5, 7, -22, 12, 899 };

		System.out.println(minTableau(tableau, 5));

	}

	static int minTableau(int[] T, int sizeOfT) {
		int min = T[0];
		for (int i = 0; i < sizeOfT; i++) {
			if (min > T[i])
				min = T[i];
		}
		return min;
	}

}