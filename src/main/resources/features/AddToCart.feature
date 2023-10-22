@RunAll
Feature:AddToCart

  Background:for checkout
    Given user navigated to landing page
    And user login with existing account

  @AddToCart
  Scenario: User success checkout product
    When user click add to cart
    And user checkout the product
    Then user success checkout the product
