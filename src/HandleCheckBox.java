import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleCheckBox {

	
	WebDriver driver;
	
	@BeforeMethod
	public void launchAPP()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.jobserve.com/in/en/Job-Search/");
		driver.manage().window().maximize();
	}
	@Test
	public void handleLabel()
	{
		driver.findElement(By.xpath("//*[@id='ddcl-selInd']/span/span")).click();
		//driver.findElement(By.xpath("/*[@id='ddcl-selInd']/span")).click();
		WebElement box=driver.findElement(By.xpath("//*[@id='ddcl-selInd-ddw']/div"));
		List<WebElement> labels=box.findElements(By.tagName("label"));
		
		for(int i=1;i<labels.size();i++){
			if(!labels.get(i).getText().equals("Engineering")){
				labels.get(i).click();
		}
		}
	
	driver.findElement(By.xpath("//*[@id='txtKey']")).sendKeys("QTP");
	driver.findElement(By.xpath("//*[@id='txtLoc']")).sendKeys("Chennai");
	
	Select s =new Select(driver.findElement(By.xpath(".//*[@id='selAge']")));
	//s.selectByVisibleText("Within 2 days");
			s.selectByValue("4");
	Select s1 =new Select(driver.findElement(By.xpath("//*[@id='selJType']")));
	 s1.selectByVisibleText("Part Time/Temporary/Seasonal");
	 driver.findElement(By.xpath("//*[@id='btnSearch']")).click();
	}
}
