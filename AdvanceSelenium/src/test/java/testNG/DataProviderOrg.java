package testNG;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.WebDriver_Utility;
import POM_Repository.HomePage;
import POM_Repository.LoginPage;
import POM_Repository.OrgValidatePage;
import POM_Repository.OrganisationLookUpImg;
import POM_Repository.OrganizationPage;

public class DataProviderOrg {
	@Test(dataProvider = "readData")
public void createOrganization(String name,String phnNum,String mailId) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	
	driver.findElement(By.linkText("Organizations")).click();
	driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	
	driver.findElement(By.name("accountname")).sendKeys(name);
	driver.findElement(By.name("phone")).sendKeys(phnNum);
	driver.findElement(By.name("email1")).sendKeys(mailId);
	
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	driver.findElement(By.linkText("Sign Out")).click();
	driver.quit();
		

}
	@DataProvider
	public Object[][] readData() throws Throwable
	{
		Random ran = new Random();
		int randum = ran.nextInt(1000);
		
		Object[][] objArr = new Object[3][3];
		
//		objArr[0][0]="AAA"+randum;
//		objArr[0][1]="9876543210";
//		objArr[0][2]="giri@gmail.com";
//		
//		objArr[1][0]="BBB"+randum;
//		objArr[1][1]="1234567890";
//		objArr[1][2]="jay@gmail.com";
//		
//		objArr[2][0]="CCC"+randum;
//		objArr[2][1]="6767676767";
//		objArr[2][2]="nila@gmail.com";
		Excel_Utility elib = new Excel_Utility();
		
		objArr[0][0] = elib.readDataUsingDataFormatter("DataProvider", 0, 0)+randum;
		objArr[0][1] = elib.readDataUsingDataFormatter("DataProvider", 0, 1);
		objArr[0][2]= elib.readDataUsingDataFormatter("DataProvider", 0, 2);
		
		objArr[1][0] = elib.readDataUsingDataFormatter("DataProvider", 1, 0)+randum;
		objArr[1][1] = elib.readDataUsingDataFormatter("DataProvider", 1, 1);
		objArr[1][2]= elib.readDataUsingDataFormatter("DataProvider", 1, 2);
		
		objArr[2][0] = elib.readDataUsingDataFormatter("DataProvider", 2, 0)+randum;
		objArr[2][1] = elib.readDataUsingDataFormatter("DataProvider", 2,1);
		objArr[2][2] = elib.readDataUsingDataFormatter("DataProvider", 2, 2);
		
		return objArr;
		
	}
}
