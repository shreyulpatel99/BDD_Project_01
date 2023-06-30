Feature: EBay home page tests 

Scenario Outline: User is verifying the home page 

Given user is already on Login Page 
When title of Login Page is Electronics, Cars, Fashion, Collectibles & More | eBay
Then user clicks on sign in button for home page
Then user enters username for home page "<username>" 
And user clicks on continue button for home page
Then user enters password for home page "<password>"
And click on sign in button for home page
Then user clicks on the link "<linkname>"
Then user quits the browser

Examples: 

	|	username 				|	password 	| 			linkname 	|
	| shreyulpatel30@gmail.com 	| Scofield@7 	| Saved 				|
	| shreyulpatel30@gmail.com 	| Scofield@7 	| Fashion 				|

