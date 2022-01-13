package pckExercices;

public class MainExercice55 {
	// Exercice consistant à coder une fonction Max et une fonction cube, et à les
	// impriquer dans une instance de println.
	public static void main(String[] args) {
		int a = 123;
		int b = 5;
		System.out.println("Maximum: " + Max(a, cube(b)));
	}

	// fonction cube
	static int cube(int a) {
		return a * a * a;
	}

	// fonction Max
	static int Max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}
}