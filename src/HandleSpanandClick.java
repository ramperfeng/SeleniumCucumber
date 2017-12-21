import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleSpanandClick {
	
          WebDriver driver;
          @BeforeMethod
          public void openAPP()
          {
	         driver = new FirefoxDriver();
	         driver.get("https://www.jobserve.com/in/en/Job-Search/");
	         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	         driver.manage().window().maximize();
          }

          @Test
          public void handlespan()
          {
        	  driver.findElement(By.xpath("//*[@id='ddcl-selCat']/span/span")).click();
        	 WebElement box= driver.findElement(By.xpath("//*[@id='ddcl-selCat-ddw']/div"));
        	 List<WebElement> span= box.findElements(By.tagName("label"));
        	 
        	 for (WebElement x : span)
     		{
     			System.out.println(x.getText());
     			if(x.getText().equals("Bilingual"))
     				x.click();
     		}
        	 
          }

}
