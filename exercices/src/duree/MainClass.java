package duree;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Test des constructeurs : D1 = 0h0m0s et D2=1h2m3s");
		Duree D1 = new Duree();
		Duree D2 = new Duree(1, 2, 3);
		System.out.println("Test de la methode display :");
		D1.display();
		D2.display();
		System.out.println("Test de la methode addDuree : D1=D1+D2 et D2=D2+D2");
		D1 = D1.addDuree(D2);
		D2 = D2.addDuree(D2);
		D1.display();
		D2.display();
		System.out.println("test de getHours : nombre d'heures de D1 = " + D1.getHours());
		System.out.println("test de getMinutes : nombre de minutes de D1 = " + D1.getMinutes());
		System.out.println("test de getSeconds : nombre de secondes de D1 = " + D1.getSeconds());
		System.out.println("test de setHours : D1 prend 15h");
		D1.setHours(15);
		D1.display();
		System.out.println("test de setMinutes : D1 prend 20mn, puis D1 prend 65mn");
		D1.setMinutes(20);
		D1.display();
		D1.setMinutes(65);
		D1.display();
		System.out.println("test de setSeconds : D1 prend 5s, puis D1 prend 128s, puis D1 prend 3661s");
		D1.setSeconds(5);
		D1.display();
		D1.setSeconds(128);
		D1.display();
		D1.setSeconds(3661);
		D1.display();
		System.out.println("Display de D1, D2 et test de la methode isShorterThan");
		D1.display();
		D2.display();
		System.out.println("D1 shorter than D2 :" + D1.isShorterThan(D2));
		System.out.println("D2 shorter than D1 :" + D2.isShorterThan(D1));
		System.out.println("---------------------- COMPARAISON MARQUEZ ROSSI ----------------------");
		Duree Dmarquez = new Duree(2, 23, 10);
		Dmarquez = Dmarquez.addDuree(new Duree(1, 45, 0));
		Dmarquez = Dmarquez.addSec(50);
		Dmarquez = Dmarquez.addDuree(new Duree(0, -1, -10));
		System.out.println("Temps de Marquez :");
		Dmarquez.display();
		Duree Drossi = new Duree(2, 32, 15);
		Drossi = Drossi.addDuree(new Duree(1, 21, 3));
		Drossi = Drossi.addDuree(new Duree(0, 15, 20));
		Drossi = Drossi.addSec(-7);
		System.out.println("Temps de Rossi :");
		Drossi.display();
		if (Drossi.isShorterThan(Dmarquez))
			System.out.println("Rossi champion.");
		else if (Drossi.equals(Dmarquez))
			System.out.println("ex aequo");
		else
			System.out.println("Marquez Champion");
		
	}

}
