package Elements;

public abstract class Element {
	private int x, y;
	private boolean estEncadrer; 
	private char caracterEncadrement;

	public Element(int x, int y) {
		placerA(x, y);
		this.estEncadrer = false;
	}

	public Element(Element e) {
		this.x=e.x;
		this.y=e.y;
	}

	public void placerA(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void encadre(char caracterEncadrement) {
		this.estEncadrer = true;
		this.caracterEncadrement = caracterEncadrement;
	}

	public void desencadre() {
		this.estEncadrer = false;
		this.caracterEncadrement = '\u0000';
	}

	public abstract void dessineCadre(char[][] tab);

	public abstract void dessiner(char[][] tab);

	public char getCaracterEncadrement() {
		return this.caracterEncadrement;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public boolean getEstEncadrer() {
		return this.estEncadrer;
	}

}
