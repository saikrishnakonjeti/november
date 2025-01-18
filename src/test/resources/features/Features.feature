@Features
Feature: Validate all the functionalities related to Features Tab


@Smoke @VerifyTabs
Scenario: Validate the options present in Features tab 1
Given I am in Opencart Application
When I have navigated to Features tab
Then I verify the tabs "Admin" and "Customer" are present

@Regression @VerifyTabs
Scenario: Validate the options present in Features tab 2
Given I am in Opencart Application
When I have navigated to Features tab
Then I verify the tabs "Admin" and "Customer" are present

@Smoke @VerifyTabs
Scenario: Validate the options present in Features tab 3
Given I am in Opencart Application
When I have navigated to Features tab
Then I verify the tabs "Admin" and "Customer1" are present
