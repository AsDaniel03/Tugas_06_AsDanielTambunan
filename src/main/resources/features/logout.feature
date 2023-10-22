@RunAll
Feature:logout

  Background:for logout
    Given user navigated to landing page
    And user login with existing account

    @Logout
    Scenario: user success logout
      When user click logout on action
      Then user successfull logout and redirect to login page