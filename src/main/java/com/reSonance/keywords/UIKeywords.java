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
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else {
			System.err.println("Invalid browser name: " + browserName);
		}

	}

	public static String getTitle() {
		System.out.println("Your title : ");
		return driver.getTitle();

	}

	public static void launchUrl(String url) {
		System.out.println("Your url launched");
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

	/**
	 * @param by
	 * @param TextToEnter
	 */
	@Deprecated
	public static void enterText(By by, String TextToEnter) {
		driver.findElement(by).sendKeys(TextToEnter);
	}

	@Deprecated
	public static void enterText(String locatorValue, String textToEnter) {
		driver.findElement(By.cssSelector(locatorValue)).sendKeys(textToEnter);
	}

	public static void enterText(String locatorValue, String loctorType, String textToEnter) {
		getWebElement(loctorType, locatorValue).sendKeys(textToEnter);
	}

	public static WebElement getWebElement(String locatorType, String locatorValue) {
		if (locatorType.equalsIgnoreCase("xpath")) {
			return driver.findElement(By.xpath(locatorValue));
		} else if (locatorType.equalsIgnoreCase("css")) {
			return driver.findElement(By.cssSelector(locatorValue));

		} else if (locatorType.equalsIgnoreCase("id")) {
			return driver.findElement(By.id(locatorValue));
		} else if (locatorType.equalsIgnoreCase("class")) {
			return driver.findElement(By.className(locatorValue));
		} else {
			System.err.println("Invalid locator type : " + locatorType);
		}
		return null;
	}

	public static void click(String locatorValue, String locatorType) {
		getWebElement(locatorType, locatorValue).click();

	}

	public static String click(String locator) {
		String[] part = locator.split("##");
		String part1 = part[0];
		String part2 = part[1];
		getWebElement(part1, part2).click();
		return null;
	}

	public static void closeBrowser() {
		driver.close();
		System.out.println("Browser is Closed.");

	}
}
