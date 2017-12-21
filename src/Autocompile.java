import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Autocompile {
	
	
	WebDriver driver;
	@BeforeMethod
	public void launchApp()
	{
		
		FirefoxProfile fp= new FirefoxProfile();
		fp.setPreference("dom.webnotifications.enabled", false);
		driver = new FirefoxDriver(fp);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
	}
	
	@Test
	public void autocompile()
	{
		try {
			driver.findElement(By.xpath("//*[@id='src']")).sendKeys("H");
			WebElement box= driver.findElement(By.xpath("//*[@id='search']/div/div[1]/div/ul")); 
			List<WebElement> list= box.findElements(By.tagName("li"));	
			for (WebElement x: list)
			{
				if(x.getText().equalsIgnoreCase("Hubli"))
				{
					x.click();
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
		
	}
	@AfterTest
	public void closeapp()
	{
		driver.close();
	}

}
