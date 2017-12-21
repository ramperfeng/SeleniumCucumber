import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandleTabs {
	
	WebDriver driver;
	@Test
	public void handletabs()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.jobserve.com/in/en/Job-Search/#");
		driver.findElement(By.xpath("//*[@id='tab_pqs']")).click();
	}
	

}
