package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromDataFormatter {

	public static void main(String[] args) throws Throwable {
		
		//step1:-connecting the excel file
				FileInputStream fis = new FileInputStream("./src/test/resources/Excel.xlsx");
				
				//step2:-keep excel in read mode
				Workbook workbook=WorkbookFactory.create(fis);
				
				//step3:-navigate to excel sheet
				Sheet sheet = workbook.getSheet("Sheet1");
				
				//step4:-navigate to row
				Row row = sheet.getRow(2);
				
				//step5:-navigate to column
				Cell cell = row.getCell(0);
				
				DataFormatter format = new DataFormatter();
				String excelData = format.formatCellValue(cell);
				System.out.println(excelData);
				
	}

}
