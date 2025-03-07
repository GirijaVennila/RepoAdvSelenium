package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductLookUpImg {
	public ProductLookUpImg(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement proLookUpImg;
	
	public WebElement getProLookUpImg() {
		return proLookUpImg;
	}
	public void clickProductLookUpImg()
	{
		proLookUpImg.click();
	}

}
