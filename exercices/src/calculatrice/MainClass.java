package calculatrice;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char op = '0';
		float a = 0f;
		float b = 0f;
		Calculatrice cal = new Calculatrice();

		System.out.println("operation (+ - * / ) ? ");
		op = sc.nextLine().charAt(0);

		System.out.println("Saisissez deux réels, distingués par la touche ENTER :");
		a = sc.nextFloat();
		sc.nextLine();
		b = sc.nextFloat();
		sc.nextLine();

		switch (op) {

		case '+':
			System.out.printf("%2.2f", cal.addition(a, b));
			break;
		case '-':
			System.out.printf("%2.2f", cal.soustraction(a, b));
			break;
		case '*':
			System.out.printf("%2.2f", cal.multiplication(a, b));
			break;
		case '/':
			System.out.printf("%2.2f", cal.division(a, b));
			break;
		default:
			System.out.println("Erreur dans le choix de l'opérateur.");
		}
		sc.close();
	}

}
