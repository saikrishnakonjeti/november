package com.november.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {

	public void explicitWait(WebDriver driver, WebDriverWait wait) {
		wait = new WebDriverWait(driver, 30);
	}

	public void enterText(WebDriver driver, WebDriverWait wait, By element, String testData) {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
		driver.findElement(element).sendKeys(testData);
	}

	public void click(WebDriver driver, WebDriverWait wait, By element) {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
		driver.findElement(element).click();
	}

	public void selectElement(WebDriver driver, WebDriverWait wait, By element, String text) {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
		Select select = new Select(driver.findElement(element));
		select.selectByVisibleText(text);
	}

	public boolean validateElementPresent(WebDriver driver, By element) {
		boolean status = false;
		status = driver.findElement(element).isDisplayed();
		return status;
	}

}
