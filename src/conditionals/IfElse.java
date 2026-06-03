package conditionals;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
//
//		String input = scanner.nextLine();
//
//		if (input.isEmpty()) System.out.println("La stringa è vuota!"); // <----- NON SIAMO IN JAVASCRIPT E QUA NON ESISTONO TRUTHY E FALSY, DOBBIAMO
//			// SEMPRE USARE DELLE ESPRESSIONI BOOLEANE, VALORI BOOLEANI OPPURE METODI CHE RITORNANO UN BOOLEANO
//		else System.out.println("La stringa non è vuota!");

		double totale = 50.0;
		double spedizione = totale >= 50.0 ? 0 : 5.99;
		System.out.println("Le spese di spedizione sono: " + spedizione);
	}
}
