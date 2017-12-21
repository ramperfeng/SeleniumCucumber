import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleRadioButtons {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchAPP()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.jobserve.com/in/en/JobListing.aspx?shid=99CE91AED5E2BA1781");
	}
	@Test
	public void handlebutton()
	{
		WebElement box = driver.findElement(By.xpath("//*[@id='JobType']/div[2]"));
		List<WebElement> list= box.findElements(By.tagName("label"));
		for (WebElement x : list)
		{
			if(x.getText().equals("Permanent"))
			{
				x.click();
			}
			
			
		}
	}

}
