package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="More")
	private WebElement moreLink;
	
	@FindBy(linkText="Campaigns")
	private WebElement campLink;
	
	@FindBy(linkText="Products")
	private WebElement prdLink;
	
	@FindBy(linkText="Organizations")
	private WebElement orgLink;
	
	public WebElement getOrgLink() {
		return orgLink;
	}
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement admLink;
	
	@FindBy(linkText="Sign Out")
	private WebElement signOutLink;

	public WebElement getAdmLink() {
		return admLink;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}

	public WebElement getMoreLink() {
		return moreLink;
	}

	public WebElement getCampLink() {
		return campLink;
	}

	public WebElement getPrdLink() {
		return prdLink;
	}
	//businessLogic
	public void clickCampaignLink()
	{
		moreLink.click();
		campLink.click();
		}
	public void clickProductLink()
	{
		prdLink.click();
	}
	public void logOut() {
		admLink.click();
		signOutLink.click();
	}
	public void clickOrganization()
	{
		orgLink.click();
	}
}