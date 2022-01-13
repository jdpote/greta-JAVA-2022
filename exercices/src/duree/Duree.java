package duree;

class Duree {
	//attributes
	protected int h;
	protected int m;
	protected int s;

	//constructors
	public Duree() {
		h = 0;
		m = 0;
		s = 0;
	}

	public Duree(int h, int m, int s) {
		int secTemp = s + 60 * m + 3600 * h;

		this.h = secTemp / 3600;
		this.m = (secTemp % 3600) / 60;
		this.s = secTemp % 60;
	}

	//getters
	public int getHours() {
		return h;
	}

	public int getMinutes() {
		return m;
	}

	public int getSeconds() {
		return s;
	}
	
	//setters
	public void setHours(int h) {
		this.h = h;
	}

	public void setMinutes(int m) {
		this.m = m % 60;
		h += m / 60;
	}

	public void setSeconds(int s) {
		int minTemp = s / 60;
		this.s = s % 60;
		m += minTemp % 60;
		h += minTemp / 60;
	}
	
	//cette methode affiche la Duree au format 0h 00m 00s
	public void display() {
		System.out.print(h + "h ");
		if (m < 10)
			System.out.print("0" + m + "m ");
		else
			System.out.print(m + "m ");
		if (s < 10)
			System.out.print("0" + s + "s\n");
		else
			System.out.print(s + "s\n");
	}
	
	//Cette methode convertit une Duree en secondes
	public int toSec() {
		return h*3600+m*60+s;
	}
	
	//Cette methode retourne une Duree egale a la somme de la duree qui instancie et la duree en parametre
	public Duree addDuree(Duree D) {

		int secTemp = s + D.s + 60 * (m + D.m) + 3600 * (h + D.h);

		int hResult = secTemp / 3600;
		int mResult = (secTemp % 3600) / 60;
		int sResult = secTemp % 60;

		Duree result = new Duree(hResult, mResult, sResult);
		return result;
	}
	
	//Cette methode retourne une Duree egale a la somme de la duree qui instancie et un nombre de secondes en parametre
	public Duree addSec(int s) {
		Duree result = new Duree(0, 0, s);
		result = this.addDuree(result);
		return result;		
	}
	
	
	//cette methode retourne true si la duree qui instancie est plus courte que la duree en parametre, et false sinon
	public boolean isShorterThan(Duree D) {
		boolean result = true;
		if (h > D.h)
			result = false;
		else if (h == D.h && m > D.m)
			result = false;
		else if (h == D.h && m == D.m && s > D.s)
			result = false;
		return result;
	}

}
