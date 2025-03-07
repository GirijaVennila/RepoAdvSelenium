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

public class CreateCampaign {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
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
//				
//				//Normal Approach
////				driver.findElement(By.xpath("//input[@type='text']")).sendKeys(USERNAME);
////				driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PASSWORD);
////				driver.findElement(By.xpath("//input[@value='Login' and @type='submit']")).click();
//				
//				//using Getter methods
////				LoginPage login = new LoginPage(driver);
////				login.getUserTextField().sendKeys(USERNAME);
////				login.getPasswordTextField().sendKeys(PASSWORD);
////				login.getLoginButton().click();
//
//				//using business logics
//				LoginPage login = new LoginPage(driver);
//				login.LoginApp(USERNAME, PASSWORD);
//				
//				//WebElement moreLink = driver.findElement(By.linkText("More"));
//
//				// mousehoverAction
//				//Actions action = new Actions(driver);
//				//action.moveToElement(moreLink).perform();
//
//				//driver.findElement(By.linkText("Campaigns")).click();
//				
//				HomePage home = new HomePage(driver);
//				home.clickCampaignLink();
//				
//				//driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
//				CreateCampLookUpImg plus = new CreateCampLookUpImg(driver);
//				plus.clickCampLookUpImg();
//				// -----------------------------------------------------------------------------------------------------
//				// Random approach
//			    //Random ran = new Random();
//				//int ranNum = ran.nextInt(1000);
//				Java_Utility jlib = new Java_Utility();
//				int ranNum = jlib.getRandomValue();
//				
////				// step1:-connecting the excel file
////				FileInputStream file = new FileInputStream("./src/test/resources/CampaignData.xlsx");
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
////				String campaignName = cell.getStringCellValue()+ranNum; // here we add ranNum to avoid duplicate values using random
////																	// class
////				System.out.println(campaignName);
//
//				Excel_Utility elib = new Excel_Utility();
//				String campaignName = elib.getExcelData("Campaign", 0, 0)+ranNum;
//				
////				driver.findElement(By.name("campaignname")).sendKeys(campaignName);
//		//
////				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//				
//				CampaignPage campaign = new CampaignPage(driver);
//				campaign.enterCampName(campaignName);
//				campaign.clickSaveButton();
//
////				String actualData = driver.findElement(By.id("dtlview_Campaign Name")).getText();
//		//
////				if (actualData.contains(campaignName)) {
////					System.out.println("Campaign is created");
////				} else {
////					System.out.println("Campaign is not created");
////				}
//				
//				CampValidatePage validate = new CampValidatePage(driver);
//				validate.validateCamp(driver, campaignName);
//				
////				driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
////				driver.findElement(By.linkText("Sign Out")).click();
//				home.logOut();

			}

		}
		//o/p:jay
//		    Campaign is created

	


