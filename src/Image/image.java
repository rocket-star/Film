package Image;

import java.util.ArrayList;
import java.util.Scanner;

import Elements.Element;

import java.io.*;

public class image {
	private int longeur;
	private image[][] plan;// tableau à 2 dimensions (le plan)
	private int x, y;//les coordonnées du plan
	private int largeur;
	private String NomImg;
	private ArrayList<Element> element =new ArrayList<Element>();
	private Element[][] tmp;
	
	public image(int l, int L, String nom) {
		this.longeur=l;
		this.largeur=L;
		element.removeAll(element);
		this.NomImg=nom;
	}
	
	//2eme constructeur
	public image(image img, String nom) {
		this.longeur=img.longeur;
		this.largeur=img.largeur;
		this.NomImg=nom;
		this.element=img.element;
	}
		
	
	public void AjouterElement(Element e, int ind) {
		element.add(ind, e);
	}
	
	public void SupprimerElement(int ind) {
		element.remove(ind);
	}
	
	public void dessiner() {
		for (int i=0; i<element.size(); i++) {
			tmp[element.get(i).x][element.get(i).y]=element.get(i);//inverser x et y ?
		}
	}

}
