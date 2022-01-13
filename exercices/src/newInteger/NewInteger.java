package newInteger;

class NewInteger {
	protected int a;
	protected int b;

	public NewInteger() {
		a = 0;
		b = 0;
	}

	public NewInteger(int x, int y) {
		a = x;
		b = y;
	}

	public void affiche() {
		System.out.println(a + ", " + b);
	}

	public void permut() {
		a = a + b;
		b = a - b;
		a = a - b;
	}

}
