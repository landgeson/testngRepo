package Dataprovider;

import org.testng.annotations.DataProvider;

public class datproviderdemo2 {
	@DataProvider(name="Testdeta")
	public Object[][]datamethod(){
		return new Object[][] {{"Sonali@1998", "Passwoard","Invalid"},
			{"Username@1234","12345","Valid"}};
	}

}
