import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HandleQADemoSite {
	
	WebDriver driver;
	/*@BeforeMethod
	@Parameters("browser")
	public void Launchbrowser(String browser)
	{
		if(browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\selenium_november\\CLASS _NOTES\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
	}*/
	
	@BeforeMethod
	public void launchapp()
	{
		driver = new FirefoxDriver();
		
	}
	@Test
	public void handledemosite()
	{
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("MR");
		driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input")).sendKeys("Reddy");
		//driver.findElement(By.xpath("//*[@id='sex-0']")).click();
		
		
		//Radio Button Selection
		WebElement radio=driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[14]"));
		List<WebElement> r=radio.findElements(By.tagName("label"));
		
		
		System.out.println(r.size());
		
		for(WebElement x: r)
		{
			if(x.getText().equals("Female"))
			{
				x.click();
			}
		}
	    
		
		//Radio Button Selection
		//driver.findElement(By.xpath("//*[@id='exp-3']")).click();
		WebElement exp1=driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[18]"));
		List<WebElement> e=exp1.findElements(By.name("exp"));
			
		
		for(int i=1;i<e.size();i++)
		{
			if(i==3)
			e.get(i).click();
		}
		System.out.println(e.size());
		
		
		//multiple check box  Selection
		WebElement check=driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[29]"));
		List<WebElement> ch=check.findElements(By.name("tool"));
			
		
		for(int j=0;j<ch.size();j++)
		{
			if(j==1)
			ch.get(j).click();
		}
		System.out.println(ch.size());
		
		//drop down selection
		Select s =new Select(driver.findElement(By.xpath("//*[@id='continents']")));
		 s.selectByVisibleText("Africa");
		 
		 
		 //multiple drop down  vales selected  
		 
		 Select s1 =new Select(driver.findElement(By.xpath("//*[@id='selenium_commands']")));
		 s1.selectByVisibleText("WebElement Commands");
		 s1.selectByVisibleText("Navigation Commands");
	}
}
