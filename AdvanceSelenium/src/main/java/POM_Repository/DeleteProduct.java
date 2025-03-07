package POM_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProduct {
public DeleteProduct(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@value='Delete']")
private WebElement deleteProduct;

public WebElement getDeleteProduct() {
	return deleteProduct;
}

public void clickCheckBox(WebDriver driver,String name)
{
	driver.findElement(By.xpath("//table[@class='lvt small']//a[text()='" + name + "']/../preceding-sibling::td//input[@type='checkbox']")).click();
}
public void clickDelete()
{
	deleteProduct.click();
}
}
