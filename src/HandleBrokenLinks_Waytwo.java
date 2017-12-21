import java.io.IOException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandleBrokenLinks_Waytwo {

	

	WebDriver driver;
	
	@Test
	public void getbrokenlinks() throws ClientProtocolException, IOException{
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
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
