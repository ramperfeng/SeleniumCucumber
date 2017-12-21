import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class HandleScrrenshots {
	WebDriver driver;
	//@Test
	public void extractlinkfrompage() throws InterruptedException{
		driver=new FirefoxDriver();
		driver.get("https://timesofindia.indiatimes.com/");
		Thread.sleep(15000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement x:links){
			System.out.println(x.getText());
		}
		
	}
	
	@Test
	public void extractlinkspecificarea() throws InterruptedException, IOException{
		driver=new FirefoxDriver();
		driver.get("https://timesofindia.indiatimes.com/");
		Thread.sleep(15000);
		//System.out.println(findElement("//*[@id='content']/div/div[6]/ul"));
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/div[6]/ul")).isDisplayed());
		WebElement box=driver.findElement(By.xpath("//*[@id='content']/div/div[6]/ul"));
		List<WebElement> links=box.findElements(By.tagName("a"));
		takescreen();
		
		for(WebElement x:links){
			System.out.println(x.getText());
		}
	}
	
	public boolean findElement(String xpath){
		if(driver.findElement(By.xpath(xpath)).equals(null))
			return false;
		else 
			return true;
	}
	
	public void takescreen() throws IOException{
		File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE); 
			// now copy the screenshot to desired location using copyFile method.
			FileUtils. copyFile(src, new File("D://timessc.png"));
	}
	
}
