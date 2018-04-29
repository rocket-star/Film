package Elements;

public class Caractere extends Element {
	private char caract�re;

	public Caractere(char c, int x, int y){
		super(x, y);
		this.caract�re = c;
	}

	public char getCaractere() {
		return caract�re;
	}

	public void setCaractere(char c) {
		if(c!=caract�re)
			caract�re=c;
	}

	@Override//pour indiquer une m�thode redefinie
	public void deplacer(Element e, int x, int y) {

	}

	@Override
	public void encadre(char c) {

	}
}