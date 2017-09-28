package by.htp.citygame;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		playGame();
	}

	
	public static  void playGame() {
		Cities city = new Cities();
		city.readCities();
		Player pl1 = new Player();
		Player pl2 = new Player();
		System.out.println("What char is 1st?");
		Scanner sc = new Scanner(System.in);
		char c = sc.nextLine().toUpperCase().charAt(0);
		pl1.makeMove(city, c);
		while (city.getCities().isEmpty() == false) {
			if (pl2.hasNextCity(city, pl1.lastChar) != true) {
				System.out.println("Pl2 lost");
				break;

			} else {System.out.println("Player2 move: ");
				pl2.makeMove(city, pl1.lastChar);
			}
			if (pl1.hasNextCity(city, pl2.lastChar) != true) {
				System.out.println("Pl1 lost");
				break;
			} else {
				System.out.println("Player1 move: ");
				pl1.makeMove(city, pl2.lastChar);

			}
		}

	}
}
