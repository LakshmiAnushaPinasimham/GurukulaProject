package elements.Behaviours;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import waits.Waits;

public class Dropdown extends Waits
{
		
	public static void SelectByVisibleText(WebElement element,String str)
	{
		implicitWait();
		Select select=new Select(element);
		select.selectByVisibleText(str);
	}
	public static void SelectByIndex(WebElement element,int index)
	{
		explicitWaitElementToBeClickable(element);
		Select select=new Select(element);
		select.deselectByIndex(index);
	}
}