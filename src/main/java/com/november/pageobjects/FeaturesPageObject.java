package com.november.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.november.utilities.CommonFunctions;

public class FeaturesPageObject extends CommonFunctions {
	private WebDriver driver;
	private WebDriverWait wait;

	public FeaturesPageObject(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
	}

	public boolean validateTab(String tabName) {
		return validateElementPresent(driver, By.xpath("//a[contains(text(),'" + tabName + "')]"));
	}

}
