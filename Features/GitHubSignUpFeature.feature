Feature: GitHub SignUp Feature
Using this feature user can Signup into Github account

@github
Scenario: User trying to SignUp into GitHub account by entering valid user details

Given User is on GitHub Signup page
When User enters valid details
Then GitHub account is created 