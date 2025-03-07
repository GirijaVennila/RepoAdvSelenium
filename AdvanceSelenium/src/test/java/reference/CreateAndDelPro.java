package reference;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.WebDriver_Utility;
import POM_Repository.DeleteProduct;
import POM_Repository.HomePage;
import POM_Repository.LoginPage;
import POM_Repository.ProductLookUpImg;
import POM_Repository.ProductPage;
import POM_Repository.ProductValidatePage;

public class CreateAndDelPro {

	public static void main(String[] args) throws Throwable {
		// fetch from property file
				/*FileInputStream fis = new FileInputStream("./src/test/resources/vTigerCommonDarta.properties");

				Properties prop = new Properties();

				prop.load(fis);
				String BROWSER = prop.getProperty("browser");
				String URL = prop.getProperty("url");
				String USERNAME = prop.getProperty("username");
				String PASSWORD = prop.getProperty("password");*/
				
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
//				// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////				driver.findElement(By.linkText("Products")).click();
////				driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
//				HomePage home = new HomePage(driver);
//				home.clickProductLink();
//				
//				ProductLookUpImg productImg = new ProductLookUpImg(driver);
//				productImg.clickProductLookUpImg();
//
////				// random
////				Random ran = new Random();
////				int ranNum = ran.nextInt(1000);
//				
//				Java_Utility jlib = new Java_Utility();
//				int ranNum = jlib.getRandomValue();
//
////				// step1:-connecting the excel file
////			FileInputStream file = new FileInputStream("./src/test/resources/ProductData.xlsx");
//		//
////				// step2:-keep excel in read mode
////				Workbook workbook = WorkbookFactory.create(file);
//		//
////				// step3:-navigate to excel sheet
////				Sheet sheet = workbook.getSheet("Sheet1");
//		//
////				// step4:-navigate to row
////				Row row = sheet.getRow(0);
//		//
////				// step5:-navigate to column
////				Cell cell = row.getCell(0);
//		//
////				// step6:-read the cell value
////				String productName = cell.getStringCellValue() + ranNum; // here we add ranNum to avoid duplicate values using
////																			// random
////				// class
////				System.out.println(productName);
//				
//				Excel_Utility elib = new Excel_Utility();
//				String productName = elib.getExcelData("Product", 0, 0)+ranNum;
//
////				driver.findElement(By.name("productname")).sendKeys(productName);
//		//
////				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//
//				ProductPage product = new ProductPage(driver);
//				product.enterPrdName(productName);
//				product.clickSaveButton();
//				
//				// verify
////				String actualData = driver.findElement(By.id("dtlview_Product Name")).getText();
////				if (actualData.contains(productName)) {
////					System.out.println("Product is created");
////				} else {
////					System.out.println("Product is created");
////				}
//				ProductValidatePage validatePro = new ProductValidatePage(driver);
//				validatePro.validateProduct(driver, productName);
//
//				// -------------------------------------------------------------------------------------------------------------------
//				// click on product link
//				//driver.findElement(By.linkText("Products")).click();
//				
//				home.clickProductLink();
//
//				// driver.findElement(By.xpath("//table[@class='lvt small']//a[text()='Product
//				// Name']/../preceding-sibling::td//input[@type='checkbox']")).click();
//			//	driver.findElement(By.xpath("//table[@class='lvt small']//a[text()='" + productName + "']/../preceding-sibling::td//input[@type='checkbox']")).click();
//				
//				DeleteProduct deleteProduct = new DeleteProduct(driver);
//				deleteProduct.clickCheckBox(driver, productName);
//				
//			//	driver.findElement(By.xpath("//input[@value='Delete']")).click();
//				deleteProduct.clickDelete();
////				// to handle alert popup
////				driver.switchTo().alert().accept();
//				
//				wlib.alertAccept(driver);
//
//				/*
//				 * WebElement data = driver.findElement(By.
//				 * xpath("//table[@class='lvt small']/tbody/tr//a[text()='"+productName+"']"));
//				 * if(data.equals(productName)) { System.out.println("product is present");
//				 * }else { System.out.println("product is not present"); }
//				 */
//
//				// use another method
////				List<WebElement> prdList = driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr//td[3])[position()>1]"));
////		         
////				boolean flag=false;
////				for (WebElement prd : prdList) {
////					String actData = prd.getText();
////					if (actData.equals(productName)) {
////						flag=true;
////						break;
////						}}if(flag)
////						{
////						System.out.println("product name is  deleted");
////					} else {
////						System.out.println("product name is not deleted");
////					}
//				validatePro.productComparison(driver, productName);
//						
////				driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click(); 
////			 driver.findElement(By.linkText("Sign Out")).click();
//				
//				home.logOut();
//				 
//				 wlib.alertAccept(driver);
//
	}
}
