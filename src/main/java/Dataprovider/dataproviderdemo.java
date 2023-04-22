package Dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderdemo {
	
	@DataProvider(name="Dataprovider_Testdeta")
		public Object[][]datamethod(){
			return new Object[][] {{"testvalue1"}, {"testvalue2"},{"testvalue3"}};
		}
	@Test (dataProvider="Testdeta",dataProviderClass  = datproviderdemo2.class)
	  public void testMethod(String Username,String Pwd,String status ) {
		  System.out.println("dataprovider contains data:");
		  System.out.println("Username :"+Username);
		  System.out.println("Pwd :"+Pwd);
		  System.out.println("status :"+status);
	  }
		
	

}
