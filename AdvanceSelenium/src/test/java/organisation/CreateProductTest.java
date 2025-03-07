package organisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.WebDriver_Utility;
import POM_Repository.HomePage;
import POM_Repository.LoginPage;
import POM_Repository.ProductLookUpImg;
import POM_Repository.ProductPage;
import POM_Repository.ProductValidatePage;
//@Listeners(Generic_Utility.ListenersImp.class)
public class CreateProductTest extends BaseClass{

	@Test(groups="regressionTest")
	public void CreateProductTest() throws Throwable {
		// fetch from property file
		
//		File_Utility flib = new File_Utility();
//		WebDriver_Utility wlib = new WebDriver_Utility();
//		Java_Utility jlib = new Java_Utility();
//		Excel_Utility elib = new Excel_Utility();
		
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
//
//		//using business logics
//		LoginPage login = new LoginPage(driver);
//		login.LoginApp(USERNAME, PASSWORD);
		
		// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		HomePage home = new HomePage(driver);
		home.clickProductLink();
		
		ProductLookUpImg productImg = new ProductLookUpImg(driver);
		productImg.clickProductLookUpImg();
		
		// Random approach
		int ranNum = jlib.getRandomValue();

		String productName = elib.getExcelData("Product", 0, 0)+ranNum;
	
		ProductPage product = new ProductPage(driver);
		product.enterPrdName(productName);
		product.clickSaveButton();
		
		ProductValidatePage validatePro = new ProductValidatePage(driver);
	//	validatePro.validateProduct(driver, productName);
		
		String actualData = validatePro.validateProduct(driver);
		Assert.assertEquals(actualData, productName);
		System.out.println("Product is Created");
		
//		home.logOut();

	}
//----------------------------------------------------------------------------------------------------------------------------------
	//for multipletestscript testing for parallel execution
}
