package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationLookUpImg {

	public OrganisationLookUpImg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement orgImg;
	
	public WebElement getOrgImg() {
		return orgImg;
	}
	public void clickOrgImg()
	{
		orgImg.click();
	}
}
