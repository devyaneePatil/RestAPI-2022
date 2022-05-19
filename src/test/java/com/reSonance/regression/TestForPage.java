package com.reSonance.regression;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.config.BaseTest;
import com.reSonance.pages.HomePage;

import static com.reSonance.keywords.UIKeywords.*;

public class TestForPage extends BaseTest {
	@Test
	public void verifyTitle() {
		String actualTitle = getTitle();
		WebElement element = null;
	}
	@Test
	public void verifyConfirmationAlertIsOpened() {
		HomePage home = new HomePage();
		home.clickOnAssignments();
		//();
		
	}

}
