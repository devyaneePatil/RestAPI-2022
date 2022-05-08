package com.reSonance.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords {
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
			System.err.println("Invalid browser name: " + browserName);
		}

	}

	public static String getTitle() {
		return driver.getTitle();

	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	/**
	 * This method can be used to enter provided text in specified
	 * {@code WebElement}
	 * 
	 * @param element     in which you want to enter text
	 * @param textToEnter this is text that you want to enter
	 */
	public static void enterText(WebElement element, String textToEnter) {
		element.sendKeys(textToEnter);
	}

	public static void enterText(By by, String TextToEnter) {
		driver.findElement(by).sendKeys(TextToEnter);

	}

	public static void enterText(String locatorValue, String textToEnter) {
		driver.findElement(By.cssSelector(locatorValue)).sendKeys(textToEnter);
	}
}