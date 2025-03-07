package reference;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.WebDriver_Utility;
import POM_Repository.CampValidatePage;
import POM_Repository.CampaignPage;
import POM_Repository.CreateCampLookUpImg;
import POM_Repository.HomePage;
import POM_Repository.LoginPage;
import POM_Repository.ProductLookUpImg;
import POM_Repository.ProductPage;
import POM_Repository.WindowSwitchingPage;

public class CreateCampWithProd {

	public static void main(String[] args) throws Throwable {
//		/*
//		 * // fetch from property file FileInputStream fis = new
//		 * FileInputStream("./src/test/resources/vTigerCommonDarta.properties");
//		 * 
//		 * Properties prop = new Properties();
//		 * 
//		 * prop.load(fis); String BROWSER = prop.getProperty("browser"); String URL =
//		 * prop.getProperty("url"); String USERNAME = prop.getProperty("username");
//		 * String PASSWORD = prop.getProperty("password");
//		 */
//
//		File_Utility flib = new File_Utility();
//		String BROWSER = flib.getCommonData("browser");
//		String URL = flib.getCommonData("url");
//		String USERNAME = flib.getCommonData("username");
//		String PASSWORD = flib.getCommonData("password");
//
//		WebDriver driver;
//
//		if (BROWSER.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//		} else if (BROWSER.equalsIgnoreCase("edge")) {
//			driver = new EdgeDriver();
//		} else {
//			driver = new ChromeDriver();
//		}
////		driver.manage().window().maximize();
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//
//		WebDriver_Utility wlib = new WebDriver_Utility();
//		wlib.maximizeWindow(driver);
//		wlib.loadTheElements(driver);
//
//		driver.get(URL);
////		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(USERNAME);
////		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PASSWORD);
////		driver.findElement(By.xpath("//input[@value='Login' and @type='submit']")).click();
//
//		// using business logics
//		LoginPage login = new LoginPage(driver);
//		login.LoginApp(USERNAME, PASSWORD);
//
//		// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////		driver.findElement(By.linkText("Products")).click();
//
//		HomePage home = new HomePage(driver);
//		home.clickProductLink();
//
////		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
//
//		ProductLookUpImg proPlus = new ProductLookUpImg(driver);
//		proPlus.clickProductLookUpImg();
//		// Random approach
//		// Random ran = new Random();
//		// int ranNum = ran.nextInt(1000);
//
//		Java_Utility jlib = new Java_Utility();
//		int ranNum = jlib.getRandomValue();
//
////		// step1:-connecting the excel file
////		FileInputStream file = new FileInputStream("./src/test/resources/CampaignData.xlsx");
////
////		// step2:-keep excel in read mode
////		Workbook workbook = WorkbookFactory.create(file);
////
////		// step3:-navigate to excel sheet
////		Sheet sheet = workbook.getSheet("Product");
////
////		// step4:-navigate to row
////		Row row = sheet.getRow(0);
////
////		// step5:-navigate to column
////		Cell cell = row.getCell(0);
////
////		// step6:-read the cell value
////		String productName = cell.getStringCellValue()+ranNum; // here we add ranNum to avoid duplicate values using random
////														// class
////		System.out.println(productName);
//
//		Excel_Utility elib = new Excel_Utility();
//		String productName = elib.getExcelData("Product", 0, 0) + ranNum;
//
////		driver.findElement(By.name("productname")).sendKeys(productName);
////
////		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//
//		ProductPage product = new ProductPage(driver);
//		product.enterPrdName(productName);
//		product.clickSaveButton();
//		// ----------------------------------------------------------------------------------------------------------------------------------------------------------------
////		WebElement moreLink = driver.findElement(By.linkText("More"));
////        // mousehoverAction
////		Actions action = new Actions(driver);
////		action.moveToElement(moreLink).perform();
//
//		// driver.findElement(By.linkText("Campaigns")).click();
//
//		home.clickCampaignLink();
//
//		// driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
//		CreateCampLookUpImg campPlus = new CreateCampLookUpImg(driver);
//		campPlus.clickCampLookUpImg();
//		// -----------------------------------------------------------------------------------------------------
//
////		// step1:-connecting the excel file
////		FileInputStream file1 = new FileInputStream("./src/test/resources/CampaignData.xlsx");
////
////		// step2:-keep excel in read mode
////		Workbook workbook1 = WorkbookFactory.create(file1);
////
////		// step3:-navigate to excel sheet
////		Sheet sheet1 = workbook1.getSheet("Sheet1");
////
////		// step4:-navigate to row
////		Row row1 = sheet1.getRow(0);
////
////		// step5:-navigate to column
////		Cell cell1 = row1.getCell(0);
////
////		// step6:-read the cell value
////		String campaignName = cell1.getStringCellValue(); // here we add ranNum to avoid duplicate values using random
////															// class
////		System.out.println(campaignName);
//
//		Excel_Utility elib1 = new Excel_Utility();
//		String campaignName = elib.getExcelData("Campaign", 0, 0);
//
////		driver.findElement(By.name("campaignname")).sendKeys(campaignName);
////		
////		driver.findElement(By.xpath("//img[@title='Select']")).click();
//		CampaignPage campaign = new CampaignPage(driver);
//		campaign.enterCampName(campaignName);
//		campaign.clickSelectProduct();
//
//		Thread.sleep(1000);
////		//switch to window
////		Set<String> allWins = driver.getWindowHandles();
////		
////		Iterator<String> it = allWins.iterator();
////		
////		while (it.hasNext()) {
////			String win= it.next();
////			driver.switchTo().window(win);
////			String title = driver.getTitle();
////			if(title.contains("Products&action"))
////			{
////				break;
////			}
////		}
//
//		wlib.windowSwitching(driver, "Products&action");
//
////		driver.findElement(By.id("search_txt")).sendKeys(productName);
////		driver.findElement(By.name("search")).click();
//	
//		WindowSwitchingPage window = new WindowSwitchingPage(driver);
//		window.enterSearchTF(productName);
//		window.clickSearchButton();
//		
//		Thread.sleep(2000); // driver.findElement(By.linkText("book")).click(); //or we can use dynamic
//							// string
//		//driver.findElement(By.xpath("//a[text()='" + productName + "']")).click();
//		
//		window.clickProduct(driver, productName);
//		
////		Set<String> allWins1 = driver.getWindowHandles();
////		
////		Iterator<String> it1 = allWins1.iterator();
////		
////		while (it1.hasNext()) {
////			String win1= it1.next();
////			driver.switchTo().window(win1);
////			String title1 = driver.getTitle();
////			if(title1.contains("Campaigns&action"))
////			{
////				break;
////			}
////			}
//
//		wlib.windowSwitching(driver, "Campaigns&action");
//
////		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
////		//verify
////		String actualData = driver.findElement(By.id("dtlview_Campaign Name")).getText();
////		if(actualData.contains(campaignName))
////		{
////			System.out.println("campaign is created");
////		}else {
////			System.out.println("campaign is not created");
////		}
//
//		campaign.clickSaveButton();
//		CampValidatePage campValidate = new CampValidatePage(driver);
//		campValidate.validateCamp(driver, campaignName);
//
////		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
////		driver.findElement(By.linkText("Sign Out")).click();
//
//		home.logOut();

	}

}
//always use dynamic xpath in methods

	


