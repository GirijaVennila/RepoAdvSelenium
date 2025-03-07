package scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrowserNativePopUp {
	@Test
	public void notificationPopup()
	{
		ChromeOptions setting=new ChromeOptions();
		setting.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(setting);
		driver.manage().window().maximize();
		
		driver.get("https://in.puma.com/in/en");
	}
	

}
//BrowserNativePopUp (or) Notification PopUp both are same