package Packagetest;

import org.openqa.selenium.chrome.ChromeDriver;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Titleverification {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver =new ChromeDriver();
        driver.get("https://www.google.com");
	}
	@Test
	public void title()
	{
		String exptitle="Google.com";
        String actualtitle=driver.getTitle();
        System.out.println("actualtitle="+actualtitle);
        if(exptitle.equals(actualtitle))
        {
        	System.out.println("pass");	
        }
        else
        {
        	System.out.println("fail");
	}
        
	}

}