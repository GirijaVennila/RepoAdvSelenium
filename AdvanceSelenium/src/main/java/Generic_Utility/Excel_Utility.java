package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Excel_Utility {
	/**
	 * This method is used to read data from excel file
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return String
	 * @throws Throwable
	 * @author girija
	 */

	
	public String getExcelData(String sheetName ,int rowNum,int cellNum) throws Throwable
	{
		// step1:-connecting the excel file
				FileInputStream file = new FileInputStream("./src/test/resources/VtigerOrganisationData.xlsx");

				// step2:-keep excel in read mode
				Workbook workbook = WorkbookFactory.create(file);

				// step3:-navigate to excel sheet
				Sheet sheet = workbook.getSheet(sheetName);

				// step4:-navigate to row
				Row row = sheet.getRow(rowNum);

				// step5:-navigate to column
				Cell cell = row.getCell(cellNum);
				
				// step6:-read the cell value
				String excelData= cell.getStringCellValue();
				System.out.println(excelData);
				return excelData;
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public String readDataUsingDataFormatter(String sheetName,int rowNum ,int cellNum) throws Throwable {
		
	
	FileInputStream file = new FileInputStream("./src/test/resources/VtigerOrganisationData.xlsx");

	// step2:-keep excel in read mode
	Workbook workbook = WorkbookFactory.create(file);

	// step3:-navigate to excel sheet
	Sheet sheet = workbook.getSheet(sheetName);
	
	// step4:-navigate to row
			Row row1 = sheet.getRow(rowNum);

			// step5:-navigate to column
			Cell cell1 = row1.getCell(cellNum);

			DataFormatter format = new DataFormatter();
			String ExcelData = format.formatCellValue(cell1);
			System.out.println(ExcelData);
			return ExcelData;

			}
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public Object[][] readExcelDataForDataProvider(String sheetName) throws Throwable 
	{
		FileInputStream file = new FileInputStream("./src/test/resources/VtigerOrganisationData.xlsx");

		// step2:-keep excel in read mode
		Workbook workbook = WorkbookFactory.create(file);

		// step3:-navigate to excel sheet
		Sheet sheet = workbook.getSheet(sheetName);
		
		int lastRow = sheet.getLastRowNum()+1;
		short lastCell = sheet.getRow(0).getLastCellNum();
		
	Object[][] objArr = new Object[lastRow][lastCell];
	for (int i = 0; i <lastRow ; i++) {
		for (int j = 0; j < lastCell; j++) {
			objArr[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		
		return objArr;
		}
}
