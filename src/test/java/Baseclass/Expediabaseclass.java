package Baseclass;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Expediabaseclass {
	
	public WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.expedia.com/?=one-key-onboarding-dialog");
		driver.manage().window().maximize();
	}

}
