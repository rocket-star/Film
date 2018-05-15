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
	public void encadre(char c, char[][] tab) {

		int departX = this.getX()-1;
		int departY = this.getY()-1;


		int arriveeX = this.getX()+1;
		int arriveeY = this.getY()+1;

		int diffX = arriveeX - departX + 1;
		for (int i = 0; i < diffX; i++) {
			tab[departX+i][departY] = c;
			tab[departX][departY+i] = c;
			tab[arriveeX][arriveeY - i] = c;
			tab[arriveeX - i][arriveeY] = c;
		}
	}


	public char[][] dessiner(char[][] tab, int x, int y) {
		tab[x][y] = this.getCaractere();
		return tab;
	}
}