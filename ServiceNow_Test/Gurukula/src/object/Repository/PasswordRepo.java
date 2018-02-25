package object.Repository;

import org.openqa.selenium.By;

public class PasswordRepo {
	
	//Change Password Elements
	public static By password = By.xpath(".//*[contains(@class,'glyphicon glyphicon-lock')]");
	public static By newPassword_TextFeild = By.name("password");
	public static By confirmPassword_TextFeild = By.name("confirmPassword");
	public static By save_Button = By.xpath(".//*[contains(@class,'btn btn-primary ng-scope')]");
	public static By errorMessage = By.xpath(".//*[@class='alert alert-danger ng-scope']");
}
