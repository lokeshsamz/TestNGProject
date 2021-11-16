package objectRepo;

import org.openqa.selenium.By;

public interface ElementsRepository {

	// Login Page
	public static By txtBx_LoginPage_EmailAddress = By.id("inputEmail");
	public static By txtBx_LoginPage_Password = By.id("inputPassword");
	public static By chkBx_LoginPage_recaptcha = By.id("recaptcha-anchor");
	public static By btn_LoginPage_Login = By.id("login");
}
