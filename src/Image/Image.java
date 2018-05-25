package Image;

import java.util.ArrayList;

import Elements.Element;


public class Image {
	private char[][] tab;// tableau a 2 dimensions (le plan)
	private ArrayList<Element> element;
	private int longeur, largeur;

	/** Constructeur d'Image
	 * @param l la longueur
	 * @param L la largeur
	 */
	public Image(int l, int L) {
		this.element = new ArrayList<Element>();
		this.longeur = l;
		this.largeur = L;
		this.tab = new char[l][L];
	}

	/** Constructeur d'Image
	 * � partir d'un image existante
	 * @param image, l'image copi�
	 */
	public Image(Image image) {
//		for(int i = 0; i<image.element.size(); ++i) {
//			this.element.add(Element clone = new Element (image.element.get(i)));
//		}
		this.element = image.element;
		this.longeur = image.longeur;
		this.largeur = image.largeur;
		this.tab = image.tab;
	}

	/** Insert dans la liste d'�l�ment
	 * un �l�ment
	 * @param l'�l�ment � inserer
	 * @param l'indice de la liste
	 */
	public void insererElement(Element e, int ind) {
		element.add(ind, e);
	}

	/** Retire un �l�ment de la liste d'�l�ment
	 * @param l'indice de l'�l�ment � retirer
	 */
	public void supprimerElement(int ind) {
		element.remove(ind);
	}

	/** Retourne le tableau � 2 dimensions
	 * de l'image (le plan)
	 * @return le tableau tab
	 */
	public char[][] getTab() {
		return this.tab;
	}

	public String toString() {
		String resultat = "";
		for(int i = 0; i < this.element.size(); i++) {
			this.element.get(i).dessiner(this.tab);
		}
		for(int j = 0; j < this.tab.length; j++ ) {
			for(int v = 0; v < this.tab.length; v++ ) {
				resultat += this.tab[j][v];
			}	resultat += "\n";
		}
		return resultat;
	}
}