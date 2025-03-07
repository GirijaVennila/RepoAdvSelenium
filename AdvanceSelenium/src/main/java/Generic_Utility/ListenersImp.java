package Generic_Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class ListenersImp implements ITestListener {
	//Listeners:-Listener is a feature available in TestNG which is used to capture
	//   runtime events during the ececution and perform appropriate action based on event type
	//listeners will trigger only the assertion got failed
	//ITestListener-->this is mandatory

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts = (TakesScreenshot)BaseClass.sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./FailedScripts.png");//file:string pathname
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
//here in takescreenshot we can extend baseclass or we can declare static driver in baseclass
//write sdriver=driver in baseclass after launching browser
//in 12th line ListenersImp(class) implements ITestListener(interface)
//in TestScript add listeners annotation before the class start i.e.,@Listeners(Generic_Utility.ListenersImp.class)