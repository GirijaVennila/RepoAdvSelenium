package Generic_Utility;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import POM_Repository.HomePage;
import POM_Repository.LoginPage;

public class BaseClass {

	public WebDriver driver; // globally declared
	public static WebDriver sdriver;//static driver for takescreenshot in listeners
	public File_Utility flib = new File_Utility();
	public WebDriver_Utility wlib = new WebDriver_Utility();
	public Java_Utility jlib = new Java_Utility();
	public Excel_Utility elib = new Excel_Utility();

	@BeforeSuite(groups = { "smokeTest", "regressionTest" })
	public void BS() {
		System.out.println("DataBase Connection");
	}

	@BeforeTest(groups = { "smokeTest", "regressionTest" })
	public void BT() {
		System.out.println("Parallel Execution");
	}

	//@Parameters("BROWSER")
	@BeforeClass(groups = { "smokeTest", "regressionTest" })
	//public void BC(String BROWSER) throws Throwable {
	public void BC() throws Throwable {

	//	String BROWSER = flib.getCommonData("browser");
		String BROWSER = System.getProperty("browser");

		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}

		System.out.println("Launching Browser");
		sdriver=driver;//static driver
	}

	@BeforeMethod(groups = { "smokeTest", "regressionTest" })
	public void BM() throws Throwable {
		wlib.maximizeWindow(driver);
		wlib.loadTheElements(driver);

//		String URL = flib.getCommonData("url");
//		String USERNAME = flib.getCommonData("username");
//		String PASSWORD = flib.getCommonData("password");
		//FOR USING CMD PROMPT
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		driver.get(URL);

		LoginPage login = new LoginPage(driver);
		login.LoginApp(USERNAME, PASSWORD);
		System.out.println("Login to App");
	}

	@AfterMethod(groups = { "smokeTest", "regressionTest" })
	public void AM() {
		HomePage home = new HomePage(driver);
		home.logOut();
		System.out.println("Logout from App");
	}

	@AfterClass(groups = { "smokeTest", "regressionTest" })
	public void AC() {

		System.out.println("Close the Browser");
	}

	@AfterTest(groups = { "smokeTest", "regressionTest" })
	public void AT() {
		System.out.println("Parrallel Execution close");
	}

	@AfterSuite(groups = { "smokeTest", "regressionTest" })
	public void AS() {
		System.out.println("DataBase Connection Close");
	}

}
