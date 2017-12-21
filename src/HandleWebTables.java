import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleWebTables {


	
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchAPP()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/WebTable.html");
	}

   @Test
   public void handle_Webtable()
   {
	   
	   int actrow=0;
	  String part1="//*[@id='1511962142746-";
	  String part2="-uiGrid-000B-cell']/user-click-select/div[1]/del-click/button";
	  WebElement box = driver.findElement(By.xpath("html/body/section/div[1]/div/div[3]"));
	  List<WebElement> tr=box.findElements(By.tagName("tr"));
	  for ( int i =0; i<tr.size();i++)
		{
			List<WebElement> col=tr.get(i).findElements(By.tagName("td"));
			for (int j=0;j<col.size();j++)
			{
				/*if(col.get(j).getText().equals("ramesh.iyer@gmail.com")){
					actrow=i+1;
					driver.findElement(By.xpath(part1+actrow+part2)).click();	}*/
				
				
			/*	//To calculate no of rows In table.
				int rows_count = rows_table.size();
				//Loop will execute till the last row of table.
				for (int row=0; row<rows_count; row++){ 
				//To locate columns(cells) of that specific row.
				List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td")); 
				//To calculate no of columns (cells). In that specific row.
				int columns_count = Columns_row.size();
				System.out.println("Number of cells In Row "+row+" are "+columns count);
				//Loop will execute till the last cell of that specific row.
				for (int column=0; column<columns_count; column++){ 
				// To retrieve text from that specific cell.
				String celtext = Columns_row.get(column).getText();
				System.out.println("Cell Value of row number "+row+" and column number "+column+" Is "+celtext);
				}
				System.out.println("-------------------------------------------------- ");
				}
				}
				}
				
				*/
				
			
		}
		
	}
	  
   }
}
