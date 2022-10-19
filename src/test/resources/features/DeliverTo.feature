Feature: Deliver To tests
# S1: In the first test you should click on Deliver to icon. In opened pop up
#  you should enter a US zip code (you can find list here). And click on apply
#continue button
#  Verify the value is updated.

  Background: Open Amazon Home Page
    Given Amazon Home Page is opened

  Scenario: Click on Deliver to icon, enter a US zip code in opened pop up and validate the value is updated
    When Click on Deliver To icon and open CHOOSE YOUR LOCATION pop up
    And  Enter a US zip code in CHOOSE YOUR LOCATION pop up and click on APPLY button
    Then Validate that the value is updated on Deliver To icon


#S2 In the second test you should verify that in the list of countries Poland is present

  Scenario: Click on Deliver to icon and in opened pop verify that Poland is present in the list of countries
  after clicking on apply
    When Click on Deliver To icon and open CHOOSE YOUR LOCATION pop up
    Then Validate that the list of countries contains "Poland"

#  S3: In the third test you should find and choose the country. After that, you should choose any
#  category (i.e. headset, keyboards, and so on)
#  Click on any element
#  In open page you should verify that Shipping to “Country which was chosen at the
#  beginning”
  Scenario: Choose a country (Poland), than choose any product from a category (i.e. headset, keyboards, and so on) and
    validate Shipping to chosen country
    When Click on Deliver To icon and open CHOOSE YOUR LOCATION pop up
    And Choose "Poland" from the countries list
    And Choose any category of products and click on any product
    Then Validate that the product is shipping to "Poland"