import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleBrokenLinks {
	WebDriver driver;
	@BeforeMethod
	public void launchAPP()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
	}
	@Test
		public void handle_links() throws IOException
		{
			//WebElement box =driver.findElement(By.xpath(".//*[@id='content']/div/div[6]"));
			List<WebElement> link=driver.findElements(By.tagName("a"));
			link.add(driver.findElement(By.tagName("img")));
			
			System.out.println("total links are available in particular page"+link.size());
			
			List<WebElement> activelinks=new ArrayList<WebElement>();
			
			for(int i=0;i<link.size();i++)
			{
				System.out.println(link.get(i).getAttribute("href"));
				if(link.get(i).getAttribute("href") != null && (! link.get(i).getAttribute("href").contains("javascript")))
				{
					activelinks.add(link.get(i));
				}
			}
			System.out.println("Active links and image ---->"+activelinks.size());
			
			for(int j=0;j<activelinks.size();j++)
			{
				HttpURLConnection connection= (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
				connection.connect();
				String response=connection.getResponseMessage();
				connection.disconnect();
				System.out.println(activelinks.get(j).getAttribute("href")+"------>"+response);
					
				}
			}
			
			

		}

