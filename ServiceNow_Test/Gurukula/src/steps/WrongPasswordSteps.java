package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import object.Repository.PasswordRepo;
import runner.Runner;

public class WrongPasswordSteps {
	WebDriver driver = Runner.driver;

	@Then("^new password should not be created$")
	public void new_password_should_not_be_created() throws InterruptedException {
		String error = driver.findElement(PasswordRepo.errorMessage).getText();
		Assert.assertEquals("The password and its confirmation do not match!", error);
		UserLogoutSteps.i_click_on_Logout();
	}
}
