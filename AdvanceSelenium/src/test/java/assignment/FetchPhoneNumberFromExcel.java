package assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchPhoneNumberFromExcel {
	//I'M PULLING 1 
	//I'M PUSHING 1
//i'm pulling 2
	//i'm pushing 2
	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/ExcelPhNo.xlsx");
		
		Workbook workbook=WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.getRow(3);
		
		Cell cell = row.getCell(2);
		
		
  /*double phno = cell.getNumericCellValue();
		System.out.println(phno);
		o/p:9.87654321E9
so we go for dataformatter*/
		DataFormatter format = new DataFormatter();
		String excelData = format.formatCellValue(cell);
		System.out.println(excelData);
		/* o/p;- 9876543210     */
	}

}
