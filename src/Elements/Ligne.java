package Elements;

public class Ligne extends Element {
	private String type;
	private char lettre;
	private int taille = 0;

	public Ligne(char l, int x, int y, String type, int t) {
		super(x, y);
		this.lettre = l;
		this.taille = t;
		this.type = type;

	}

	public void rotationLigne(char ligne[]) {

	}

	/*Renvoie une String contenant la ligne*/
	public String getLigne() {
		String s ="";
		if(this.type.equals("horizontale")) {

			for(int i = 0; i<this.taille; i++) {
				s += this.lettre;
			}
			return s;
		}
		if(this.type.equals("verticale")) {
			for(int i = 0; i<this.taille; i++) {
				s += this.lettre + "\n";
			}
			return s;
		}
		return "x";


	}

	@Override
	public void deplacer( int x, int y) {

	}

	@Override
	public void encadre(char c) {

	}

	public String toString() {
		return this.getLigne();
	}

	public char[][] dessiner(char[][] tab, int x, int y){//x est la ligne et y la colonne
		if(this.type.equals("horizontale")){
			int c = y;
			for (int i = 0; i<taille; i++) {
				tab[x][c] = this.lettre;
				++c;
			}
			return tab;

		}
		if(this.type.equals("verticale")) {
			int i = x;
			for ( int j = 0; j<taille; j++) {
				tab[i][y] = this.lettre;
				++i;
			}return tab;
		}

		if(this.type.equals("obliqueC")) {//// C pour oblique croissant
			int ligne = x;
			int colonne = y;
			for (int e = 0; e<taille; e++ ) {
				tab[ligne][colonne] = this.lettre;
				--ligne;
				++colonne;
			}	return tab;
		}

		if(this.type.equals("obliqueD")) {// D pour oblique décroissant
			int li = x;
			int col = y;
			for (int s = 0; s<taille; s++ ) {
				tab[li][col] = this.lettre;
				++li;
				++col;
			}	
		}return tab;


	}
}
