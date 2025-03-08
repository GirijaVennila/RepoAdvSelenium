package organisation;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
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
import POM_Repository.OrgValidatePage;
import POM_Repository.OrganisationLookUpImg;
import POM_Repository.OrganizationPage;


// i'm eng2
//@Listeners(Generic_Utility.ListenersImp.class)
//@Listeners(Generic_Utility.ExtentReport.class)
public class CreateCampaignTest extends BaseClass {

	//@Test(groups="smokeTest")
	@Test(retryAnalyzer =Generic_Utility.RetryAnalyserImp.class )
	public void CreateCampaignTest() throws Throwable {
		
		HomePage home = new HomePage(driver);
		home.clickCampaignLink();
		
		CreateCampLookUpImg plus = new CreateCampLookUpImg(driver);
		plus.clickCampLookUpImg();
		// -----------------------------------------------------------------------------------------------------
		// Random approach
	    
		int ranNum = jlib.getRandomValue();	

		String campaignName = elib.getExcelData("Campaign", 0, 0)+ranNum;
		
		CampaignPage campaign = new CampaignPage(driver);
		campaign.enterCampName(campaignName);
		campaign.clickSaveButton();
		
	//	Assert.fail("i'm failing the TestScript");

		CampValidatePage validate = new CampValidatePage(driver);
		//validate.validateCamp(driver, campaignName);
		String actualData = validate.validateCamp(driver);
		Assert.assertEquals(actualData, campaignName);
		System.out.println("Campaign is Created");
		
//		home.logOut();

	}
//	//-----------include some other methods for regionalRegressionTesting-------------------------------
//	@Test(groups="regressionTest")
//	public void CreateOrganizationTest() throws Throwable {
//
//	// click on organisation
//
//		HomePage home = new HomePage(driver);
//		home.clickOrganization();
//
//		// click create organisation
//
//		OrganisationLookUpImg organisationImg = new OrganisationLookUpImg(driver);
//		organisationImg.clickOrgImg();
//
//		// -----------------------------------------------------------------------------------------------------------
//// Random approach
//
//		int ranNum = jlib.getRandomValue();
//
//		String orgName = elib.getExcelData("Sheet1", 0, 0) + ranNum;
//
//		System.out.println(orgName);
//		// organizationname
//		// driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgName);
//		OrganizationPage org = new OrganizationPage(driver);
//		org.enterOrgTF(orgName);
//
//		// phoneno--------------------------------------------------------------------------------------
//
//		String phNo = elib.readDataUsingDataFormatter("Sheet1", 1, 0);
//
//		org.enterPhoneTF(phNo);
//
//		// mailId--------------------------------------------------------------------------
//
//		String mailId = elib.getExcelData("Sheet1", 2, 0);
//
//		org.enterMailTF(mailId);
//
//		org.clickSaveOrg();
//
//		OrgValidatePage validateOrg = new OrgValidatePage(driver);
//		validateOrg.validateOrg(driver, orgName);
//	}
//	//-------------------------------------------------------------------------------------------------------------------------------------------------
//	@Test
//	public void m3()
//	{
//		System.out.println("i'm method 3");
//	}

}
//o/p:jay
//    Campaign is created
