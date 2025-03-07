package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InsertDataIntoProperties {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/propertyData.properties");
		Properties prop=new Properties();
		prop.setProperty("browser", "chrome");
		prop.setProperty("url", "https://www.flipkart.com/");
		
		
		//inserting data into properties file//write mode(store)
		FileOutputStream fos = new FileOutputStream("./src/test/resources/propertyData.properties");
         prop.store(fos, "commonData");
 //---------------------------------------------------------------------------------------
         //read the data
         prop.load(fis);
         String BROWSER = prop.getProperty("browser");
         String URL = prop.getProperty("url");
         WebDriver driver;
         
         if(BROWSER.equalsIgnoreCase("chrome")) {
        	 driver=new ChromeDriver();
         }else if(BROWSER.equalsIgnoreCase("edge")) {
        	 driver=new EdgeDriver();
         }else {
        	 driver=new ChromeDriver();
         }
         driver.get(URL);
         
	}

}
