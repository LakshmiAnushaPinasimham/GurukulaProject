package object.Repository;

import org.openqa.selenium.By;

public class ForgotPasswordRepo {
	public static By forgotPassword_Link=By.partialLinkText("Did you forget");
	public static By email_TextField=By.name("email");
	public static By resetPassword_Button=By.xpath(".//*[contains(@class,'btn btn-primary ng-scope')]");
	public static By errormsg=By.xpath(".//*[contains(@class,'alert alert-danger ng-scope']");

}
