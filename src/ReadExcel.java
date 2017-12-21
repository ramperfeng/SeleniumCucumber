import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		/*FileInputStream f=new FileInputStream("D:\\selenium_november\\BASIC_SELENIUM\\Read_Excel.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(f);
		XSSFSheet s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(0);
		XSSFCell c=r.getCell(0);
		
		System.out.println(c.getStringCellValue());
		*/
		FileInputStream f=new FileInputStream("D:\\selenium_november\\BASIC_SELENIUM\\test.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(f);
		XSSFSheet s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(2);
		f.close();
		FileOutputStream fos=new FileOutputStream("D:\\selenium_november\\BASIC_SELENIUM\\test.xlsx");
		r.createCell(5).setCellValue("m r reddy ");
		w.write(fos);
		fos.close();
		

	}

}
