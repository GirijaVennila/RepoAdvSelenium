package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Repository.PomFK;

public class FlipkartexForFindbysFindall {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		PomFK fk = new PomFK(driver);
		fk.enterValue("puma");
		
	}

}
