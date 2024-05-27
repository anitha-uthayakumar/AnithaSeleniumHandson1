Feature: To test SauceDemo Application
Scenario: To test SauceDemo Login page
Given To Launch the Browser
When To Enter UserName
And To Enter Password
And To click Login
Then To validate Homepage

Scenario: To select the product
When To Select red shirt
And To Add to Cart
Then To Validate Remove


Scenario: To Checkout the product
When To click Shopping cart
And To Click Checkout
And To Enter FirstName
And To Enter LastName
And To Enter PostalCode
Then To Click on Continue

Scenario: To finish the shopping

When To Click on Finish
Then To Validate Thank you message
