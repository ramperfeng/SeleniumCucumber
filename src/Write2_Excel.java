import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Write2_Excel {
	
	@Test
	public void write() throws Exception
	{
		FileInputStream f= new FileInputStream("D:\\selenium_november\\BASIC_SELENIUM\\Write2.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(f);
		XSSFSheet sh= w.getSheet("Sheet1");
		XSSFRow r= sh.getRow(2);
		FileOutputStream fis= new FileOutputStream("D:\\selenium_november\\BASIC_SELENIUM\\Write2.xlsx");
		r.createCell(5).setCellValue("chennai");
		w.write(fis);
		f.close();

		
		//Write test case pass or fail based on status 
		
		
/*		
		@AfterMethod
		public void writeResult(ITestResult result)
		{
		    try
		    {
		        if(result.getStatus() == ITestResult.SUCCESS)
		        {

		            //Do your excel writing stuff here
		        }
		        else if(result.getStatus() == ITestResult.FAILURE)
		        {
		            takeScreenshot(dateTimeStamp,driver,methodName);
		            System.out.println("Log Message:: @AfterMethod: Method-"+methodName+"- has Failed");
		            //Do your excel writing stuff here

		        }
		        else if(result.getStatus() == ITestResult.SKIP)
		        {
		            System.out.println("Log Message::@AfterMethod: Method-"+methodName+"- has Skipped");

		        }
		    }
		    catch(Exception e)
		    {
		        System.out.println("\nLog Message::@AfterMethod: Exception caught");
		        e.printStackTrace();
		    }

		}*/
	}
	
}
