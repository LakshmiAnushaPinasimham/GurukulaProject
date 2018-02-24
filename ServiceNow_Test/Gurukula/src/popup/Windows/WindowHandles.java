package popup.Windows;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import runner.Runner;

public class WindowHandles extends Runner {
	public static ArrayList<String> windowList = new ArrayList<String>();

	public static String SingleWindowHandle() {
		String windowName = driver.getWindowHandle();
		return windowName;

	}

	public static void MultipleWindowHandle() {
		Set<String> windowList = driver.getWindowHandles();
		Iterator it = windowList.iterator();
		while (it.hasNext()) {
			String windowName = (String) it.next();

			windowList.add(windowName);
		}
	}
}