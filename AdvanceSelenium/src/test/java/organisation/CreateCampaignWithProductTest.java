package organisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
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
//@Listeners(Generic_Utility.ListenersImp.class)
public class CreateCampaignWithProductTest extends BaseClass {

 @Test(groups= {"smokeTest","regressionTest"})
	public void CreateCampaignWithProductTest() throws Throwable {

		// fetch from property file FileInputStream fis = new
//		File_Utility flib = new File_Utility();
//	WebDriver_Utility wlib = new WebDriver_Utility();
		
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
//
//		WebDriver_Utility wlib = new WebDriver_Utility();
//		wlib.maximizeWindow(driver);
//		wlib.loadTheElements(driver);
//
//		driver.get(URL);
//
//		// using business logics
//		LoginPage login = new LoginPage(driver);
//		login.LoginApp(USERNAME, PASSWORD);

		// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		HomePage home = new HomePage(driver);
		home.clickProductLink();

		ProductLookUpImg proPlus = new ProductLookUpImg(driver);
		proPlus.clickProductLookUpImg();
		
		// Random approach
        Java_Utility jlib = new Java_Utility();
		int ranNum = jlib.getRandomValue();

		Excel_Utility elib = new Excel_Utility();
		String productName = elib.getExcelData("Product", 0, 0) + ranNum;

		ProductPage product = new ProductPage(driver);
		product.enterPrdName(productName);
		product.clickSaveButton();
		// ----------------------------------------------------------------------------------------------------------------------------------------------------------------

		home.clickCampaignLink();

		CreateCampLookUpImg campPlus = new CreateCampLookUpImg(driver);
		campPlus.clickCampLookUpImg();
		// -----------------------------------------------------------------------------------------------------

		Excel_Utility elib1 = new Excel_Utility();
		String campaignName = elib.getExcelData("Campaign", 0, 0);

		CampaignPage campaign = new CampaignPage(driver);
		campaign.enterCampName(campaignName);
		campaign.clickSelectProduct();

		Thread.sleep(1000);

		wlib.windowSwitching(driver, "Products&action");
	
		WindowSwitchingPage window = new WindowSwitchingPage(driver);
		window.enterSearchTF(productName);
		window.clickSearchButton();
		
		Thread.sleep(2000); 
		
		window.clickProduct(driver, productName);
		

		wlib.windowSwitching(driver, "Campaigns&action");


		campaign.clickSaveButton();
		CampValidatePage campValidate = new CampValidatePage(driver);
	//	campValidate.validateCamp(driver, campaignName);
		String actualData = campValidate.validateCamp(driver);
		Assert.assertEquals(actualData, campaignName);
		System.out.println("Campaign is Created");

//		home.logOut();

	}

}
//always use dynamic xpath in methods