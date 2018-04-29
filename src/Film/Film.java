package Film;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import Image.Image;

public class Film {
	private ArrayList<Image> listeImage;
	private String nomFilm;
	private int longueur, largeur;

	public Film(String nomF) {
		this.nomFilm = nomF;
		this.listeImage = new ArrayList<Image>();
		this.largeur = 10;
		this.longueur = 10;
	}

	public Film(String nomF, int longueur, int largeur) {
		this.nomFilm = nomF;
		this.listeImage = new ArrayList<Image>();
		this.largeur = largeur;
		this.longueur = longueur;
	}

	public void sauvegarderFilm() throws IOException{
		String contenuFilm;
		contenuFilm = this.largeur + " " + this.longueur;
		for(int i=0; i<this.listeImage.size(); i++) {
			contenuFilm += this.listeImage.get(i).dessiner();
			if(i != this.listeImage.size()-1) {
				contenuFilm += "\newframe";
			}
		}
		PrintWriter out = new PrintWriter(this.nomFilm + ".txt");
		out.println(contenuFilm);	
	}

	public void insererImage(Image img, int ind) {
		this.listeImage.add(ind, img);
	}

	public void addImage(Image img) throws IOException{
		//ajoute l'image listeImage à la liste d'image listeImage
		this.listeImage.add(img);
	}

	public Image getImage(int ind) {
		//retourne l'image à l'indice ind
		return this.listeImage.get(ind);
	}

	public void retirerImage(int ind) {
		this.listeImage.remove(ind);
	}


}
