package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PomFK {
	public PomFK(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(name="q"),@FindBy(css="[title=\"Search for Products, Brands and More\"]")})
	private WebElement searchBar;

    @FindBys({@FindBy(css="[type='submit']"),@FindBy(xpath="//button[@aria-label='Search for Products, Brands and More']")})
	private WebElement searchIcon;

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getSearchIcon() {
		return searchIcon;
	}
	public void enterValue(String name)
	{
		searchBar.sendKeys(name);
		searchIcon.click();
	}
}
