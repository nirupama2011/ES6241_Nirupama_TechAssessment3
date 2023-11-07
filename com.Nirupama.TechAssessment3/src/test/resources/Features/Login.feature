Feature: Checking Login activity of demo webshop application

Background: Given User is in Login Page "https://demowebshop.tricentis.com/login"

@ValidCredentials
Scenario: Login with the help of valid credentials 
Given user click login 
When User enters valid email 
And User enters valid password 
And User click Login button
Then User should be able to login successfully and navigates to the product page

@InvalidCredentials
Scenario: Login with the help of invalid credentials 
Given user click login 
When User enters valid email 
And User enters valid password 
And User click Login button
Then User should not be able to login and throws a error message