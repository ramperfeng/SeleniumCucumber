import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleCalender {

	
	
	WebDriver driver;
	@Test
	public void selectdate() throws InterruptedException
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com/");
		//driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']")).click();
		
		
		// handle dynamic date s 
		/*Thread.sleep(30);
		List<WebElement> dates= driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[1]//td"));
		
		int total_nodes=dates.size();
		for ( int i=0;i<total_nodes;i++)
		{
			String date=dates.get(i).getText();
			if (date.equals("29"))
			{
				dates.get(i).click();
				break;
			}
		}
		
		*/
		
		
		//another way to handle date its static way dont use in real time
		/*Thread.sleep(30);
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
		Thread.sleep(30);
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
		Thread.sleep(30);
	    driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[4]/td[5]/a")).click(); */
	
		Actions a=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//*[@id='ctl00_HyperLinkLogin']"));
		a.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		WebElement ele1=driver.findElement(By.xpath("//*[@id='smoothmenu1']/ul/li[13]/ul/li[2]/a"));
		a.moveToElement(ele1).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='menu-list-login']/li[1]/ul/li[1]/a")).click();
		/*WebElement fi=driver.findElement(By.xpath("//*[@id='menu-list-login']/li[1]/ul/li[1]/a"));
		a.moveToElement(fi).build().perform();
		fi.click();
	*/
		
	}
	
}
