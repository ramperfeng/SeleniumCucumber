import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleWindows {

	WebDriver driver;
	@BeforeMethod
	public void launchAPP()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
	}
	// this test handle only single window when open at click
	@Test
	public void Haandle_windows()
	{
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();
		String mainwindow=driver.getWindowHandle();
		gotochilewindow();
		driver.findElement(By.xpath("//*[@id='container']/header/div/div/div[2]/ul/li[4]/a")).click();
	}
	
	public void gotochilewindow(){
		for(String childwindow:driver.getWindowHandles())//getWindowHandles is a method to copy child windows in to list
		{
			driver.switchTo().window(childwindow);
		}
	}
	
	
	
	@Test
	public void handle_twowindows() throws Exception
	{//
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='Multiple']/button")).click();
		
		Thread.sleep(3000);
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String mainwindow=it.next();
		String childwindow=it.next();
		String childwindow2=it.next();
		
		driver.switchTo().window(childwindow2);
		driver.findElement(By.xpath("//*[@id='container']/header/div/div/div[2]/ul/li[4]/a")).click();
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("a@a.in");
		
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
		
	}
	
}
