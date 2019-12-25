Feature: Login Feature
  Verify if user is able to Login in to the site

@Logo
  Scenario: Login as a authenticated user test
    Given user is  on homepage 
    When user click home logo
    Then Home page is dispalayed
    
    
  @Requests 
 Scenario: Create a Request demo
    Given lunch the broswer, Enter URL 
    When Fill the form and submit
    Then Verify request is created