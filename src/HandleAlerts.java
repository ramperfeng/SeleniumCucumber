import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.Credentials;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleAlerts {
	
	WebDriver driver;
	Alert a;
	@BeforeMethod
	public void launchAPP()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
	}

  // @Test
   public void handlealerts() throws Exception
   {
	   //driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
	   driver.findElement(By.xpath("//*[@id='OKTab']/button")).click();
	   a=driver.switchTo().alert();
		Thread.sleep(5000);
		a.accept();

   }
   
   
   //@Test
   public void handlemultiplealerts() throws Exception
   {
	   driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	   driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();
	   a=driver.switchTo().alert();
		Thread.sleep(5000);
		a.dismiss();

   }
   @Test
   public void handle_Alert_Textbox() throws Exception
   {
	   driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	   driver.findElement(By.xpath("//*[@id='Textbox']/button")).click();
	   a=driver.switchTo().alert();
       a.sendKeys("hi");
		Thread.sleep(5000);
		a.dismiss();

   }
   
   
}

