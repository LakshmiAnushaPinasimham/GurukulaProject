package elements.Behaviours;

import org.openqa.selenium.WebElement;

import waits.Waits;

public class TextBox extends Waits
{
	  
	  public static void sendText(WebElement element,String text)
	  {
		  implicitWait();
		  element.sendKeys(text);
	  }
	  
	  public static String getText(WebElement element)
	  {
		  implicitWait();
		  String text=element.getText();
		  return text;
	  }
}