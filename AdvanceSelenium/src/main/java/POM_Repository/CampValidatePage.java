package POM_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CampValidatePage {

	public CampValidatePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateCamp(WebDriver driver) {
	String actualData = driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();

//	if (actualData.contains(campName)) {
//		System.out.println("Campaign is created");
//	} else {
//		System.out.println("Campaign is not created");
//	}
	return actualData;
}
}
