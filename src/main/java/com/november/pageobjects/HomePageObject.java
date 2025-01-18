package com.november.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.november.utilities.CommonFunctions;

public class HomePageObject extends CommonFunctions {
	private WebDriver driver;
	private WebDriverWait wait;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
	}

	public void navigateToTab(String tabName) {
		click(driver, wait, By.xpath("//a[text()='" + tabName + "']"));
	}

}
