package POM_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OrgValidatePage {

	public OrgValidatePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String validateOrg(WebDriver driver)
	{
		String actualData = driver.findElement(By.id("dtlview_Organization Name")).getText();

//		if (actualData.contains(name)) {
//			System.out.println("Organisation is created");
//		} else {
//			System.out.println("Organisation is not created");
//        }

		return actualData;
	}
}
