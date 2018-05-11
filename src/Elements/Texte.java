package Elements;

import java.util.ArrayList;

public class Texte extends Element { 
	private ArrayList<String> texte;

	public Texte(String s, int x , int y) {
		super(x ,y);
		texte = new ArrayList<String>();
		texte.add(s);
	}

	public ArrayList<String> getTexte(){
		return texte;
	}

	@Override
	public void deplacer(Element e, int x, int y) {

	}

	@Override
	public void encadre(char c) {

	}

	public String toString() {
		String s=" ";
		for(String st : texte) {
			s += st.toString() + " ";
			s += "\n";
		}
		return s;
	}

}
