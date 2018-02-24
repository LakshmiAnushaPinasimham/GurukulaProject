package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, features = "src/features/Branches.feature", glue = "steps"

)

public class Runner extends AbstractTestNGCucumberTests {
	public static WebDriver driver;

	@BeforeClass
	public void useChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
	}

/*	@AfterClass
	public static void afterClass() {
		driver.quit();
	}*/

}