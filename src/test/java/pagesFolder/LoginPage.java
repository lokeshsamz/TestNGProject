package pagesFolder;

import objectRepo.ElementsRepository;

public class LoginPage extends GenericFunctions{		

	private GenericFunctions genericFunctions;
			
	public LoginPage()
	{
		genericFunctions = new GenericFunctions();
	}
	
	public void EnterEmailAddress(String emailAddress)
	{
		try
		{
			genericFunctions.TypeInElement(ElementsRepository.txtBx_LoginPage_EmailAddress, emailAddress);
			System.out.println("EnterEmailAddress: Sucessfully entered the email address - " + emailAddress);
		}
		catch (Exception e)
		{
			System.out.println("EnterEmailAddress: Failed to entere the email address. Exception received - " + e.toString());
		}	
	}

	public void EnterPassword(String password)
	{
		try
		{
			genericFunctions.TypeInElement(ElementsRepository.txtBx_LoginPage_Password, password);
			System.out.println("EnterPassword: Sucessfully entered the password - " + password);
		}
		catch (Exception e)
		{
			System.out.println("EnterPassword: Failed to enter the password. Exception received - " + e.toString());
		}	

	}

	public void ClickOnRecaptcha()
	{
		try
		{
			genericFunctions.ClickElement(ElementsRepository.chkBx_LoginPage_recaptcha);
			System.out.println("ClickOnRecaptcha: Sucessfully checked in the recaptcha.");
		}
		catch (Exception e)
		{
			System.out.println("ClickOnRecaptcha: Failed to check in the recaptcha. Exception received - " + e.toString());
		}	

	}
	
	public void ClickLoginButton() 
	{
		try
		{
			genericFunctions.ClickElement(ElementsRepository.btn_LoginPage_Login);
			System.out.println("ClickLoginButton: Sucessfully clicked the Login button.");
		}
		catch (Exception e)
		{
			System.out.println("ClickLoginButton: Failed to click the Login button. Exception received - " + e.toString());
		}	

	}
}
