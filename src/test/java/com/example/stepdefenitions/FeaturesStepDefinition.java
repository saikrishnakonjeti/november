package com.example.stepdefenitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.november.pageobjects.FeaturesPageObject;

import io.cucumber.java.en.Then;

public class FeaturesStepDefinition{
	private WebDriver driver = BaseTest.getDriver();
	private FeaturesPageObject featuresPageObject;

	@Then("I verify the tabs {string} and {string} are present")
	public void i_verify_the_tabs_and_are_present(String admin, String customer) {
		featuresPageObject = new FeaturesPageObject(driver);
		Assert.assertTrue("Validation got Failed", featuresPageObject.validateTab(admin));
		Assert.assertTrue("Validation got Failed", featuresPageObject.validateTab(customer));
	}

}
