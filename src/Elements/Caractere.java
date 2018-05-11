package Elements;

public class Caractere extends Element {
	private char caractere;

	public Caractere(char c, int x, int y){
		super(x, y);
		this.caractere = c;
	}

	public char getCaractere() {
		return caractere;
	}

	public void setCaractere(char c) {
		if(c!=caractere) {
			caractere=c;
		}
	}

	@Override//pour indiquer une methode redefinie
	public void deplacer( int x, int y) {										
		this.placerA(x, y);
	}

	@Override
	public void encadre(char c) {
		
	}
	
	public char[][] dessiner(char[][] tab, int x, int y) {
		tab[x][y] = this.getCaractere();
		return tab;
	}
}