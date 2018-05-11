package Film;

import Elements.Ligne;
import Image.Image;

public class Appli {
	public static void main(String[] args) {
		//Caractere c = new Caractere('a', 2, 2);
		Ligne l = new Ligne('a', 3, 2, "obliqueD", 5);
		Image img = new Image("image", 20, 20);
		img.insererElement(l, 0);
		//img.insererElement(c, 0);
		System.out.println(img.toString());
	
/*Ligne
	public static void main(String[] args) {
		char tab[][] = new char[10][10];
		for (int i = 0; i < 10; ++i) {
			for (int j = 0; j < 10; ++j) {
				tab[i][j] = '_';
			}
		}
		Ligne l = new Ligne('a', 10, 10, "obliqueD", 4);
		l.dessiner(tab, 5, 4);
		for (int i = 0; i < 10; ++i) {
			for (int j = 0; j < 10; ++j) {
				System.out.print(tab[i][j]);
			}
			System.out.println();
		}
		Fin Ligne*/
	
		// char [] ligne = {'a', 'b', 'c'};
		// String s=" ";
		// for(char c : ligne) {
		// s += c;
		// }
		// System.out.println(s);;
	}

}
