package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)

@CucumberOptions(monochrome = true, features = "src/features/Staff.Feature", glue = "steps", format = { "pretty",
		"html:target/cucumber-reports/" }

// ,tags={"@SmokeTest"} //To group features as a group
// ,tags={"@WrongPassword"} //To run specific scenario in feature

)

public class Runner extends AbstractTestNGCucumberTests {
	public static WebDriver driver;

	@BeforeClass
	public void useChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public static void afterClass() throws Exception {

		driver.quit();
	}

}