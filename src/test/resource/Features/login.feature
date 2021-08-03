@CompleteTest 
Feature: Login to Retail website 
# In feature will be use a comment 
#Every Feature file starts with Feature: <Name of Feature>

Background: 
	Given User is on Retail Website 
	
@login @Regression @SmokeTest 
Scenario: Login to MyAccount 


	When User click on MyAccount 
	And  User click on Login 
	And User enter userName 'eagles@tekschool.us' and password 'eagles' 
	And User click on Login button 
	Then User should be logged in to myAccount Dashboard 
	
	# Instead of Writting this scenario 3 times and just changing values 
	# Cucumber provides Scenario Outline with Examples keyword to do 
	#Data Driven Testing
@test 
Scenario Outline: Login to MyAccount with Multiple users 


	When User click on MyAccount 
	And  User click on Login 
	And User enter userName '<userName>' and password '<password>' 
	And User click on Login button 
	Then User should be logged in to myAccount Dashboard 
	
	Examples: 
		|userName|password|
		|eagles@tekschool.us|eagles|
		|hawks@tekschool.us|hawks|
		|falcons@tekschool.us|falcons|

@RegisterTestCase
Scenario: Register new user to Retail Website 
		
	When User click on MyAccount
	And User click on Register option
	And User fill the Registration form with below information
	|firstName|lastName|eMail|telephone|password|passwordConfirm|Subscribe|
	|rashid|cool|rashidcool@tekschool.us|2021019922|coolranch|coolranch|no|
	And User accept the privacy and policy
	And User click on continue button
	Then User should be registered in Retail Website 
			
			
			
			
			
			
			
			
