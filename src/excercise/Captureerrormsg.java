package excercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Captureerrormsg {

	
	WebDriver driver;
	
	
	
	@Test
	public void testapp()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("qwert");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("qaswde");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		String expected=driver.findElement(By.xpath(".//*[@id='globalContainer']/div[3]/div/div/div")).getText();
		System.out.println(expected);
		String actual ="The password that you've entered is incorrect. Forgotten password?";
		
		Assert.assertEquals(actual, expected);
	   //Assert.assertTrue(expected.contains("The password that you've entered is incorrect"));   
	}
}
