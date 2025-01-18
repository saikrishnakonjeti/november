package com.example.stepdefenitions;

import org.openqa.selenium.WebDriver;

import com.november.pageobjects.HomePageObject;
import com.november.utilities.CommonFunctions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeStepDefinition {
	private WebDriver driver = BaseTest.getDriver();
	private HomePageObject homePageObject;

	@Given("I am in Opencart Application")
	public void i_am_in_opencart_application() {
		driver.get("https://www.opencart.com/");
	}

	@When("I have navigated to Features tab")
	public void i_have_navigated_to_features_tab() {
		homePageObject = new HomePageObject(driver);
		homePageObject.navigateToTab("Features");
	}

}
