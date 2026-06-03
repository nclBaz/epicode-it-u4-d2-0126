package conditionals;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Dammi un voto:");
//		int score = Integer.parseInt(scanner.nextLine());
//
//		switch (score) {
//			case 100: {
//				System.out.println("Voto massimo!");
//				break;
//			}
//			case 90: {
//				System.out.println("Molto bene!");
//				break;
//			}
//			case 80: {
//				System.out.println("Voto buono");
//				break;
//			}
//			default: {
//				System.out.println("Puoi fare di meglio!");
//				break;
//			}
//		}

		// ****************************************** ENHANCED SWITCH-CASE **************************************************
//		System.out.println("Dammi un numero da 1 a 4");
//		int numero = Integer.parseInt(scanner.nextLine());
//
//		switch (numero) {
//			case 1 -> System.out.println("Spring");
//			case 2 -> System.out.println("Summer");
//			case 3 -> System.out.println("Autumn");
//			case 4 -> System.out.println("Winter");
//			default -> System.out.println("Number not valid");
//		}
//
//
//		String season = switch (numero) {
//			case 1 -> "Spring";
//			case 2 -> "Summer";
//			case 3 -> "Autumn";
//			case 4 -> "Winter";
//			default -> "Number not valid";
//		};
//
//		System.out.println(season);

		System.out.println("Dammi un numero");
		int x = Integer.parseInt(scanner.nextLine()); // 4

		System.out.println("Dammi un secondo numero");
		int y = Integer.parseInt(scanner.nextLine()); // 5

		int z = (x-- > y) ? y++ : ++x;
		// int z = (x-- > y) ? y++ : x++;
		// N.B. ++x e x++ NON SONO LA STESSA COSA
		// ++x: PRE-INCREMENTO, vuol dire che prima viene incrementato il valore di x per poi essere letto
		// x++: POST-INCREMENTO, cioè prima leggiamo il valore di x, poi viene incrementato

		System.out.println("z: " + z); // 4

		switch (z) { //  x = 4; y = 5; z = 4;
			case 5: {
				System.out.println("CASE A");
				x += 2;
			}
			default: {
				System.out.println("CASE DEFAULT");
				y--;
			}
			case 4: {
				System.out.println("CASE B");
				x = x + y; //  x = 9; y = 5; z = 4;
				break;
			}
			case 3: {
				System.out.println("CASE C");
				y++;
			}
		}

		System.out.println("x: " + x); // 9
		System.out.println("y: " + y); // 5

	}
}
