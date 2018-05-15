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

	public void rotationLigne( char[][] tab, int x, int y, String typeRotation) {//(x,y) les coordonnées du point de rotation
		if(!this.type.equals(typeRotation)) {
			switch (this.type) {

			case "horizontale":
				int c = y;
				for (int i = 0; i<taille; i++) {
					tab[x][c] = ' ';
					++c;
				}
				this.type = typeRotation;
				this.dessiner(tab, x, y);
				break;

			case "verticale":
				int e = x;
				for ( int j = 0; j<taille; j++) {
					tab[e][y] = ' ';
					++e;
				}
				this.type = typeRotation;
				this.dessiner(tab, x, y);
				break;

			case "obliqueC":
				int ligne = x;
				int colonne = y;
				for (int k = 0; k<taille; k++ ) {
					tab[ligne][colonne] = ' ';
					--ligne;
					++colonne;
				}
				this.type = typeRotation;
				this.dessiner(tab, x, y);
				break;

			case "obliqueD":
				int li = x;
				int col = y;
				for (int s = 0; s<taille; s++ ) {
					tab[li][col] = this.lettre;
					++li;
					++col;
				}
				this.type = typeRotation;
				this.dessiner(tab, x, y);
				break;

			default:
				break;
			}
		}
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
	public void encadre(char c, char[][] tab) {

		int departX = this.getX() - 1;
		int departY = this.getY() - 1;

		int arriveeX = 0;
		int arriveeY = 0;

		if (this.type.equals("verticale")) {
			arriveeX = this.getX() + this.taille;
			arriveeY = this.getY() + 1;
		} else if (this.type.equals("horizontale")) {
			arriveeX = this.getX() + 1;
			arriveeY = this.getY()+ this.taille;
		} else if (this.type.equals("obliqueC")) {
			arriveeX = this.getX() + 1;
			arriveeY = this.getY() + this.taille;
			departX = this.getX() - this.taille;
			departY = this.getY() - 1;
		} else if (this.type.equals("obliqueD")) {
			arriveeX = this.getX() + this.taille;
			arriveeY = this.getY() + this.taille;
			departX = this.getX() - 1;
			departY = this.getY() - 1;
		}

		int diffX = Math.abs(arriveeX - departX)+1;
		int diffY = Math.abs(arriveeY - departY);

		for (int n = 0; n < diffX; n++) {
			tab[departX+n][departY]=c;
			tab[arriveeX-n][arriveeY]=c;
		}
		for(int j = 0; j < diffY; j++) {
			tab[arriveeX][arriveeY-j]=c;
			tab[departX][departY+j]=c;
		}
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
