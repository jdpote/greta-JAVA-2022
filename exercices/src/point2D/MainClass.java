package point2D;

public class MainClass {

	public static void main(String[] args) {
		Point Pt0 = new Point();
		Point Pt1 = new Point(1, 0);
		Point Pt2 = new Point(1, 1);

		double maxDist = Pt0.distanceAvec(Pt1);
		if (Pt0.distanceAvec(Pt2) > maxDist)
			maxDist = Pt0.distanceAvec(Pt2);
		else if (Pt1.distanceAvec(Pt2) > maxDist)
			maxDist = Pt1.distanceAvec(Pt2);
		System.out.println("La distance maximale entre deux points dans ce trio est : " + maxDist);

		Pt0.set(3, 3);

		maxDist = Pt0.distanceAvec(Pt1);
		if (Pt0.distanceAvec(Pt2) > maxDist)
			maxDist = Pt0.distanceAvec(Pt2);
		else if (Pt1.distanceAvec(Pt2) > maxDist)
			maxDist = Pt1.distanceAvec(Pt2);

		System.out
				.println("Après avoir déplacé Pt0 en (3,3), la distance maximale entre deux points dans ce trio est : "
						+ maxDist);
		System.out.println("Les points Pt0 et Pt1 sont-ils au même endroit ? "+Pt0.equals(Pt1));
		Pt1.set(3,3);
		System.out.println("On déplace Pt1 en (3,3). Et maintenant, les points Pt0 et Pt1 sont-ils au même endroit ? "+Pt0.equals(Pt1));
		
		
		System.out.println("Test des méthodes d'affichage affiche() et toString() via l'affichage de Pt1.");
		Pt1.affiche();
		System.out.println(Pt1.toString());

	}

}
