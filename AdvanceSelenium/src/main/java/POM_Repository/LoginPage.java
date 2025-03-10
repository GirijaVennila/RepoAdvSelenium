package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(name="user_name")
	private WebElement UserTextField;
	
	//@FindBy(xpath="//input[@type='password']")--this xpath also we can use 
	@FindBy(name="user_password")
	private WebElement PasswordTextField;
	
	@FindBy(id="submitButton")
	private WebElement LoginButton;

	public WebElement getUserTextField() {
		return UserTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	//businessLibraries or businessLogics--> used to optimize
	public void LoginApp(String username,String password) {
		/**
		 * 
		 * This method is used to login the application
		 * @parameter username
		 * @parameter password
		 */
		UserTextField.sendKeys(username);
		PasswordTextField.sendKeys(password);
		LoginButton.click();
	}
	
}
