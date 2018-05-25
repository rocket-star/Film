package Elements;

import Direction.Direction;

public class Ligne extends Element {
	private Direction direction;
	private char lettre;
	private int taille = 0;

	public Ligne(char l, int x, int y, Direction dir, int t) {
		super(x, y);
		this.lettre = l;
		this.taille = t;
		this.direction = dir;

	}
	
	public Direction getDirection() {
		return this.direction;
	}
	
	public void setTaille(int t) {
		this.taille = t;
	}
	
	public void setLettre(char l) {
		this.lettre = l;
	}

	public void rotationLigne( Direction nouvelleDirection) {//(x,y) les coordonnées du point de rotation
		if(!this.direction.equals(nouvelleDirection)) {
			this.direction =nouvelleDirection;
		}		
	}

	@Override
	public void dessineCadre(char[][] tab) {
		if(this.getEstEncadrer()) {


			int departX = this.getX() - 1;
			int departY = this.getY() - 1;

			int arriveeX = 0;
			int arriveeY = 0;

			if (this.direction.equals(Direction.SUD)) {
				arriveeX = this.getX() + this.taille;
				arriveeY = this.getY() + 1;
			} else if (this.direction.equals(Direction.EST)) {
				arriveeX = this.getX() + 1;
				arriveeY = this.getY()+ this.taille;
			} else if (this.direction.equals(Direction.OUEST)) {
				arriveeX = this.getX() + 1;
				arriveeY = this.getY() + 1;
				departY = this.getY() - this.taille;
			}else if (this.direction.equals(Direction.NORD)) {
				arriveeX = this.getX() + 1;
				arriveeY = this.getY() + 1;
				departX = this.getX() - this.taille;
			}else if (this.direction.equals(Direction.NORD_EST)) {
				arriveeX = this.getX() + 1;
				arriveeY = this.getY() + this.taille;
				departX = this.getX() - this.taille;
			} else if (this.direction.equals(Direction.NORD_OUEST)) {
				arriveeX = this.getX() + 1;
				arriveeY = this.getY() + 1;
				departX = this.getX() - this.taille;
				departY = this.getY() - this.taille;
			} else if (this.direction.equals(Direction.SUD_EST)) {
				arriveeX = this.getX() + this.taille;
				arriveeY = this.getY() + this.taille;
			} else if (this.direction.equals(Direction.SUD_OUEST)) {
				arriveeX = this.getX() + this.taille;
				arriveeY = this.getY() + 1;
				departY = this.getY() - this.taille;
			}

			int diffX = Math.abs(arriveeX - departX)+1;
			int diffY = Math.abs(arriveeY - departY);

			for (int n = 0; n < diffX; n++) {
				tab[departX+n][departY]=this.getCaracterEncadrement();
				tab[arriveeX-n][arriveeY]=this.getCaracterEncadrement();
			}
			for(int j = 0; j < diffY; j++) {
				tab[arriveeX][arriveeY-j]=this.getCaracterEncadrement();
				tab[departX][departY+j]=this.getCaracterEncadrement();
			}
		}
	}



	public void dessiner(char[][] tab){//this.getX() est la ligne et y la colonne
		if(this.direction.equals(Direction.EST)){
			int c = this.getY();
			for (int i = 0; i<taille; i++) {
				tab[this.getX()][c] = this.lettre;
				++c;
			}//return tab;
		}

		if(this.direction.equals(Direction.OUEST)){
			int c = this.getY();
			for (int i = 0; i<taille; i++) {
				tab[this.getX()][c] = this.lettre;
				--c;
			}

		}
		if(this.direction.equals(Direction.SUD)) {
			int i = this.getX();
			for ( int j = 0; j<taille; j++) {
				tab[i][this.getY()] = this.lettre;
				++i;
			}//return tab;
		}

		if(this.direction.equals(Direction.NORD)) {
			int i = this.getX();
			for ( int j = 0; j<taille; j++) {
				tab[i][this.getY()] = this.lettre;
				--i;
			}
		}

		if(this.direction.equals(Direction.NORD_EST)) {//// C pour oblique croissant
			int ligne = this.getX();
			int colonne = this.getY();
			for (int e = 0; e<taille; e++ ) {
				tab[ligne][colonne] = this.lettre;
				--ligne;
				++colonne;
			}	//return tab;
		}

		if(this.direction.equals(Direction.NORD_OUEST)) {//// C pour oblique croissant
			int ligne = this.getX();
			int colonne = this.getY();
			for (int e = 0; e<taille; e++ ) {
				tab[ligne][colonne] = this.lettre;
				--ligne;
				--colonne;
			}
		}

		if(this.direction.equals(Direction.SUD_EST)) {// D pour oblique décroissant
			int li = this.getX();
			int col = this.getY();
			for (int s = 0; s<taille; s++ ) {
				tab[li][col] = this.lettre;
				++li;
				++col;
			}	
		}//return tab;

		if(this.direction.equals(Direction.SUD_OUEST)) {// D pour oblique décroissant
			int li = this.getX();
			int col = this.getY();
			for (int s = 0; s<taille; s++ ) {
				tab[li][col] = this.lettre;
				++li;
				--col;
			}	
		}

		if (this.getEstEncadrer()) {
			dessineCadre(tab);
		}


	}
}

