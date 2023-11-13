Feature: Amazon basic flow check 

@reg 
Scenario: Validate login functionality with valid credentials 

	When user on welcome screen click on sign in icon 
	And  on sign in page user enter vlaid mobile no and click on continue then enter password and click on sign in 
	Then with valid credentials user should login successfully and land on homepage 
	
@reg 
Scenario: Validate login functionality with invalid credentials 

	When user on welcome screen click on sign in button 
	And  on sign in page user enter invlaid mobile no and click on continue 
	Then incorrect phone no message should be shown on the screen 
	
	
	@reg
	Scenario: Product checkout flow
	
	When user login with valid login credentials and on homepage click on mobiles
	And  on product listing page click on realme narzo 
	Then click on add to cart then click on proceed to checkout and user should be on checkout page
	
	@reg
	Scenario: Validate search functionality
	
	When user on homepage click on search field 
	And  enter iphone in the search field
	Then click on search icon all iphone model should be visible on product listing page
#	
	
	@reg
	Scenario: Validate Wishlist functionality
	
	When user on homepage click on mobiles
	And click on oneplus nordce then click on add to wishlist
	Then click on create list item should be added in the wishlist