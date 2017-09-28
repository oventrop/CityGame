package by.htp.citygame;

public class Player {

	char lastChar;

	public void makeMove(Cities city, char c) {

		for (int i = 0; i < city.getCities().size(); i++) {
			String s = city.getCities().get(i);
			if (s.charAt(0) == c) {
				 System.out.println(city.getCities().get(i));
				setLastChar(getLastChar(s));
				city.removeCity(i);
				break;
			}
		}
	}

	public boolean hasNextCity(Cities city, char c) {
		boolean flag = false;
		for (int i = 0; i < city.getCities().size(); i++) {
			String s = city.getCities().get(i);
			if (s.charAt(0) == c) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public char getLastChar() {
		return lastChar;
	}

	public void setLastChar(char temp) {
		this.lastChar = temp;
	}

	public char getLastChar(String city) {
		int pos = city.length() - 1;
		city = city.trim();
		char lastChar = city.toUpperCase().charAt(pos);
		if (lastChar == 'É') {
			return 'È';
		} else if (lastChar == 'Ü' || lastChar == 'Ú' || lastChar == 'Û' || lastChar == 'Ö') {
			pos = pos - 1;
			lastChar = city.toUpperCase().charAt(pos);
		}
		return lastChar;
	}
}
