package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FetchDataFromProperties {

	public static void main(String[] args) throws Throwable {
		//step:1-->get path of the properties file
		FileInputStream fis = new FileInputStream("C:\\Users\\vijay\\Downloads\\propertyData.properties");
		
		//step2:
		Properties pro = new Properties();
		
		pro.load(fis);
		String BROWSER = pro.getProperty("browser");
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
		WebDriver driver;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			
			driver=new ChromeDriver();
		}else if(BROWSER.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}else
		{
			driver=new ChromeDriver();
		}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();
		
}

}
