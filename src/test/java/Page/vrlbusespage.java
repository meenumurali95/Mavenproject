package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vrlbusespage {
	public WebDriver driver;
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30)); 
	By dismiss=By.xpath("//*[@id=\"largeModal\"]/div/div/button");
	By source=By.xpath("//*[@id=\"FromCity\"]");
	By destination=By.xpath("//*[@id=\"ToCity\"]");
	By departure=By.xpath("//*[@id=\"txtFromDate\"]");
	By month=By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]");
	By alldates=By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td");
	By nextbutton=By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[3]");
	By search=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[3]/button");
    
public vrlbusespage(WebDriver driver)
	{
		this.driver=driver;
	}

public void source()
{
	driver.findElement(source).sendKeys("chennai");
}
public void destination()
{
	driver.findElement(destination).sendKeys("Mumbai");
}
public void departure()
{
	driver.findElement(departure).click();
	while(true)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(month));
		WebElement months=driver.findElement(month);
		    String monthexp=months.getText();
		if(monthexp.equals("August 2023"))
		{
			System.out.println("month selected="+monthexp);
			break;
		}
		else
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(nextbutton));
			driver.findElement(nextbutton).click();
		    }
	}
	List<WebElement> alldates1=driver.findElements(alldates);
    for(WebElement dateelement:alldates1)
    {
    	String date=dateelement.getAttribute("data-day");
        if(date.equals("20"))
    	{
    		dateelement.click();
    		System.out.println("date selected is="+date);
    		break;
        }
    }
}
public void search() 
{
	driver.findElement(search).click();
}
}
