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
| address	 | city | zipcode | contactno 	| 
| 123 NY St. | NY 	| N9B 1Y9 | 1234567890  |
| 123 ON St. | ON 	| N9B 2A3 | 1231231230 	|
| 123 BC St. | BC 	| N9B 5S1 | 1234123412 	|

Then user closes the browser 