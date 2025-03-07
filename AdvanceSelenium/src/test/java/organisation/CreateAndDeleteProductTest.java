package organisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
import POM_Repository.DeleteProduct;
import POM_Repository.HomePage;
import POM_Repository.LoginPage;
import POM_Repository.ProductLookUpImg;
import POM_Repository.ProductPage;
import POM_Repository.ProductValidatePage;
//@Listeners(Generic_Utility.ListenersImp.class)
public class CreateAndDeleteProductTest extends BaseClass {
    
	@Test(groups="smokeTest")
	public void CreateAndDeleteProductTest() throws Throwable {
		// fetch from property file
		
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

//		// random
		
		
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

		// -------------------------------------------------------------------------------------------------------------------
		// click on product link
		
		home.clickProductLink();
		
		DeleteProduct deleteProduct = new DeleteProduct(driver);
		deleteProduct.clickCheckBox(driver, productName);
	
		deleteProduct.clickDelete();
	// to handle alert popup

		
		wlib.alertAccept(driver);

		validatePro.productComparison(driver, productName);
		
//		home.logOut();
		 
	//	 wlib.alertAccept(driver);
		 
	}
	}
//line 143 

/*o/p without using flag book154
	Product is created
	product is deleted
	product is deleted
	product is deleted
	product is deleted
	product is deleted
	product is deleted*/

/* after using flag==>
 * book166
Product is created
product name is  deleted*/
