package Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;



import Baseclass.vrlbusesbaseclass;
import Page.vrlbuspage2;

public class vrlbustest2 extends vrlbusesbaseclass {
	
	@Test
	 public void vrlbuspage2test()
	 {
		 
		 
		 vrlbuspage2 obj=new vrlbuspage2(driver);
		 obj.busescontract();
		 obj.contactname();
		 obj.email();
		 obj.mobilenumber();
		 obj.category();
		 obj.fromcity();
		 obj.tocity();
		 obj.departuredate();
		 obj.arrivaldate();
		 obj.selecthour();
		 obj.minuteselect();
		 obj.timerange();
		 obj.pickup();
		 obj.bustypeselect();
		 obj.passengernumber();
		 obj.remarksfield();
	 }

}
