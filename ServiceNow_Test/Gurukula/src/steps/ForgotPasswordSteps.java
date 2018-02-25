package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import object.Repository.AuthenticationRepo;
import object.Repository.ForgotPasswordRepo;
import runner.Runner;

public class ForgotPasswordSteps 
{

	WebDriver driver=Runner.driver;
	
@When("^I click on forgot password$")
public void i_click_on_forgot_password()  {
 
	driver.findElement(AuthenticationRepo.login_Link).click();
	driver.findElement(ForgotPasswordRepo.forgotPassword_Link).click();
}

@When("^I entered my registerd email$")
public void i_entered_my_registerd_email()  {
	
	driver.findElement(ForgotPasswordRepo.email_TextField).sendKeys("planusha.mca@gmail.com");

}

@When("^I click on Reset Password$")
public void i_click_on_Reset_Password()  {
 
	driver.findElement(ForgotPasswordRepo.resetPassword_Button).click();
}

@Then("^I should get sucessfull message$")
public void i_should_get_sucessfull_message() {
    // On hold due to the forgot password email recovery not known 
}
}
