Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user
    Given user is  on homepage 
    When user click home logo
    Then Home page is dispalayed