package Elements;

public class Caractere extends Element {
	private char caractere;

	public Caractere(char c, int x, int y){
		super(x, y);
		this.caractere = c;
	}
	
	public Caractere(Caractere c) {
		super(c.getX(), c.getY());
		this.caractere = c.caractere;
	}

	public char getCaractere() {
		return caractere;
	}

	public void setCaractere(char c) {
		if(c!=caractere) {
			caractere=c;
		}
	}

	@Override
	public void dessineCadre(char[][] tab) {

		int departX = this.getX()-1;
		int departY = this.getY()-1;


		int arriveeX = this.getX()+1;
		int arriveeY = this.getY()+1;

		int diffX = arriveeX - departX + 1;
		for (int i = 0; i < diffX; i++) {
			tab[departX+i][departY] = this.getCaracterEncadrement();
			tab[departX][departY+i] = this.getCaracterEncadrement();
			tab[arriveeX][arriveeY - i] = this.getCaracterEncadrement();
			tab[arriveeX - i][arriveeY] = this.getCaracterEncadrement();
		}
	}


	public void dessiner(char[][] tab) {
		tab[this.getX()][this.getY()] = this.getCaractere();
	}
}