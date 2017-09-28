import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CityGameTest {
  
	String [] cities = new String[50];
	
	@BeforeClass
	public static void initCities{
		cities[0] = "Minsk";
	}
	
@Test
  public void testReturnCity{
	assertNotNull (city !=null, "City is empty");
	}
}
