package Elements;

public class Caract�re extends Element {
private char caract�re;


	public Caract�re(char c){
		caract�re = c;
	}
	
	public char getCaract�re() {
		return caract�re;
	}
	
	public void setCaract�re(char c) {
		if(c!=caract�re)
			caract�re=c;
	}
}
