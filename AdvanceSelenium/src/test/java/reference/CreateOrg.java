package reference;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.WebDriver_Utility;
import POM_Repository.HomePage;
import POM_Repository.LoginPage;
import POM_Repository.OrgValidatePage;
import POM_Repository.OrganisationLookUpImg;
import POM_Repository.OrganizationPage;

public class CreateOrg {

	public static void main(String[] args) throws Throwable {
		// fetch from property file
				/*
				 * FileInputStream fis = new
				 * FileInputStream("./src/test/resources/vTigerCommonDarta.properties");
				 * 
				 * Properties prop = new Properties();
				 * 
				 * prop.load(fis); String BROWSER = prop.getProperty("browser"); String URL =
				 * prop.getProperty("url"); String USERNAME = prop.getProperty("username");
				 * String PASSWORD = prop.getProperty("password");
				 */

				// using fileUtilty class we optimize the line of code
//				File_Utility flib = new File_Utility();
//				String BROWSER = flib.getCommonData("browser");
//				String URL = flib.getCommonData("url");
//				String USERNAME = flib.getCommonData("username");
//				String PASSWORD = flib.getCommonData("password");
//
//				WebDriver driver;
//
//				if (BROWSER.equalsIgnoreCase("chrome")) {
//					driver = new ChromeDriver();
//				} else if (BROWSER.equalsIgnoreCase("edge")) {
//					driver = new EdgeDriver();
//				} else {
//					driver = new ChromeDriver();
//				}
////				driver.manage().window().maximize();
////				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//				
//				WebDriver_Utility wlib = new WebDriver_Utility();
//				wlib.maximizeWindow(driver);
//				wlib.loadTheElements(driver);
//
//				driver.get(URL);
////				driver.findElement(By.xpath("//input[@type='text']")).sendKeys(USERNAME);
////				driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PASSWORD);
////				driver.findElement(By.xpath("//input[@value='Login' and @type='submit']")).click();
//
//				//using business logics
//				LoginPage login = new LoginPage(driver);
//				login.LoginApp(USERNAME, PASSWORD);
//				
//				// click on organisation
//			//	driver.findElement(By.linkText("Organizations")).click();
//				HomePage home = new HomePage(driver);
//				home.clickOrganization();
//
//				// click create organisation
//			//	driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
//				OrganisationLookUpImg organisationImg = new OrganisationLookUpImg(driver);
//				organisationImg.clickOrgImg();
//				
//				// -----------------------------------------------------------------------------------------------------------
//
//				// Random approach
//				// Random ran = new Random();
//				// int ranNum = ran.nextInt(1000);
//
//				Java_Utility jlib = new Java_Utility();
//				int ranNum = jlib.getRandomValue();
//
//				
////				 // step1:-connecting the excel file FileInputStream file = new
////				  FileInputStream("./src/test/resources/VtigerOrganisationData.xlsx");
////				  
////				  // step2:-keep excel in read mode Workbook workbook =
////				  WorkbookFactory.create(file);
////				  
////				  // step3:-navigate to excel sheet Sheet sheet = workbook.getSheet("Sheet1");
////				  
////				 // step4:-navigate to row Row row = sheet.getRow(0);
////				 
////				  // step5:-navigate to column Cell cell = row.getCell(0);
////				  
////				  // step6:-read the cell value String orgName = cell.getStringCellValue() + ranNum; // here we add ranNum to avoid duplicate values using
////				 // random class
//
//				Excel_Utility elib = new Excel_Utility();
//				String orgName = elib.getExcelData("Sheet1", 0, 0) + ranNum;
//
//				System.out.println(orgName);
//				// organizationname
//			//	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgName);
//				OrganizationPage org = new OrganizationPage(driver);
//				org.enterOrgTF(orgName);
//
//				// phoneno--------------------------------------------------------------------------------------
////				// step4:-navigate to row
////				Row 
////				row1 = sheet.getRow(1);
//		//
////				// step5:-navigate to column
////				Cell cell1 = row1.getCell(0);
//		//
////				DataFormatter format = new DataFormatter();
////				String phNo = format.formatCellValue(cell1);
////				System.out.println(phNo);
//
//				Excel_Utility elib1 = new Excel_Utility();
//				String phNo = elib1.readDataUsingDataFormatter("Sheet1", 1, 0);
//
//			//	driver.findElement(By.id("phone")).sendKeys(phNo);
//				org.enterPhoneTF(phNo);
//
//				// mailId--------------------------------------------------------------------------
////				// step4:-navigate to row
////				Row row2 = sheet.getRow(2);
//		//
////				// step5:-navigate to column
////				Cell cell2 = row2.getCell(0);
//		//
////				String mailId = cell2.getStringCellValue();
////				System.out.println(mailId);
//
//				Excel_Utility elib2 = new Excel_Utility();
//				String mailId = elib2.getExcelData("Sheet1", 2, 0);
//
//			//	driver.findElement(By.id("email1")).sendKeys(mailId);
//				org.enterMailTF(mailId);
//
//			//	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//				org.clickSaveOrg();
//
////				String actualData = driver.findElement(By.id("dtlview_Organization Name")).getText();
//		//
////				if (actualData.contains(orgName)) {
////					System.out.println("Organisation is created");
////				} else {
////					System.out.println("Organisation is not created");
////		        }
//
//				OrgValidatePage validateOrg = new OrgValidatePage(driver);
//				validateOrg.validateOrg(driver, orgName);
//				
//				// signout
////				driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
////				driver.findElement(By.linkText("Sign Out")).click();
//				
//				home.logOut();


	}

}
