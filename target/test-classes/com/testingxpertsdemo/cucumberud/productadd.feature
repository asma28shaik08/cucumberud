#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@regression
Feature: Title of your feature
  I want to use this template for place order on the Amazon website

  @smoke
  Scenario: Validate the user is able to add a product to cart
    Given open  a browser
    When Enter the url "https://www.amazon.in/"
    And user Search a product  on the Homepage
    Then user should be able to view product information related to product searched
    And user click on add to cart button
    Then user verifies if the product is added to cart
