package Elements;

public class ExtraitDeTexte extends Texte {
	private enum position{HautGauche, Hautdroite, BasGauche, BasDroite};

	public ExtraitDeTexte(String s, int x, int y) {
		super(s, x, y);
	}

	@Override
	public void deplacer(Element e, int x, int y) {

	}

	@Override
	public void encadre(char c) {

	}

	public String toString() {
		String s=" ";
		return s;
	}
}
