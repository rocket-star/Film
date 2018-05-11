package Image;

import java.util.ArrayList;

import Elements.Element;


public class Image {
	private char[][] plan;// tableau a 2 dimensions (le plan)
	private String nomImage;
	private ArrayList<Element> element;
	private int longeur, largeur;

	public Image(String nom, int l, int L) {
		this.nomImage = nom;
		this.element = new ArrayList<Element>();
		this.longeur = l;
		this.largeur = L;
	}

	//2eme constructeur
	public Image(Image image, String nom) {
		this.nomImage = nom;
		this.element = image.element;
		this.longeur = image.longeur;
		this.largeur = image.largeur;
	}


	public void insererElement(Element e, int ind) {
		element.add(ind, e);
	}

	public void supprimerElement(int ind) {
		element.remove(ind);
	}

	public String toString() {
		char[][] tab = new char[this.longeur][this.largeur];
		String resultat = "";
		for(int i = 0; i < this.element.size(); i++) {
			this.element.get(i).dessiner(tab, this.element.get(i).getX(), this.element.get(i).getY());
		}
		for(int j = 0; j < tab.length; j++ ) {
			for(int v = 0; v < tab.length; v++ ) {
				resultat += tab[j][v];
			}	resultat += "\n";
		}
		return resultat;
	}
}