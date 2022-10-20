Feature: Search field tests
  Background: Open Amazon Home Page
    Given Amazon Home Page is opened

#  In the first test you should verify if you write incorrect information you should check that
#  at result you have No results for “incorrect information”

  Scenario: When writing invalid data in search field the expected result is [No results for “invalid data”]
    When User inserts invalid data in search field
    Then Validate that no results were found

#  In the second test you should check that when you write some info in a search field at the
#  result you see 1-16 of over 5,000 results for "laptop" (you should check that “laptop” word is
#  present)

  Scenario: When writing valid data in search field User can see 1-16 of over 5,000 results for "valid data"
    When User inserts valid data in search field
    Then Validate that the inserted data is present as text within the text showing the number of results found

#  S3: In the third test you should do the same search as you did in a previous test, but you
#  should verify that found elements contain searched word
#  Note: not all elements can have the searched word, so you can check that at least one
#  element contains the searched word