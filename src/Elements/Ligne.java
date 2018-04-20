package Elements;

public class Ligne extends Element {
	private char ligne[];
	private int taille = 0;
	
	public Ligne(String s) { // Met la string s dans un tableau
		for (int i = 0 ; i < s.length() ;i++)
		    ligne[i]=s.charAt(i);
		taille= ligne.length;
	}
	
	public rotationLigne()

}
