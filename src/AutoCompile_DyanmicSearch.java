import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AutoCompile_DyanmicSearch {
	
	
	WebDriver driver;
	
	@Test
	public void dynamicxpath()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
	    driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("java");
	    List<WebElement> options=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
	
	    System.out.println(options.size());
	    for(int i=0;i<options.size();i++)
	    {
	    	if(options.get(i).getText().equals("javascript"))
	    	{
	    		options.get(i).click();
	    		break;
	    		
	    			}
	    }
	}

}
