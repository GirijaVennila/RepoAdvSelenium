package Generic_Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WebDriver_Utility {
	/**
	 * This method is used to maximize the window
	 * @param driver
	 */
	public  void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * This method is used to wait for all the elements to get loaded
	 * @param driver
	 */
	public void loadTheElements(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	/**
	 * this method is used to switch one window to another window
	 * @param driver
	 * @param partialTitle
	 */
	public void windowSwitching(WebDriver driver,String partialTitle) {
		//switch to window
				Set<String> allWins = driver.getWindowHandles();
				
				Iterator<String> it = allWins.iterator();
				
				while (it.hasNext()) {
					String win= it.next();
					driver.switchTo().window(win);
					String title = driver.getTitle();
					
					if(title.contains(partialTitle))
					{
						break;
					}
					}
	}
	public void alertAccept(WebDriver driver) {
		// to handle alert popup
				driver.switchTo().alert().accept();
	}
	public static String takesScreenShotEx(WebDriver driver,String screenShotName) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot)BaseClass.sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/"+screenShotName+".png");
		FileUtils.copyFile(src, dest);
		
		return dest.getAbsolutePath();
		
	}

	
	
	
	
	
	
	
}
