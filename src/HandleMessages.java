import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleMessages {

	
	WebDriver driver;
	
	@BeforeMethod
	public void launchApp()
	{
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_november\\CLASS _NOTES\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://practice.automationtesting.in");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public void handleMessage() throws InterruptedException
	{
		
		
		driver.findElement(By.xpath("//*[@id='text-22-sub_row_1-0-2-0-0']/div/ul/li/a[1]/h3")).click();
		driver.findElement(By.xpath("//*[@id='product-160']/div[2]/form/button")).click();
		driver.findElement(By.xpath("//*[@id='content']/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='page-34']/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input")).click();
		driver.findElement(By.xpath("//*[@id='page-34']/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input")).clear();
		driver.findElement(By.xpath("//*[@id='page-34']/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input")).sendKeys("5");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.findElement(By.xpath("//*[@id='text-22-sub_row_1-0-2-0-0']/div/ul/li/a[2]")).click();
		Thread.sleep(30);
		driver.findElement(By.xpath("//*[@id='text-22-sub_row_1-0-2-0-0']/div/ul/li/a[3]")).click();
		//Select s =new Select(driver.findElement(By.xpath("//*[@id='page-34']/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input")).
		new Select(driver.findElement(By.xpath("//*[@id='page-34']/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input"))).selectByVisibleText("2");
		String expectd="Selenium Ruby";
	    String actual=driver.findElement(By.xpath("//*[@id='page-34']/div/div[1]/form/table/tbody/tr[1]/td[3]/a")).getText();
	    Assert.assertEquals(actual,expectd);
	    System.out.println(actual);
		driver.findElement(By.xpath("//*[@id='page-34']/div/div[1]/form/table/tbody/tr[1]/td[1]/a")).click();
		String expectd="Selenium Ruby removed";
	    String actual=driver.findElement(By.xpath("//*[@id='page-34']/div/div[1]")).getText();
	    String[] act=actual.split(".");
	    String ac= act[0];
	    
	    System.out.println(Arrays.toString(act));
	    //actual -----Selenium Ruby removed. Undo ?
	    Assert.assertEquals(act,expectd);
	    //Assert.assertTrue(actual.contains("Selenium Ruby removed"));
	    System.out.println(actual);	
	*/
		}
}
