import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleMouseandKeyBoardActions {
	WebDriver driver;
	Actions a;
	@BeforeMethod
	public void openapp(){
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");

	}
	
	
	// another way of right clik 
	
	
	/*"Actions act=newActions(driver);// where driver is WebDriver type

	act.moveToElement(webElement).perform();

	act.contextClick().perform();"
*/
	
	//@Test
	public void draganddropby(){
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement dragable=driver.findElement(By.xpath("//*[@id='draggable']"));
		a.dragAndDropBy(dragable, 50, 50).build().perform();
		
	}
	
	//@Test
	public void draganddrop(){
		driver.get("https://jqueryui.com/droppable/");
		a=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//*[@id='droppable']"));
		
		a.dragAndDrop(drag, drop).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id='sidebar']/aside[1]/ul/li[4]/a")).click();
	}
	
	//@Test
	public void mouseHover(){
		driver.get("https://jqueryui.com/droppable/");
		a=new Actions(driver);
		WebElement downloadlink=driver.findElement(By.xpath("//*[@id='menu-top']/li[2]/a"));
		a.moveToElement(downloadlink).build().perform();
	}
	
	//@Test
	public void doubleclick(){
		driver.get("https://jqueryui.com/droppable/");
		a=new Actions(driver);
		WebElement downloadlink=driver.findElement(By.xpath("//*[@id='menu-top']/li[2]/a"));
		a.doubleClick(downloadlink).build().perform();
	}
	
	@Test
	public void contextClick007(){
		driver.get("https://jqueryui.com/droppable/");
		a=new Actions(driver);
		WebElement downloadlink=driver.findElement(By.xpath("//*[@id='menu-top']/li[2]/a"));
		a.contextClick(downloadlink).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		
	}
}





