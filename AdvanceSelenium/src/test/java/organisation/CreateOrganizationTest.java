package organisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
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
import POM_Repository.OrgValidatePage;
import POM_Repository.OrganisationLookUpImg;
import POM_Repository.OrganizationPage;
//@Listeners(Generic_Utility.ListenersImp.class)
public class CreateOrganizationTest extends BaseClass {
	@Test(groups="regressionTest")
	public void CreateOrganizationTest() throws Throwable {

	// click on organisation

		HomePage home = new HomePage(driver);
		home.clickOrganization();

		// click create organisation

		OrganisationLookUpImg organisationImg = new OrganisationLookUpImg(driver);
		organisationImg.clickOrgImg();

		// -----------------------------------------------------------------------------------------------------------
// Random approach

		int ranNum = jlib.getRandomValue();

		String orgName = elib.getExcelData("Sheet1", 0, 0) + ranNum;

		System.out.println(orgName);
		// organizationname
		// driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgName);
		OrganizationPage org = new OrganizationPage(driver);
		org.enterOrgTF(orgName);

		// phoneno--------------------------------------------------------------------------------------

		String phNo = elib.readDataUsingDataFormatter("Sheet1", 1, 0);

		org.enterPhoneTF(phNo);

		// mailId--------------------------------------------------------------------------

		String mailId = elib.getExcelData("Sheet1", 2, 0);

		org.enterMailTF(mailId);

		org.clickSaveOrg();
		
	//	Assert.fail("i'm failing the TestScript");
		
		OrgValidatePage validateOrg = new OrgValidatePage(driver);
	//	validateOrg.validateOrg(driver, orgName);

		String actData = validateOrg.validateOrg(driver);
		Assert.assertEquals(actData, orgName);
		System.out.println("Organisation is Created");
		
		// signout

//		home.logOut();

	}

}
