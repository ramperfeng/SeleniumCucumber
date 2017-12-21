import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleDropDown {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchAPP()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.jobserve.com/in/en/Job-Search/");
	}
	
	@Test
	public void HandleDropDown_Test()
	{
		Select s =new Select(driver.findElement(By.xpath(".//*[@id='selAge']")));
		//s.selectByVisibleText("Within 2 days");
				s.selectByValue("4");
		Select s1 =new Select(driver.findElement(By.xpath("//*[@id='selJType']")));
		 s1.selectByVisibleText("Part Time/Temporary/Seasonal");
	}
	

}
