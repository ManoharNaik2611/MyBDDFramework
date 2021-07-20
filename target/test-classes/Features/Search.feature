Feature: search and place order for vegetable

@seleniumTests
Scenario: Search for items and validate results
Given user is on greencart landing page
When user search for "cucumber" vegetable
Then "cucumber" results are displayed
