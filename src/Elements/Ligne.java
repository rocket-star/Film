package Elements;

public class Ligne extends Element {
	private char ligne[];
	private int taille = 0;
	private enum inclinaison{Horizontale, Verticale, Oblique};

	public Ligne(String s, int x, int y) { // Met la string s dans un tableau
		super(x, y);
		for (int i = 0 ; i < s.length() ;i++)
			ligne[i]=s.charAt(i);
		taille= ligne.length;
		inclinaison i = inclinaison.Horizontale;
	}

	public void rotationLigne(char ligne[]) {

	}

	public char[] getLigne() {
		return ligne;
	}

	@Override
	public void deplacer(Element e, int x, int y) {

	}

	@Override
	public void encadre(char c) {

	}

	public String toString() {
		String s=" ";
		for(char c : ligne) {
			s += c;
		}
		return s;

	}


}
