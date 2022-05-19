package com.config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.page.utils.Environment;
import com.reSonance.keywords.UIKeywords;

public class BaseTest {

	Environment env = new Environment();

	@BeforeMethod
	public void setUp() throws Exception {
		UIKeywords.openBrowser("chrome");
	}

	@AfterMethod
	public void tearDownMethod() {
		UIKeywords.closeBrowser();

	}

}