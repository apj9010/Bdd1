Feature: GitHub Login Feature
Using this feature user can Signin into Github account	


@execute
Scenario: User trying to Signin into GitHub account by entering invalid Login credentials

Given User is on GitHub Login page
When User enters invalid set of SignIn credentials
Then 'Invalid Username or Password' Message is displayed

@execute
Scenario: User wants to Signin into GitHub account by entering valid set of Username and Password
Given User is on GitHub Login page
When User enters valid set of SignIn credentials
Then User should be Succesfully Signed into GitHub account

