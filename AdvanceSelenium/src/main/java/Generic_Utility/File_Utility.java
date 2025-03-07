package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class File_Utility {
	/**
	 * This method is used to read the data from properties file
	 * 
	 * @author girija
	 * @throws Throwable
	 */
	public String getCommonData(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/vTigerCommonDarta.properties");
		
        //step2; load all the keys from properties file
		Properties prop = new Properties();
        prop.load(fis);
        
		// get keys from properties file
		String value = prop.getProperty(key);
		return value;
	}
}
