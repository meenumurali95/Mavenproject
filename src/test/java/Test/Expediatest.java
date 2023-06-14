package Test;

import org.testng.annotations.Test;
import Baseclass.Expediabaseclass;
import Page.Expediapage1;

public class Expediatest extends Expediabaseclass {
	@Test
	public void Test1()
	{
		
		Expediapage1 ob=new Expediapage1(driver);
		ob.flightclick();
		ob.roundtripclick();
		ob.leaving();
		ob.start("Brussels");
		ob.goingto();
		ob.desti("Newyork");
		ob.departingdate();
		ob.returndate();
		ob.travelers();
		ob.seat();
		
		
		
		
	}
	

}
