package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import object.Repository.AuthenticationRepo;
import runner.Runner;
import waits.Waits;

public class UserLogoutSteps {
	public static final WebDriver driver = Runner.driver;
	public static AuthenticationSteps authenticationSteps = new AuthenticationSteps();

	@Then("^I should be able to login sucessfully$")
	public void i_should_be_able_to_login_sucessfully() {
		Waits.implicitWait();
		String success = driver.findElement(AuthenticationRepo.sccuess_Status).getText();
		if (!success.contains("You are logged in as user")) {
			Assert.fail();
		}
	}

	@When("^I click on Logout$")
	public static void i_click_on_Logout() throws InterruptedException {
		driver.findElement(AuthenticationRepo.account).click();
		driver.findElement(AuthenticationRepo.logout).click();

	}

	@Then("^logout should be done sucessfully$")
	public static void logout_should_be_done_sucessfully() {
		Waits.implicitWait();
		WebElement element = driver.findElement(AuthenticationRepo.login_Link);
		if (!element.isDisplayed()) {
			Assert.fail();
		}
	}
}