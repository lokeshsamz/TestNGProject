package Test;

import org.testng.annotations.Test;
import pagesFolder.GenericFunctions;
import pagesFolder.LoginPage;
import testHooks.WebBrowserHooks;

public class LoginPageTest extends WebBrowserHooks{
	
	@Test
	public void TestingLoginPage() throws InterruptedException
	{
		GenericFunctions genericFunctions = new GenericFunctions();
		LoginPage loginPage = new LoginPage();
		genericFunctions.LaunchUrl("https://phptravels.org/index.php?rp=/login");
		loginPage.EnterEmailAddress("paulwitman@gmail.com");
		loginPage.EnterPassword("demotest123");
		loginPage.ClickOnRecaptcha();
		loginPage.ClickLoginButton();
		Thread.sleep(5000);
	}
}
