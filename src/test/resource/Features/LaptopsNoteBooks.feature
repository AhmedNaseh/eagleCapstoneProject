#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@LaptopNoteBooks
Feature: Laptops and Notebooks
  

  @scenario1
  Scenario: Add and Remove a Mac book from Cart 
	Given User is on Retail website
	When User click on Laptop &NoteBook tab 
	And User click on Show all Laptop &NoteBook option 
	And User click on MacBook  item 
	And User click add to Cart button 
	Then User should see a message ‘Success: You have added MacBook to your shopping cart!’
	And User should see ‘1 tem(s)-602.00’ showed to the cart 
	And User click on cart option 
	And user click on red X button to remove the item from cart
	Then item should be removed and cart should show ‘0 item(s)’

  @scenario2
  Scenario: Product Comparison  
	Given User is on Retail website
	When User click on Laptop &NoteBook tab 
	And User click on Show all Laptop &NoteBook option 
	And User click on product comparison icon on ‘MacBook’
	And User click on product comparison icon on ‘MacBook Air
	Then User should see a message ‘Success: You have added MacBook Air to your product comparison!’
	And User click on Product comparison link 
	Then User should see Product Comparison Chart
	
	@scenario3
	Scenario: Adding an item to Wish list   
	Given User is on Retail website
	When User click on Laptop &NoteBook tab 
	And User click on Show all Laptop &NoteBook option 
	And User click on heart icon to add ‘Sony VaIO’ laptop to wish list 
	Then User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’
	
	@scenario4
	Scenario: Validate the price of MacBook Pro is 2000   
	Given User is on Retail website
	When User click on Laptop &NoteBook tab 
	And User click on Show all Laptop &NoteBook option 
	And User click on ‘MacBook Pro’ item 
	Then User should see  ‘$2,000.00’ price tag is present on UI.
			
