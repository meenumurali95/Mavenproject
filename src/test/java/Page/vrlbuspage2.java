package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vrlbuspage2 {
	
public WebDriver driver;
	
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30)); 
	By busesoncontract=By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[4]/a");
	By contactname=By.xpath("//*[@id=\"txtcontactPerson\"]");
	By email=By.xpath("//*[@id=\"txtEmail\"]");
	By mobileno=By.xpath("//*[@id=\"txtMobileNo\"]");
	By category=By.xpath("//*[@id=\"TourCategory\"]");
	By fromcity=By.xpath("//*[@id=\"txtFromCity\"]");
	By tocity=By.xpath("//*[@id=\"txtToCity\"]");
	By departuredate=By.xpath("//*[@id=\"txtFromDate\"]");
	By month=By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]");
	By nextbutton=By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[3]");
	By alldates=By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td");
	By arrivaldate=By.xpath("//*[@id=\"txtToDate\"]");
	By selecthour=By.xpath("//*[@id=\"txtPickupHour\"]");
	By minute=By.xpath("//*[@id=\"txtPickMinute\"]");
	By timerange=By.xpath("//*[@id=\"txtPickTimeRange\"]");
	By pickup=By.xpath("//*[@id=\"txtPickup\"]");
	By bustype=By.xpath("//*[@id=\"BusType\"]");
	By passengerno=By.xpath("//*[@id=\"txtnoOfPassenger\"]");
	By remarks=By.xpath("//*[@id=\"txtremarks\"]");
	
public vrlbuspage2(WebDriver driver)
	{
		this.driver=driver;
	}
public void busescontract()
{
	driver.findElement(busesoncontract).click();
}
public void contactname()
{
	driver.findElement(contactname).sendKeys("anusree");
}
public void email()
{
	driver.findElement(email).sendKeys("anusree1234@gmail.com");
}
public void mobilenumber()
{
	driver.findElement(mobileno).sendKeys("9876543219");
}
public void category()
{
	driver.findElement(category).sendKeys("corporate Tour");
}
public void fromcity()
{
	driver.findElement(fromcity).sendKeys("chennai");
}
public void tocity()
{
	driver.findElement(tocity).sendKeys("mumbai");
}
public void departuredate()
{
	driver.findElement(departuredate).click();
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
public void arrivaldate()
{
	driver.findElement(arrivaldate).click();
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
public void selecthour()
{                                          
	driver.findElement(selecthour).sendKeys("05");
}
public void minuteselect()
{
	driver.findElement(minute).sendKeys("30");
}
public void timerange()
{
	driver.findElement(timerange).sendKeys("AM");
}
public void pickup()
{
	driver.findElement(pickup).sendKeys("IITM");
}
public void bustypeselect()
{
	driver.findElement(bustype).sendKeys("A/C SLEEPER(32) -32 seats");
}
public void passengernumber()
{
	driver.findElement(passengerno).sendKeys("2");
}
public void remarksfield()
{
	driver.findElement(remarks).sendKeys("Food-veg only and window seat preferable");
}
}
