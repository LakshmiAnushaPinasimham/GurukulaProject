package popup.Windows;

import runner.Runner;

public class Alerts extends Runner {
	public static void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public static void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	public static String getAlertText() {
		String text = driver.switchTo().alert().getText();
		return text;
	}

	public static void setAlertText(String str) {
		driver.switchTo().alert().sendKeys(str);
	}
}