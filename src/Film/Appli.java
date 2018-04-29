package Film;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Appli {

	public static void main( String [ ] args ) {
		//String maChaine ="C'est un test";

		//for (int i = 0 ; i < maChaine.length() ;i++)
		// System.out.println(maChaine.charAt(i));
		//		try{
		//			InputStream flux=new FileInputStream("test.txt"); 
		//			InputStreamReader lecture=new InputStreamReader(flux);
		//			BufferedReader buff=new BufferedReader(lecture);
		//			String ligne;
		//			while ((ligne=buff.readLine())!=null){
		//				System.out.println(ligne);
		//			}
		//			buff.close(); 
		//			}		
		//			catch (Exception e){
		//			System.out.println(e.toString());
		//			}
		char [] ligne = {'a', 'b', 'c'};
		String s=" ";
		for(char c : ligne) {
			s += c;
		}
		System.out.println(s);;
	}

}
