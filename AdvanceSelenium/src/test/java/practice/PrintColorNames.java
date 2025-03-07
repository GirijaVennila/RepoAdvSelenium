package practice;

import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintColorNames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone16", Keys.ENTER);
		

   List<WebElement> color = driver.findElements(By.xpath("//span[text()='iPhone 16 128 GB: 5G Mobile Phone with Camera Control, A18 Chip and a Big Boost in Battery Life. Works with AirPods; Teal']/../../../..//div[@class='a-section s-color-swatch-container s-quick-view-text-align-start']//a"));
  for(WebElement c:color) {
	  System.out.println(c.getAttribute("aria-label"));
  }
	}

}
/* O/P
Teal
Black
Pink
Ultramarine
White
*/