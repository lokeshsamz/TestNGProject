package testHooks;

import org.testng.annotations.BeforeClass;

public class WebBrowserHooks extends WebBrowser{
	

	@BeforeClass
	public void BrowserSetup()
	{
		WebBrowser.InitialiseDriver();
	}

}
