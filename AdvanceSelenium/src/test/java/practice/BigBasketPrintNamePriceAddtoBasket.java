package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketPrintNamePriceAddtoBasket {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("(//input[@placeholder='Search for Products...' ])[2]")).sendKeys("apples");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Baby Apple Shimla']")).click();
		String name = driver.findElement(By.xpath("//h1[text()='fresho! Baby Apple Shimla, 1 kg ']")).getText();
		System.out.println(name);

		String price = driver.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-4 fLZywG']"))
				.getText();
		System.out.println(price);

		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='flex flex-col lg:w-60 xl:w-82']//button[text()='Add to basket']"))
				.click();
		driver.findElement(
				By.xpath("(//div[@id='add-button']//button[@color='silverSurfer' and @pattern='filled'])[2]")).click();

	}

}
