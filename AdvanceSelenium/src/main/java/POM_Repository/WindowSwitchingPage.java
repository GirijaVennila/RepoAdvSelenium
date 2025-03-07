package POM_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowSwitchingPage {
public WindowSwitchingPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
//product&actions
	@FindBy(id="search_txt")
	private WebElement searchTextField;
	
	@FindBy(name="search")
	private WebElement searchButton;
	
public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void enterSearchTF(String name)
	{
		searchTextField.sendKeys(name);
	}
	public void clickSearchButton()
{
		searchButton.click();
	}
public void clickProduct(WebDriver driver,String name)
{
	driver.findElement(By.xpath("//a[text()='" + name + "']")).click();
}
}
