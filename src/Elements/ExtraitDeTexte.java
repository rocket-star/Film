package Elements;

public class ExtraitDeTexte extends Element {
	private int enHautAGauche, enBasADroite;
	private Texte texte;

	public ExtraitDeTexte( Texte t, int x, int y, int HG, int BD) {
		super(x, y);
		this.enHautAGauche = HG;
		this.enBasADroite = BD;
		this.texte = t;
	}

	public String toString() {
		String s=" ";
		return s;
	}

	@Override
	public void dessineCadre(char[][] tab) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dessiner(char[][] tab) {
		// TODO Auto-generated method stub
		
	}
}
