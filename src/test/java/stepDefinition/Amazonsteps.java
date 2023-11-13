package stepDefinition;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Amazonpage;


public class Amazonsteps extends Base{
	Amazonpage RT=new Amazonpage();
	
	@When("user on welcome screen click on sign in icon")
	public void user_on_welcome_screen_click_on_sign_in_icon(){
		RT.user_on_welcome_screen_click_on_sign_in_icon();
		
	}
	
	@And("on sign in page user enter vlaid mobile no and click on continue then enter password and click on sign in")
	public void on_sign_in_page_user_enter_vlaid_mobile_no_and_click_on_continue_then_enter_password_and_click_on_sign_in() {
		RT.on_sign_in_page_user_enter_vlaid_mobile_no_and_click_on_continue_then_enter_password_and_click_on_sign_in();
		
	}
	@Then ("with valid credentials user should login successfully and land on homepage")
	public void with_valid_credentials_user_should_login_successfully_and_land_on_homepage() {
		RT.with_valid_credentials_user_should_login_successfully_and_land_on_homepage();
		
	}
	@When("user on welcome screen click on sign in button")
	public void user_on_welcome_screen_click_on_sign_in_button(){
		RT.user_on_welcome_screen_click_on_sign_in_button();
		
	}
	
	@And("on sign in page user enter invlaid mobile no and click on continue")
	public void on_sign_in_page_user_enter_invlaid_mobile_no_and_click_on_continue() {
		RT.on_sign_in_page_user_enter_invlaid_mobile_no_and_click_on_continue();
		
	}
	@Then("incorrect phone no message should be shown on the screen")
	public void incorrect_phone_no_message_should_be_shown_on_the_screen() {
		RT.incorrect_phone_no_message_should_be_shown_on_the_screen();
		
	}

	@When("user login with valid login credentials and on homepage click on mobiles")
	public void user_login_with_valid_login_credentials_and_on_homepage_click_on_mobiles() {
		RT.user_login_with_valid_login_credentials_and_on_homepage_click_on_mobiles();
	}
	@And("on product listing page click on realme narzo")
	public void on_product_listing_page_click_on_realme_narzo() {
		RT.on_product_listing_page_click_on_realme_narzo();
		
	}
	@Then("click on add to cart then click on proceed to checkout and user should be on checkout page")
	public void click_on_add_to_cart_then_click_on_proceed_to_checkout_and_user_should_be_on_checkout_page() {
		RT.click_on_add_to_cart_then_click_on_proceed_to_checkout_and_user_should_be_on_checkout_page();
	}

	

	@When("user on homepage click on search field")
	public void user_on_homepage_click_on_search_field() {
		RT.user_on_homepage_click_on_search_field();
	}
	
	@And("enter iphone in the search field")
		public void enter_iphone_in_the_search_field() {
		RT.enter_iphone_in_the_search_field();
	}
	@Then("click on search icon all iphone model should be visible on product listing page")
	public void click_on_search_icon_all_iphone_model_should_be_visible_on_product_listing_page() {
		RT.click_on_search_icon_all_iphone_model_should_be_visible_on_product_listing_page();
	}


	
	@When("user on homepage click on mobiles")
	public void user_on_homepage_click_on_mobiles() {
		RT.user_on_homepage_click_on_mobiles();
	}
	@And("click on oneplus nordce then click on add to wishlist")
	public void click_on_oneplus_nordce_then_click_on_add_to_wishlist() {
		RT.click_on_oneplus_nordce_then_click_on_add_to_wishlist();
	}
	@Then("click on create list item should be added in the wishlist")
	public void click_on_create_list_item_should_be_added_in_the_wishlist() {
		RT.click_on_create_list_item_should_be_added_in_the_wishlist();
	}
}
