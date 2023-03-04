#Author: sarvath.saba@capgemini.com
Feature: Medicines
  Description: User is able to find required medicines

  Background: User searches for medication
    Given the user is on the Apollo247 homepage
    When the user clicks on the Medicines
    Then the user should be able to view all the available medications

  @login
  Scenario: User is able to login
    Given User is on the Apollo247 home page
    When User clicks on Login button
    And User is able to give mobile number
    And User is able to write otp
    Then User is able to Login

  @category
  Scenario: User selects a category
    Given the user is on the Medicines page
    When the user selects the Shop by Category
    Then the user should be able to view a list of products within the selected category

  @search
  Scenario: User searches for medicine on the website
    Given the user is on the Pharmacy page
    When the user enters medicine in the search bar
    And clicks the search button
    Then the user should see a list of results related to medicine
    And the list should include the name, image and price

  @view
  Scenario: User views product details
    Given the user has selected a product
    When the user clicks on the product image or name
    Then the user should be able to view the product details

  @cart
  Scenario: User adds product to cart
    Given the user has viewed the product details
    When the user clicks on the "Add to Cart" button
    Then the product is added to cart
