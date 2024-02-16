Feature: Login
        As a user I should able to login into my app
        
Background: Set up Browsers
Given Setting up the Browser
 
 Scenario: I login with valid credential
 		Given I navigate to "https://www.flipkart.com"
        #And I enter "deodrant" into input field as "Search" in "HomePage"
    Then I close browser 