package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import object.Repository.AuthenticationRepo;
import runner.Runner;
import waits.Waits;

public class AuthenticationSteps {
	WebDriver driver = Runner.driver;

	@When("^I click on Login$")
	public void i_click_on_Login() {
		driver.findElement(AuthenticationRepo.login_Link).click();
	}

	@When("^I enter the login details \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_the_login_details_and(String login, String password) throws InterruptedException {
		Waits.implicitWait();
		driver.findElement(AuthenticationRepo.login_TextField).sendKeys(login);
		driver.findElement(AuthenticationRepo.passwordTextField).sendKeys(password);
		driver.findElement(AuthenticationRepo.authenticate_Button).click();
	}

	@Then("^login should be done sucessfully$")
	public void login_should_be_done_sucessfully() throws InterruptedException {
		Waits.implicitWait();
		String success = driver.findElement(AuthenticationRepo.sccuess_Status).getText();
		if (!success.contains("You are logged in as user")) {
			Assert.fail();
		}

		// Logout of Application
		UserLogoutSteps.i_click_on_Logout();
		UserLogoutSteps.logout_should_be_done_sucessfully();
	}

}