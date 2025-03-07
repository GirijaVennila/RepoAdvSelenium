package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProKabaddiTeamWonLostTotalPoints {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.prokabaddi.com/standings");
		WebElement WonMatches = driver.findElement(By.xpath("//p[text()='Haryana Steelers']/../../../..//div[@class='table-data matches-won']"));
		System.out.println(WonMatches.getText());
 String lostMatches = driver.findElement(By.xpath("//p[text()='Haryana Steelers']/../../../..//div[@class='table-data matches-lost']/p")).getText();
 System.out.println(lostMatches);
 String TotalPoints = driver.findElement(By.xpath("//p[text()='Haryana Steelers']/../../../..//div[@class='table-data points']")).getText();
 System.out.println(TotalPoints);
 String Form = driver.findElement(By.xpath("//p[text()='Haryana Steelers']/../../../..//div[@class='table-data form']")).getText();
 System.out.println(Form);
	}

}
/*o/p
16
6
84
W
W
W
L
L
*/
