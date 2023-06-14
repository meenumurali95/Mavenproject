package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class vrlbusesbaseclass {

	public WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.vrlbus.in/#/");
		driver.manage().window().maximize();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	}
	
	
	
}
