package pckExercices;

import java.util.Scanner;

public class MainExercice45 {

	public static void main(String[] args) {
		// Exercice consistant ŕ traduire un texte entré par l'utilisateur en morse

		Scanner sc = new Scanner(System.in);
		String strSaisie = new String();
		String strOutput = new String();
		System.out.println("Veuillez entrer un message ŕ traduire en Morse : ");
		strSaisie = sc.nextLine();
		for (int i = 0; i < strSaisie.length(); i++) {
			strOutput = strOutput + charToMorse(strSaisie.charAt(i)) + "   ";
		}
		System.out.println("Traduction en morse :\n" + strOutput);
		sc.close();
	}

	public static String charToMorse(char a) {
		String str = new String();
		switch (a) {
		case 'A':
			str = ".-";
			break;
		case 'B':
			str = "-...";
			break;
		case 'C':
			str = "-.-.";
			break;
		case 'D':
			str = "-..";
			break;
		case 'E':
			str = ".";
			break;
		case 'F':
			str = "..-.";
			break;
		case 'G':
			str = "--.";
			break;
		case 'H':
			str = "....";
			break;
		case 'I':
			str = "..";
			break;
		case 'J':
			str = ".---";
			break;
		case 'K':
			str = "-.-";
			break;
		case 'L':
			str = ".-..";
			break;
		case 'M':
			str = "--";
			break;
		case 'N':
			str = "-.";
			break;
		case 'O':
			str = "---";
			break;
		case 'P':
			str = ".--.";
			break;
		case 'Q':
			str = "--.-";
			break;
		case 'R':
			str = ".-.";
			break;
		case 'S':
			str = "...";
			break;
		case 'T':
			str = "-";
			break;
		case 'U':
			str = "..-";
			break;
		case 'V':
			str = "...-";
			break;
		case 'W':
			str = ".--";
			break;
		case 'X':
			str = "-..-";
			break;
		case 'Y':
			str = "-.--";
			break;
		case 'Z':
			str = "--..";
			break;
		case 'a':
			str = ".-";
			break;
		case 'b':
			str = "-...";
			break;
		case 'c':
			str = "-.-.";
			break;
		case 'd':
			str = "-..";
			break;
		case 'e':
			str = ".";
			break;
		case 'f':
			str = "..-.";
			break;
		case 'g':
			str = "--.";
			break;
		case 'h':
			str = "....";
			break;
		case 'i':
			str = "..";
			break;
		case 'j':
			str = ".---";
			break;
		case 'k':
			str = "-.-";
			break;
		case 'l':
			str = ".-..";
			break;
		case 'm':
			str = "--";
			break;
		case 'n':
			str = "-.";
			break;
		case 'o':
			str = "---";
			break;
		case 'p':
			str = ".--.";
			break;
		case 'q':
			str = "--.-";
			break;
		case 'r':
			str = ".-.";
			break;
		case 's':
			str = "...";
			break;
		case 't':
			str = "-";
			break;
		case 'u':
			str = "..-";
			break;
		case 'v':
			str = "...-";
			break;
		case 'w':
			str = ".--";
			break;
		case 'x':
			str = "-..-";
			break;
		case 'y':
			str = "-.--";
			break;
		case 'z':
			str = "--..";
			break;
		case '1':
			str = ".----";
			break;
		case '2':
			str = "..---";
			break;
		case '3':
			str = "...--";
			break;
		case '4':
			str = "....-";
			break;
		case '5':
			str = ".....";
			break;
		case '6':
			str = "-....";
			break;
		case '7':
			str = "--...";
			break;
		case '8':
			str = "---..";
			break;
		case '9':
			str = "----.";
			break;
		case '0':
			str = "-----";
			break;
		case ' ':
			str = "       ";
			break;
		default:
			str = "ERROR";
			break;
		}

		return str;
	}
}