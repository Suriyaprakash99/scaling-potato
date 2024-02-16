Feature: Test
        As a user I should able to hit the URL
        
Background: Set up Browsers
Given Setting up the Browser
 
 Scenario: I login to FB
 		Given I navigate to "https://www.fb.com"
        #And I enter "deodrant" into input field as "Search" in "HomePage"
    Then I close browser 