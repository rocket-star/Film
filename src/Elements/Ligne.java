package Elements;

public class Ligne extends Element {
	private char ligne[];
	private int taille = 0;
	private enum inclinaison{Horizontale, Verticale, Oblique};
	
	public Ligne(String s) { // Met la string s dans un tableau
		for (int i = 0 ; i < s.length() ;i++)
		    ligne[i]=s.charAt(i);
		taille= ligne.length;
		orientation orien = orientation.Horizontale;
	}
	
	public void rotationLigne(char ligne[]) {
		
	}
	
	public char[] getLigne() {
		return ligne;
	}

}
