package by.htp.citygame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Cities {

	private ArrayList<String> cities = new ArrayList<String>();

	public ArrayList<String> getCities() {
		return cities;
	}

	public void setCities(ArrayList<String> cities) {
		this.cities = cities;
	}

	public void readCities() {
		String s = null;
		try {
			ArrayList<String> a = new ArrayList<String>();
			
			FileReader fr = new FileReader("d:\\_JAVA\\CityGame\\Cities.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while ( ( s = br.readLine()) != null) {
				a.add(s);
				//System.out.println(s);

			}
			setCities(a);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void removeCity (int x) {
		cities.remove(x);
	}

}
