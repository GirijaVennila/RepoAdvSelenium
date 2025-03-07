package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {

	public CampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="campaignname")
	private WebElement campName;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement selectProduct;

	public WebElement getCampName() {
		return campName;
	}
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getSelectProduct() {
		return selectProduct;
	}

    public void enterCampName(String name)
	{
		campName.sendKeys(name);
	}
	public void clickSelectProduct()
	{
		selectProduct.click();
	}
	public void clickSaveButton()
	{
		saveButton.click();
	}
}
