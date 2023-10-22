@RunAll
Feature:login

  Background:for update
    Given user navigated to landing page

@login1
Scenario:user success login using valid data
  When user fill valid username
  And user fill valid password
  Then user success login to home page

@login2
Scenario: user failed login using invalid data
  When user fill invalid username
  And user fill invalid password
  Then user failed login and display error message

