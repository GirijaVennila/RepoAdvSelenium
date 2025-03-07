package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureFlipkartIphone {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		
		
		for(WebElement name:names) {
			System.out.println(name.getText());
		}
	}

}
