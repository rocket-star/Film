package Elements;

public class Caractere extends Element {
	private char caractère;

	public Caractere(char c, int x, int y){
		super(x, y);
		this.caractère = c;
	}

	public char getCaractere() {
		return caractère;
	}

	public void setCaractere(char c) {
		if(c!=caractère)
			caractère=c;
	}

	@Override//pour indiquer une méthode redefinie
	public void deplacer(Element e, int x, int y) {

	}

	@Override
	public void encadre(char c) {

	}
}