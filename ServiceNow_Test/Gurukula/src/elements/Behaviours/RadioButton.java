package elements.Behaviours;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import runner.Runner;

public class RadioButton {
	
	WebDriver driver=Runner.driver;
	
	public void selectOption(WebElement element)
	{
		element.click();
	}
	
	public boolean verifySelectedOption(WebElement element)
	{
		List<WebElement> rdBtn = (List<WebElement>) element;
		
		boolean value=rdBtn.get(0).isSelected();
		
		return value;
	}

}
