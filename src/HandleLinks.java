import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleLinks {
	
	WebDriver driver;
	@BeforeMethod
	public void launchAPP()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://timesofindia.indiatimes.com/");
		driver.manage().window().maximize();
		
		// this code handle popups directly
		driver.findElement(By.xpath("//a[contains(text(),'Not Now')]")).click();
	}

	// this test handle particular area having links 
	//@Test
	public void handle_links()
	{
		WebElement box =driver.findElement(By.xpath(".//*[@id='content']/div/div[6]"));
		List<WebElement> link= box.findElements(By.tagName("a"));
		for(WebElement x: link)
		{
			System.out.println(x.getText());
		}
		
	}

    @Test
    public void Page_Links()
    {
    	WebElement box =driver.findElement(By.xpath("//*[@id='content']/div"));
		List<WebElement> link= box.findElements(By.tagName("a"));
		for(WebElement x: link)
		{
			System.out.println(x.getText());
			System.out.println(x.getSize());
		}
    }
	
	
}
