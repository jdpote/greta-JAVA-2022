package point2D;

import java.lang.Math;

class Cercle {
	// attributs
	protected Point centre;
	protected int rayon;

	// constructeurs
	public Cercle() {
		centre = new Point();
		rayon = 0;
	}

	public Cercle(Point centre, int rayon) {
		this.centre = centre;
		if (rayon >= 0)
			this.rayon = rayon;
		else
			this.rayon = 0;
	}
	//setters, getters
	public void setCentre (Point P) {
		centre = P;
	}
	
	//aire de l'instance
	public double Area() {
		return Math.PI * rayon * rayon;
	}
	//perimetre de l'instance
	public double Perimeter() {
		return 2*Math.PI*rayon;
	}
}
