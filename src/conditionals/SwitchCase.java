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
		System.out.println("Dammi un numero da 1 a 4");
		int numero = Integer.parseInt(scanner.nextLine());

		switch (numero) {
			case 1 -> System.out.println("Spring");
			case 2 -> System.out.println("Summer");
			case 3 -> System.out.println("Autumn");
			case 4 -> System.out.println("Winter");
			default -> System.out.println("Number not valid");
		}


		String season = switch (numero) {
			case 1 -> "Spring";
			case 2 -> "Summer";
			case 3 -> "Autumn";
			case 4 -> "Winter";
			default -> "Number not valid";
		};

		System.out.println(season);

	}
}
