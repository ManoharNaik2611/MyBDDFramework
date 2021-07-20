Feature: Application Login 

@Sanity
Scenario: Home page default login
Given user on netbanking landing page
When username and password
Then HomePage is populate
And cards are displayedd "true"