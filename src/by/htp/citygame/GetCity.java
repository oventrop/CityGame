package by.htp.citygame;

public class GetCity {

	
	
	public static Character getFirstChar(City city) {
		return city.getName().charAt(0);
	}

	public static Character getLastChar(City city) {
		int pos = city.getName().length();
		char lastChar = city.getName().toUpperCase().charAt(pos);
		return lastChar;
	}
}
