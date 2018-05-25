package Film;

import Direction.Direction;
import Elements.Caractere;
import Elements.Ligne;
import Elements.Texte;
import Image.Image;

public class Appli {
	public static void main(String[] args) {
		//Caractere c = new Caractere('a', 2, 2);
	Ligne l = new Ligne('a', 6, 5, Direction.SUD, 4);
		l.encadre('c');
//		Ligne l2 = new Ligne('a', 5, 4, Direction.OUEST, 4);
		Image img = new Image( 10, 20);
//		l.placerA(1, 5);
//		l.setTaille(5);
//		l.setLettre('x');
		img.insererElement(l, 0);
//		//c.encadre('x', img.getTab());
		l.dessineCadre( img.getTab());
//		System.out.println(img.toString());
//		Texte e = new Texte("projet", 2, 18);
//		e.encadre('x');
//		e.dessineCadre(img.getTab());
//		img.insererElement(e, 0);
		System.out.println(img.toString());
	
	}

}
