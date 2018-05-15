package Elements;

public abstract class Element {
	private int x, y;

	public Element(int x, int y) {
		placerA(x, y);
	}

	public Element(Element e) {
		this.x=e.x;
		this.y=e.y;
	}
	
	 public void placerA(int x, int y) {
		    this.x = x;
		    this.y = y;
		  }

	public abstract void deplacer( int x, int y);

	public abstract void encadre(char c, char[][] tab);
	
	public abstract char[][] dessiner(char[][] tab, int x, int y);
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}

}
