package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPhoneNameWithPrice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone16", Keys.ENTER);
String name = driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]//span[text()='iPhone 16 128 GB: 5G Mobile Phone with Camera Control, A18 Chip and a Big Boost in Battery Life. Works with AirPods; Black'])[1]")).getText();
	System.out.println(name);
	String offerPrice = driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]//div[@class=\"a-row a-size-base a-color-base\"]//span[@class=\"a-offscreen\"])[1]")).getText();
	System.out.println(offerPrice);
	String actualPrice = driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]//div[@class=\"a-row a-size-base a-color-base\"]//span[@class=\"a-offscreen\"])[2]")).getText();
	System.out.println(actualPrice);
	
	
	}

}
