package Film;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.*;//Pour class File

import Image.image;

public class film {
	private ArrayList<image> Img =new ArrayList<image>();
	private String NomFilm;
	
	public film(String NomF, String NomRep ) {//permet de lister le nom de chaque fichier d'un repertoire
		this.NomFilm=NomF;
		File repertoire = new File(NomRep);
	        String liste[] = repertoire.list();      
	 
	        if (liste != null) {         
	            for (int i = 0; i < liste.length; i++) {
	            	image img = new image(liste[i]);
	            }
	        } else {
	            System.err.println("Nom de repertoire invalide");
	        }
	}
	
	public void InsérerImage(image img, int x, int y) {
		//Dans une arraylist ou linkedlist ??
	}
	
	public void SauvegarderFilm() throws IOException{
		PrintWriter out = new PrintWriter(this.NomFilm + ".txt");
		 out.println(this.Img);
	}
	
	public void AjouterImgAuFilm(image img) throws IOException{
		Img.add(img);//ajoute l'image img à la liste d'image Img
	}
	public image GetImage(int x, int y) {
		return image.plan[x][y];//attribut plan en public ?
	}
	
	public void RetirerImage(int ind) {
		Img.remove(ind);
	}
	
	
}
