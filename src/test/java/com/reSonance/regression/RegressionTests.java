package com.reSonance.regression;

import org.testng.Assert;
import org.testng.annotations.Test;
import static com.reSonance.keywords.UIKeywords.*;

public class RegressionTests {
	@Test
	public void verifyTitleOfHomePage() {
		openBrowser("Chrome");
		launchUrl("https://www.w3schools.com/");
		String actualTitle = getTitle();
		Assert.assertEquals("W3Schools Online Web Tutorials", actualTitle);
		
		//UIKeywords.enterText("Home Page", actualTitle);
		//a#w3loginbtn
	}
	

				
}
