import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandleBoostrapDropDown {

	
	
WebDriver driver;
	
	@Test
	public void handleboostrapdropdown()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		List<WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		//System.out.println(list.size());
		
	      boolean  b2=false;
		for(int i=0;i<list.size();i++)
		{
			
			boolean c=list.get(i).isSelected();
			System.out.println("By Default selected or not"+c);
			
			
			boolean b=list.get(i).isSelected();
			System.out.println(b);
			System.out.println(list.get(i).getText());
			if(list.get(i).isSelected()==false)
			{
				list.get(i).click();
				b2=false;
				break;
			}
			
			b2=true;
			
			list.get(i).click();
				
			/*boolean b=list.get(i).isSelected();
			System.out.println(b);
			if(b==true)
			{
				list.get(i).click();
				break;
			}*/
			 
				
				
				 	 
				
			
		}
		
		
		
		
		
		
		/*for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Angular"))
			{
				list.get(i).click();
				break;
				 	 
				
			}
		}
		*/
		
	}
	
	//@Test
	public void handleradiobutton() throws InterruptedException
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://newtours.demoaut.com");
	    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
	    driver.findElement(By.xpath("//input[@name='login']")).click();
	   // boolean b=driver.findElement(By.xpath("//input[@type='radio' and @name='tripType']")).isSelected();
	    List<WebElement> list=driver.findElements(By.xpath("//input[@type='radio' and @name='tripType']"));
	    System.out.println(list.size());
	    
	    
	    for(int i=0;i<list.size();i++)
	    {
	    
	    	//System.out.println(list.get(i).getAttribute());
	    	if(list.get(i).isSelected()==true)
	    	{
	    		list.get(i+1).click();
	    		break;
	    	}
	    	
	    }
	    
	    
	    Thread.sleep(5000);
	    driver.close();
	}
	
	
}
