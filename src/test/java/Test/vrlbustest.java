package Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;



import Baseclass.vrlbusesbaseclass;
import Page.vrlbusespage;


public class vrlbustest extends vrlbusesbaseclass 
{
	@Test
	public void vrlbuspage1test()
	{
		vrlbusespage ob=new vrlbusespage(driver);

		ob.source();
		ob.destination();
		ob.departure();
		ob.search();
	}
	
}
