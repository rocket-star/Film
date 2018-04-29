package Image;

import java.util.ArrayList;

import Elements.Element;


public class Image {
	private int longeur;
	private Image[][] plan;// tableau a 2 dimensions (le plan)
	private int x, y;//les coordonnees du plan
	private int largeur;
	private String nomImage;
	private ArrayList<Element> element;

	public Image(int l, int L, String nom) {
		this.longeur=l;
		this.largeur=L;
		this.nomImage=nom;
		this.element =new ArrayList<Element>();
	}

	//2eme constructeur
	public Image(Image image, String nom) {
		this.longeur=image.longeur;
		this.largeur=image.largeur;
		this.nomImage=nom;
		this.element=image.element;
	}


	public void insererElement(Element e, int ind) {
		element.add(ind, e);
	}

	public void supprimerElement(int ind) {
		element.remove(ind);
	}

	public String dessiner() {
		return this.toString();
	}
}

