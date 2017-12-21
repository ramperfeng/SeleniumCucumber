import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Writeexcel2 {

	//public static void main(String[] args) throws IOException {
		@Test
		public void Excel_write() throws Exception
		{
		FileInputStream f=new FileInputStream("D:/selenium_november/BASIC_SELENIUM/Attributes.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(f);
		XSSFSheet s=w.getSheet("Sheet2");
		XSSFRow r=s.getRow(2);
		
		FileOutputStream fos=new FileOutputStream("D:/selenium_november/BASIC_SELENIUM/Attributes.xlsx");
		r.createCell(8).setCellValue("selenium Welcome to apache poi");
		w.write(fos);
		f.close();
		

	}

}
