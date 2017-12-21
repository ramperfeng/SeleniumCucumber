import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandlePopups {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchAPP()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_november\\CLASS _NOTES\\chromedriver.exe");
		 driver = new ChromeDriver();
		//driver = new FirefoxDriver ();
		driver.get("https://timesofindia.indiatimes.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	

	@Test
	public void handlepopups()
	{
		//driver.findElement(By.xpath("html/body/div[4]/div[2]/span/a[1]")).click();
		
		//another way of handle popups using dynamic xpath
		driver.findElement(By.xpath("//a[contains(text(),'Not Now')]")).click();
	}
	
}
