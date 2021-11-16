package testHooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBrowser {

	public static WebDriver driver = null;

	public static void InitialiseDriver()
	{
		if(driver == null)
		{
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", projectPath + "/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Chrome Browser got initiated");
			//driver.get("https://phptravels.org/index.php?rp=/login");
		}
	}
}
