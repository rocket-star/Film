package Elements;

public abstract class Element {
	public int x, y;
	private String type;
	public Element(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Element(Element e) {
		this.x=e.x;
		this.y=e.y;
		
	}
	
	public void D�placer(element e, nouvelle position) {
		
	}
	
	public void Encadr�(char c) {
		
	}

}
