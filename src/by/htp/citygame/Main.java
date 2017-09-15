package by.htp.citygame;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String args[]) {
		Cities city = new Cities();
		city.readCities();
		/*ArrayList<String> list = city.getCities();
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String i = it.next();
			System.out.println(i);
		}*/
		Player pl1 = new Player();
		pl1.makeMove('A');

	}
}
