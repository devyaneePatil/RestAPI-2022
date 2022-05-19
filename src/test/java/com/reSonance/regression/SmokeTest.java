package com.reSonance.regression;

import org.testng.Assert;
import org.testng.annotations.Test;
import static com.reSonance.keywords.UIKeys.*;

public class SmokeTest {
	@Test
	public void verifyTitleOfHomePage() {

		launchurl("https://testingshastra.com/");
		String actualT = getTitle();
		Assert.assertEquals(actualT, "Testing Shastra | Training | Placement");

	}

	@Test
	public void verifyHomePageElements() {
		launchurl("https://testingshastra.com/");
		
		
		// enterText("[href=\"/assignments\"]", getTitle())

	}

}
