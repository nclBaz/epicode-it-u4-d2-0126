package loops;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {


		// *********************************** WHILE **********************************************

		// Nel ciclo WHILE, come prima cosa viene VALUTATA LA CONDIZIONE (BOOLEANA)
		// se è FALSA: allora non si entra proprio
		// se è VERA: si entra nel loop
		// se la variabile all'interno della condizione non cambia mai di valore --> CICLO INFINITO

		Scanner scanner = new Scanner(System.in);

//		System.out.println("Dammi un numero");
//		int x = Integer.parseInt(scanner.nextLine()); // 1
//
//		System.out.println("Dammi un secondo numero");
//		int y = Integer.parseInt(scanner.nextLine()); // 2
//
//		while (y <= x + 50) {
//			x++;
//			y += 5;
//			System.out.println(y);
//		}

//		int sum = 0;

//		while (true) {
//			System.out.println("Dammi un numero, premi 0 per uscire");
//			int numero = Integer.parseInt(scanner.nextLine());
//			if (numero == 0) break;
//			sum = sum + numero;
//		}
//
//		System.out.println("La somma è: " + sum);

//		int sum = 0;
//		int numero = 0;
//
//		do {
//			System.out.println("Dammi un numero, premi 0 per uscire");
//			numero = Integer.parseInt(scanner.nextLine());
//			sum = sum + numero;
//		} while (numero != 0);
//
//		System.out.println("La somma è: " + sum);

		// ***************************************************** FOR *************************************
		// Quando sappiamo con anticipo il numero esatto di ripetizioni da fare usiamo il FOR
//
//		int[] numbers = new int[5];
//
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println("Dammi un numero intero:");
//			numbers[i] = Integer.parseInt(scanner.nextLine());
//		}

		// ***************************************************** ENHANCED FOR *************************************
//		for (int element : numbers) { // Alternativa compatta al for classico quando non abbiamo bisogno di accedere all'indice
//			System.out.println(element);
//		}

//		for (int i = 0; i < numbers.length; i++) { // Equivalente a sopra
//			System.out.println(numbers[i]);
//		}

		// ***************************************************** BREAK & CONTINUE *********************************
//		for (int i = 0; i < 1000; i++) {
//			if (i == 100) break; // Usciamo anticipatamente dal ciclo
//			System.out.println(i);
//		}

//		for (int i = 0; i < 1000; i++) {
//			if (i == 100) continue; // Salta l'iterazione corrente e va alla successiva
//			System.out.println(i);
//		}

		for (int i = 0; i < 5; i++) {
			if (i == 3) continue;
			System.out.println("i --> " + i);
			for (int j = 0; j < 5; j++) {
				if (j == 2) break;
				System.out.println("j --> " + j);
			}
		}
	}
}
