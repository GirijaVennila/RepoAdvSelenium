package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class InsertDataIntoExcelFile {

	public static void main(String[] args) throws Throwable  {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/Excel1.xlsx");
		
		Workbook workbook=WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.createRow(5);
		
		Cell cell = row.createCell(3);
		
		cell.setCellValue("Vijay");
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Excel1.xlsx");
		workbook.write(fos);
		workbook.close();
		
}
	}
