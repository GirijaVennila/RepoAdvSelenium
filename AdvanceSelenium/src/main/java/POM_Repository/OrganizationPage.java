package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class OrganizationPage {
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgTextField;

	@FindBy(id="phone")
	private WebElement phoneTextField;
	
	@FindBy(id="email1")
	private WebElement mailTextField;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveOrg;
	
	public WebElement getPhoneTextField() {
		return phoneTextField;
	}
	public WebElement getMailTextField() {
		return mailTextField;
	}
	public WebElement getSaveOrg() {
		return saveOrg;
	}
	public WebElement getOrgTextField() {
		return orgTextField;
	}
	public void enterOrgTF(String name)
	{
		orgTextField.sendKeys(name);
	}
  public void enterPhoneTF(String name)
  {
	  phoneTextField.sendKeys(name);
  }
  public void enterMailTF(String name) {
	  mailTextField.sendKeys(name);
  }
  public void clickSaveOrg() {
	  saveOrg.click();
  }
}
