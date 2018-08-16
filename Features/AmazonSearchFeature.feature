Feature: Amazon search feature
Using this feature user should be able to search in Amazon
@amazon1
Scenario: User want to search information about  'Redmi 5' mobile by entering valid set of word

Given User is on Amazon home page

When User searches for 'Redmi 5'


Then User should get all the models related to 'Redmi 5'Then open the product details