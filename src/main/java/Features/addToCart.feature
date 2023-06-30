Feature: Adding item to cart

Scenario: Adding an item to cart and filling delivery information 

Given user is on login page 
Then user has to click on sign in button 
Then user enters the username to login
| shreyulpatel30@gmail.com |
Then user has to click on continue button 
Then user enters the password to login
| Scofield@7 |
Then user clicks on signin button 
Then user selects an item and add it to the cart 
Then user fills the delivery information 
| 123 NY St. | NY | N9B 1Y9 | 1234567890 | 
Then user closes the browser 