Feature: Application Login 

Scenario: Home page default login
Given user is on netbanking landing page
When username "abc" and password "1234"
Then Home page is populate
And cards are displayed "true"

@Sanity
Scenario: Home page default login
Given user is on netbanking landing page
When username "lmn" and password "5678"
Then Home page is populate
And cards are displayed "false"

@Mobile
Scenario: Home page default login
Given user is on netbanking landing page
When user sign up with following details 
| abc | 1234 | manohar.naik@atos.net | India | 7776958664 |
Then Home page is populate
And cards are displayed "false"

@Smoke
Scenario Outline: Home page default login
Given user is on netbanking landing page
When username with <Username> and password <Password>
Then Home page is populate
And cards are displayed "true"

Examples:
|Username |Password|
|User1    |Pass1   |
|User2    |Pass2   |
|User3    |Pass3   |
