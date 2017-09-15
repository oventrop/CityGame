package by.htp.citygame;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Player {

	public Character makeMove(char c) {
		Cities city = new Cities();
		ArrayList<String> list = city.getCities();
		ListIterator<String> it = list.listIterator();
		while (it.hasNext()) {
			String i = it.next();
			if (i.charAt(0) == c) {
				System.out.println(i);
				it.remove();
				city.setCities(list);
				return getLastChar(i);
			}
		}
		return null;
	}

	public static Character getFirstChar(String city) {
		return city.charAt(0);
	}

	public static Character getLastChar(String city) {
		int pos = city.length();
		char lastChar = city.toUpperCase().charAt(pos);
		if (city.toUpperCase().charAt(pos) == 'É') {
			return 'È';
		} else if (lastChar == 'Ü' || lastChar == 'Û' || lastChar == 'Ú') {
			pos--;
		}

		return lastChar;
	}
}
