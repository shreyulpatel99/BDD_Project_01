Feature: EBay Login Feature


#without examples keyword
#Scenario: EBay Login Test Scenario 
#
#Given User is already on Login Page 
#When title of Login Page is  Electronics, Cars, Fashion, Collectibles & More | eBay
#Then user clicks on sign in button 
#Then user enters "shreyulpatel30@gmail.com" 
#And user clicks on continue button 
#Then user enter "Scofield@7" 
#And click on sign in button 
#And user is on home page 
#Then user quits


#with examples keyword
#here we have to use scenario outlines because we are using examples 
Scenario Outline: EBay Login Test Scenario 

Given User is already on Login Page 
When title of Login Page is  Electronics, Cars, Fashion, Collectibles & More | eBay
Then user clicks on sign in button 
Then user enters "<username>" 
And user clicks on continue button 
Then user enter "<password>" 
And click on sign in button 
And user is on home page 
Then user quits

Examples:

	| username 					| password 		|
	| shreyulpatel30@gmail.com 	| Scofield@7 	|
	| shreyulpatel30@gmail.com 	| Scofield@1 	|
	