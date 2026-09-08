Feature: Validate functinaliy of the Internet application


Scenario: Validate Dynamic Content functionality

Given User is on home page 
When User click on Content
And  User clicks on click here button
Then User verify the changes after user click here button 
When the user comes back

Scenario: To validate Dynamic Controls 

When user click on Dynamic Controls
And user click Add or Remove Checkbok
And user click the Remove button
Then user verify the its gone text
And user click the Add button
Then user verify the its back text  
And user click the Enable button
Then user verify the its enabled text
And user click the Disable button
Then user verify the its disabled text


Scenario:
Given User is on entry add home page
When User clicks on the Entry Ad option
And user clicks on the Click Here link in the Entry Ad
And user clicks the Close button on the Entry Ad popup








 	
 
