package steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import object.Repository.RegistrationRepo;
import runner.Runner;
import waits.Waits;

public class RegistrationSteps {
	public static String excelInfo = System.getProperty("user.dir") + "\\ExcelDataFiles\\RegistrationData.xlsx";

	public static ArrayList<String> registerData = new ArrayList<String>();
	WebDriver driver = Runner.driver;

	@Given("^I launch the Gurukula Application$")
	public void i_launch_the_Gurukula_Application() {
		driver.get("http://127.0.0.1:8080");
		driver.manage().window().maximize();
	}

	@When("^I click on Registration$")
	public void i_click_on_Registration() {
		driver.findElement(RegistrationRepo.register_Link).click();
	}

	@When("^I filled the registration details$")
	public void i_filled_the_registration_details() throws IOException {
		try {
			File file = new File(excelInfo);
			FileInputStream fis = new FileInputStream(file);

			// Read data from Excel(.xlsx)
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("RegistrationData");
			XSSFRow rowCount = sheet.getRow(0);
			int colCount = rowCount.getLastCellNum();
			int recordsCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

			for (int i = 1; i <= recordsCount; i++) {
				for (int j = 0; j < colCount; j++) {
					registerData.add(sheet.getRow(i).getCell(j).getStringCellValue());
				}
			}

			driver.findElement(RegistrationRepo.login_TextField).sendKeys(registerData.get(0));
			driver.findElement(RegistrationRepo.email_TextField).sendKeys(registerData.get(1));
			driver.findElement(RegistrationRepo.newPassword_TextField).sendKeys(registerData.get(2));
			driver.findElement(RegistrationRepo.newPasswordConfirm_TextField).sendKeys(registerData.get(3));
			WebElement element = driver.findElement(RegistrationRepo.newPasswordConfirm_TextField);
			element.click();
			element.sendKeys(Keys.TAB);
			element.sendKeys(Keys.ENTER);
		}

		catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

	@Then("^registration should be done successfully$")
	public void registration_should_be_done_successfully() throws InterruptedException {
		Waits.implicitWait();
		String expectedStatus = driver.findElement(RegistrationRepo.registerStatus).getText();
		if (expectedStatus.contains("Registration failed")) {
			Assert.fail();
		}
		UserLogoutSteps.i_click_on_Logout();
	}

}