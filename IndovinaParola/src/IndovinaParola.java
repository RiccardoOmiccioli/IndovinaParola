//import java.lang.String;
import java.util.Scanner;

public class IndovinaParola {
	public static void main( String[] args ) {
	
		Scanner input = new Scanner( System.in );
		
		String ParolaMisteriosa = "ciao";
		int tentativi = 0;
		boolean indovinato = false ;
		
		do {
			System.out.print( "Tentativo numero " + (tentativi + 1) + " di 10 - Inserire una parola: " );
			String s = input.next();
			
			if ( s.equals( ParolaMisteriosa ) ) {
				System.out.println("INDOVINATO !");
				indovinato = true;
			} 
			else {
				System.out.println("Sbagliato ...");
				tentativi ++;
				if ( ParolaMisteriosa.compareTo( s ) < 0 )
					System.out.println( "La parola misteriosa precede " + s + "\n");
				else
					System.out.println( "La parola misteriosa segue " + s + "\n");
			}
		} while ( !indovinato && tentativi < 10 );
		
		if ( !indovinato ) System.out.println( "Tentativi esauriti" );
	
		input.close();
	}
}
