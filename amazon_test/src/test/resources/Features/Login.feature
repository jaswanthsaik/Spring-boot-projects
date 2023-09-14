@tag
Feature: Amazon app Login functionality features

  Scenario: verification of Enter your email message
    Given you are on the Login Page of Amazon app
    When Email field is Empty
    Then should give message, Enter your email or mobile phone number
    

  Scenario: verification of Continue  button
    Given you are on the Login Page of Amazon app
    When user Enters email and clicks on Continue
    Then should display page to enter password

  Scenario: verification of No account found with mobile number message
    Given you are on the Login Page of Amazon app
    When user Enters wrong phone number and clicks on Continue
    Then should give message, No account found with mobile number

  Scenario: verification of No account found with email address button
    Given you are on the Login Page of Amazon app
    When user Enters wrong email address and clicks on Continue
    Then should give message, No account found with email address

  Scenario: verification of Sigin button
    Given you are on the Sign in Page of Amazon app
    When user enters password and clicks on Sign in
    Then User is redirected to Home Page of Amazon