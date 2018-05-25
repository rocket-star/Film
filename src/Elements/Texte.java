
package Elements;

import java.util.ArrayList;

public class Texte extends Element { 
	private ArrayList<String> texte;

	public Texte(String s, int x , int y) {
		super(x ,y);
		texte = new ArrayList<String>();
		texte.add(s);
	}

	public ArrayList<String> getTexte(){
		return texte;
	}

	public void ajouterLigne(String l) {
		//if(l.getDirection().equals(Direction.EST))
		this.texte.add(l);
	}

	public void enleverLigne(int ind) {
		//if(l.getDirection().equals(Direction.EST))
		this.texte.remove(ind);
	}

	@Override
	public void dessineCadre(char[][] tab) {
		int plusLong = 0;
		int departX = this.getX() - 1;
		int departY = this.getY() - 1;

		for(String st : texte) {
			if(st.length()> plusLong)
				plusLong = st.length();
		}
		int arriveeX = this.getX() + this.texte.size();
		int arriveeY = this.getY() + plusLong;
		
		int diffX = Math.abs(arriveeX - departX)+1;
		int diffY = Math.abs(arriveeY - departY);
		
		for (int n = 0; n < diffX; n++) {
			try {
			tab[departX+n][departY]=this.getCaracterEncadrement();
			tab[arriveeX-n][arriveeY]=this.getCaracterEncadrement();
			}
			catch(ArrayIndexOutOfBoundsException e) {
			}
		}
		for(int j = 0; j < diffY; j++) {
			try {
			tab[arriveeX][arriveeY-j]=this.getCaracterEncadrement();
			if(j+departY != tab[0].length-1)
			tab[departX][departY+j]=this.getCaracterEncadrement();
			}
			catch(ArrayIndexOutOfBoundsException e) {
				
			}
		}

	}

	public String toString() {
		String s=" ";
		for(String st : texte) {
			s += st.toString() + " ";
			s += "\n";
		}
		return s;
	}

	@Override
	public void dessiner(char[][] tab) {

		int X = this.getX();

		for( int j = 0; j < texte.size(); j++) {

			for(int i = 0; i < texte.get(j).length(); i++) {

				try {
					tab[X][this.getY() + i] = texte.get(j).charAt(i);
				}
				catch(ArrayIndexOutOfBoundsException e) {
				}

			}
			X++;
		}



	}

}