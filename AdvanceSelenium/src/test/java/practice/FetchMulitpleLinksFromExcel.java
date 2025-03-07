package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMulitpleLinksFromExcel {

	public static void main(String[] args) throws Throwable {
FileInputStream fis = new FileInputStream("./src/test/resources/links.xlsx");
		
		Workbook workbook=WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		int rowNum = sheet.getLastRowNum();
		for (int i = 0; i < rowNum; i++) {
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			String links = cell.getStringCellValue();
			System.out.println(links);
		}

	}

}
