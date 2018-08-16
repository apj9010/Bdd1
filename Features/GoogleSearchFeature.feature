Feature: Google search feature
Using this feature user can search for what ever the information is required

Scenario: User want to search information about 'Agile Methodology' by entering valid set of words

Given User is on Google home page
When user searches for 'Agile Methodology'
Then All page links should be displayed 