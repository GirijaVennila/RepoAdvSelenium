package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MicTests {

	
	public static void main(String[] args) {
		
		//to avoid notification popup
		
		ChromeOptions setting=new ChromeOptions();
		setting.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://mictests.com/");
		driver.findElement(By.id("mic-launcher")).click();

	}

}
