package com.reSonance.keywords;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeys {
	public static RemoteWebDriver driver = null;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.err.println("Invalid browser name : " + browserName);
		}
	}

	public static void launchurl(String url) {
		driver.get(url);
	}

	public static String getTitle() {

		return driver.getTitle();
	}

	/**
	 * This method is used to enter provided text in specified {@code WebElement}
	 * 
	 * @param element     in which you want to enter text
	 * @param textToEnter this is the text that you want to enter
	 */
	public static void enterText(WebElement element, String textToEnter) {
		element.sendKeys(textToEnter);
	}

	public static void closeBrowser() {
		driver.quit();
	}
}
