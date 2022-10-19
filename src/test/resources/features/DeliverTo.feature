Feature: Deliver To tests
# S1: In the first test you should click on Deliver to icon. In opened pop up
#  you should enter a US zip code (you can find list here). And click on apply
#continue button
#  Verify the value is updated.

  # POSITIVE TESTS
  Scenario: Click on Deliver to icon, enter a US zip code in opened pop up and validate the value is updated
  after clicking on apply
    When Click on Deliver To icon
    And  Enter a US zip code in CHOOSE YOUR LOCATION pop up and click on APPLY button
    Then Validate that the value is updated on Deliver To icon





