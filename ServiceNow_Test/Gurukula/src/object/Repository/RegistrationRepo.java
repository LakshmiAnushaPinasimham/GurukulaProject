package object.Repository;

import org.openqa.selenium.By;

public class RegistrationRepo {
	
	//Register Form Elements
	public static By register_Link = By.linkText("Register a new account");
	public static By login_TextField = By.name("login");
	public static By email_TextField = By.name("email");
	public static By newPassword_TextField = By.name("password");
	public static By newPasswordConfirm_TextField = By.name("confirmPassword");
	public static By registerStatus = By.xpath(".//*[contains(@class,'alert alert-danger ng-scope')]");
}