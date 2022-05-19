package com.reSonance.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.reSonance.keywords.UIKeywords.*;

public class HomePage{
	
	
	public WebElement assignmentsLnk= driver.findElement(By.cssSelector("a[href=\"/assignments\"]"));
	public WebElement coursesLnk;
	public WebElement videosLnk;
	public WebElement notesLnk;
	public WebElement recentPlacementsLnk;

	public void clickOnAssignments() {
		assignmentsLnk.click();
	}
}
