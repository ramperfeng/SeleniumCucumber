import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MethodsVerification {

	WebDriver driver;
	
	//@Test
	public void isdisplay()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/register/");
		boolean b1=driver.findElement(By.xpath("//*[@id='submitButton']")).isDisplayed();
		System.out.println(b1);
		
	}
	//@Test
	public void isenabled()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/register/");
		boolean b2=driver.findElement(By.xpath("//*[@id='submitButton']")).isEnabled();
		System.out.println(b2);
		driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
		boolean b3=driver.findElement(By.xpath("//*[@id='submitButton']")).isEnabled();
		System.out.println("Submit button enabled know" +  b3);
		
	}
	@Test
	public void isselected()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/register/");
		boolean b4=driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected();
		System.out.println(b4);
		driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
		boolean b5=driver.findElement(By.xpath("//*[@id='submitButton']")).isEnabled();
		System.out.println("check is know clicked" +  b5);
		
	}
}
