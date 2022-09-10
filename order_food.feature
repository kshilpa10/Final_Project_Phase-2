
Feature: Order Food
  

  @TC_101
  Scenario Outline: A user should be able to order online food sucessfully on Swiggy
    Given a user is on the landing page of Swiggy
    When he enters the location of delivery '<delivery_location>'
    And he clicks on Find Food button
    And he clicks on clicks on first restaurant on the next page
    And he clicks on Add button on the first item of restaurant page
    And he clicks on Checkout button
    Then he must be able to verify text 'SECURE CHECKOUT' on Checkout Page
    
    Examples:
    |delivery_location|
    |Bangalore,Karnataka,India|

  