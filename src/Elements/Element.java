package Elements;

public abstract class Element {
	private int x, y;
	private String type;
	public Element(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Element(Element e) {
		this.x=e.x;
		this.y=e.y;
	}
	
	public abstract void deplacer(Element e, int x, int y);
	
	public abstract void encadre(char c);

}
