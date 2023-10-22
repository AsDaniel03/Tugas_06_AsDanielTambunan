@RunAll
Feature:filter

  Background:for update
    Given user navigated to landing page
    And user login with existing account

@filter1
  Scenario: User success filter products A to Z
  When user click filter Name A to Z
  Then product on list has been changed to Name A to Z

@filter2
  Scenario: User success filter products Z To A
    When user click filter Name Z to A
    Then product on list has been changed to Name Z to A

@filter3
  Scenario: User success filter products low To high
    When user click filter low to high
    Then product on list has been changed to price low to high

@filter4
  Scenario: User success filter products high To low
    When user click filter high to low
    Then product on list has been changed to price high to low