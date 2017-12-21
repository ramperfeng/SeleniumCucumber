import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class testngtest {
	
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void testt(String browser)
	{
		
		if(browser.equals("firefox"))
		{
		driver = new FirefoxDriver();
		
		}
		else if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\selenium_november\\CLASS _NOTES\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}


	@Test(priority=1,groups="Test")
	public void launchapp()
	{
		driver.get("https://www.google.com");
	}
		


	@Test(priority=3,groups="logo")
	public void logotest()
	{
		driver.get("https://www.google.com");
	}

	@Test(priority=4,groups="job")
	public void titletest()
	{
		driver.get("https://www.google.com");
	}


	//@Test(priority=2,groups="Test",enabled=false)
	public void test1()
	{
		System.out.println("test1 results");
	}

	//@Test(priority=2,groups="Test")
	public void test2()
	{
		System.out.println("test2 results ");
		Assert.assertEquals(true, false);
	}
	//@Test(priority=4,groups="job",enabled=false)
	public void test3()
	{
		System.out.println("test3 results");
	}


}
