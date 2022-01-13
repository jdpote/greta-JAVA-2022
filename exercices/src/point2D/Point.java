package point2D;

import java.lang.Math;

class Point {

	// argument statique : nombre de points
	private static int NombreDePoints = 0;

	// attributs
	protected int x;
	protected int y;

	// constructors
	public Point() {
		x = 0;
		y = 0;
		NombreDePoints++;
		System.out.println("Un nouveau Point est né ! Nombre de Points : " + NombreDePoints);
	}

	public Point(int abs, int ord) {
		x = abs;
		y = ord;
		NombreDePoints++;
		System.out.println("Un nouveau Point est né ! Nombre de Points : " + NombreDePoints);
	}

	// setters, getters
	public void setx(int x) {
		this.x = x;
	}

	public void sety(int y) {
		this.y = y;
	}
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getx() {
		return x;
	}

	public int gety() {
		return y;
	}

	// methode d'affichage
	public void affiche() {
		System.out.println("(" + x + ", " + y + ")");
	}

	// methode qui deplace le Point qui instancie de dx, dy
	public void deplace(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

	// methode pour acceder au nombre de points
	public int getNombreDePoints() {
		return NombreDePoints;
	}

	// methode qui indique si le Point instance et le Point parametre coincident
	public boolean equals(Point A) {
		return (x == A.x && y == A.y);
	}

	// methode qui donne la distance entre l'instance et l'argument
	public double distanceAvec(Point A) {
		return Math.sqrt((x - A.x) * (x - A.x) + (y - A.y) * (y - A.y));
	}

	// methode qui permet de permuter deux points
	public void permutation(Point A) {
		int absTemp = A.x;
		int ordTemp = A.y;
		A.setx(x);
		A.sety(y);
		x = absTemp;
		y = ordTemp;
	}
	
	//surcharge de la méthode objet toString
	public String toString() {
		return ("(" + x + ", " + y + ")");
	}

}
