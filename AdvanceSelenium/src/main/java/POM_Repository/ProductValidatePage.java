package POM_Repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProductValidatePage {
	public ProductValidatePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String validateProduct(WebDriver driver)
	{
		String actualData = driver.findElement(By.id("dtlview_Product Name")).getText();
//		if (actualData.contains(prdName)) {
//			System.out.println("Product is created");
//		} else {
//			System.out.println("Product is not created");
//		}
		return actualData;
	}
	public void productComparison(WebDriver driver,String name) {
		List<WebElement> prdList = driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr//td[3])[position()>1]"));
        
		boolean flag=false;
		for (WebElement prd : prdList) {
			String actData = prd.getText();
			if (actData.equals(name)) {
				flag=true;
				break;
				}}if(flag)
				{
				System.out.println("product name is  deleted");
			} else {
				System.out.println("product name is not deleted");
			}
	}

}
