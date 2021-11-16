package pagesFolder;

import org.openqa.selenium.By;
import testHooks.WebBrowser;

public class GenericFunctions extends WebBrowser{

	public void LaunchUrl(String url)
	{
		WebBrowser.driver.get(url);
		System.out.println("LaunchUrl: Navigated To URL : " + url);
	}

	public void ClickElement(By locator)
	{
		try
		{
			WebBrowser.driver.findElement(locator).click();
			System.out.println("ClickElement: Sucessfully clicked the element.");
		}
		catch (Exception e)
		{
			System.out.println("ClickElement: Failed to click the element. Exception received - " + e.toString());
		}	
		
	}
	
	public void TypeInElement(By locator, String text)
	{
		try
		{
			WebBrowser.driver.findElement(locator).sendKeys(text);
			System.out.println("TypeInElement: Sucessfully entered the text in the element.");
		}
		catch (Exception e)
		{
			System.out.println("TypeInElement: Failed to entered the text in the element. Exception received - " + e.toString());
		}
	}
}
