import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindBrokenLinks {
	
	WebDriver driver;
	@BeforeMethod
	public void launchAPP()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
	}

	
	@Test
	public void handleboken_links() throws ClientProtocolException, IOException
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement x:links){
			String url=x.getAttribute("href");
			getresponse(url);
		}
	}
	
	public void getresponse(String url) throws ClientProtocolException, IOException{
		HttpClient client=HttpClientBuilder.create().build();
		HttpGet request=new HttpGet(url);
		HttpResponse res=client.execute(request);
		
		if(res.getStatusLine().getStatusCode()==200)
			System.out.println("link is valid");
		else
			System.out.println("link is invalid");
	}


	}

