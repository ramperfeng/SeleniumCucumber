import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandlingFrames {
 
	WebDriver driver;
	
	@BeforeMethod
	public void launchurl()
	{
		driver =new  FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Frames.html");
		
	}
	//@Test
	public void handleFrames()
	{
	
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("html/body/section/div/div/div/input")).sendKeys("Hi");
	}
	
	@Test
	public void frameinsideframe()
	{
		driver.findElement(By.xpath("html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		driver.switchTo().frame(1).switchTo().frame(0);
		driver.findElement(By.xpath("html/body/section/div/div/div/input")).sendKeys("Hi");
	}
}
