package Elements;

public class Caractère extends Element {
private char caractère;


	public Caractère(char c){
		caractère = c;
	}
	
	public char getCaractère() {
		return caractère;
	}
	
	public void setCaractère(char c) {
		if(c!=caractère)
			caractère=c;
	}
}
