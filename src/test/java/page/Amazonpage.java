package page;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.Base;

public class Amazonpage extends Base {

	public void user_on_welcome_screen_click_on_sign_in_icon() {
		WebElement cl = driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"));
		ExecutorClick(cl);

	}

	public void on_sign_in_page_user_enter_vlaid_mobile_no_and_click_on_continue_then_enter_password_and_click_on_sign_in() {
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("9416951167");
		WebElement cn = driver.findElement(By.xpath("//input[@id='continue']"));
		ExecutorClick(cn);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Y%EY2wU%!#-3mvE");
		WebElement sign = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		ExecutorClick(sign);

	}

	public void with_valid_credentials_user_should_login_successfully_and_land_on_homepage() {
		WebElement home = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		String h = home.getText();
		// System.out.println(h);
		if (h.contains("Hello, Sudhir")) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}

	}

	public void user_on_welcome_screen_click_on_sign_in_button() {
		WebElement cl = driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"));
		ExecutorClick(cl);

	}

	public void on_sign_in_page_user_enter_invlaid_mobile_no_and_click_on_continue() {
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("9416951169");
		WebElement cn = driver.findElement(By.xpath("//input[@id='continue']"));
		ExecutorClick(cn);

	}

	public void incorrect_phone_no_message_should_be_shown_on_the_screen() {
		WebElement wrong = driver.findElement(By.xpath("(//h4[@class='a-alert-heading'])[1]"));
		String h = wrong.getText();
		// System.out.println(h);
		if (h.contains("Incorrect phone number")) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}

	}

	public void user_login_with_valid_login_credentials_and_on_homepage_click_on_mobiles() {
		WebElement cl = driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"));
		ExecutorClick(cl);
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("9416951167");
		WebElement cn = driver.findElement(By.xpath("//input[@id='continue']"));
		ExecutorClick(cn);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Y%EY2wU%!#-3mvE");
		WebElement sign = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		ExecutorClick(sign);
		WebElement mob = driver.findElement(By.xpath("(//a[@tabindex='0'])[7]"));
		ExecutorClick(mob);

	}

	public void on_product_listing_page_click_on_realme_narzo() {
		WebElement watch = driver.findElement(By.xpath("//img[@alt='realme N53']"));
		ExecutorClick(watch);

	}

	public void click_on_add_to_cart_then_click_on_proceed_to_checkout_and_user_should_be_on_checkout_page() {
		driver.navigate().refresh();
		WebElement add = driver.findElement(By.xpath("//input[@name='submit.addToCart']"));
		ExecutorClick(add);

		WebElement checkout = driver.findElement(By.xpath("//input[@data-feature-id='proceed-to-checkout-action']"));
		waitforelementclick(checkout, 10);
		WebElement page = driver.findElement(By.xpath("//div[@class='a-column a-span8']"));
		ExecutorClick(page);

	}

	public void user_on_homepage_click_on_search_field() {
		WebElement cl = driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"));
		ExecutorClick(cl);
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("9416951167");
		WebElement cn = driver.findElement(By.xpath("//input[@id='continue']"));
		ExecutorClick(cn);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Y%EY2wU%!#-3mvE");
		WebElement sign = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		ExecutorClick(sign);

	}

	public void enter_iphone_in_the_search_field() {
		WebElement iphone = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		iphone.sendKeys("iphone");
	}

	public void click_on_search_icon_all_iphone_model_should_be_visible_on_product_listing_page() {
		WebElement click = driver.findElement(By.xpath("//input[@value='Go']"));
		ExecutorClick(click);
		List<WebElement> iphon = driver
				.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		for (int i = 0; i < 20; i++) {
			if (i == 0) {

				WebElement Element1 = driver
						.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[2]"));
				String Text1 = Element1.getText();
				System.out.println(Text1);

				if (Element1.isDisplayed()) {
					assertTrue(true);

				} else {
					assertTrue(false);
				}

			}
			if (i == 1) {

				WebElement Element2 = driver
						.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[3]"));
				String Text2 = Element2.getText();
				System.out.println(Text2);

				if (Element2.isDisplayed()) {
					assertTrue(true);

				} else {
					assertTrue(false);
				}

			}
			if (i == 2) {

				WebElement Element3 = driver
						.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[4]"));
				String Text3 = Element3.getText();
				System.out.println(Text3);

				if (Element3.isDisplayed()) {
					assertTrue(true);

				} else {
					assertTrue(false);
				}
			}
			if (i == 3) {

				WebElement Element4 = driver
						.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[5]"));
				String Text4 = Element4.getText();
				System.out.println(Text4);

				if (Element4.isDisplayed()) {
					assertTrue(true);

				} else {
					assertTrue(false);
				}
			}
			if (i == 4) {

				WebElement Element5 = driver
						.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[6]"));
				String Text5 = Element5.getText();
				System.out.println(Text5);

				if (Element5.isDisplayed()) {
					assertTrue(true);

				} else {
					assertTrue(false);
				}
			}
			if (i == 5) {

				WebElement Element6 = driver
						.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[7]"));
				String Text6 = Element6.getText();
				System.out.println(Text6);

				if (Element6.isDisplayed()) {
					assertTrue(true);
				} else {
					assertTrue(false);
				}

			}
			if (i == 6) {

				WebElement Element7 = driver
						.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[8]"));
				String Text7 = Element7.getText();
				System.out.println(Text7);

				if (Element7.isDisplayed()) {
					assertTrue(true);
				} else {
					assertTrue(false);
				}
			}
			if (i == 7) {

				WebElement Element8 = driver
						.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[9]"));
				String Text8 = Element8.getText();
				System.out.println(Text8);

				if (Element8.isDisplayed()) {
					assertTrue(true);
				} else {
					assertTrue(false);
				}
			}
			if (i == 8) {
				WebElement Element9 = driver
						.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[10]"));
				String Text9 = Element9.getText();
				System.out.println(Text9);

				if (Element9.isDisplayed()) {
					assertTrue(true);
				} else {
					assertTrue(false);
				}
			}
			if (i == 9) {
				WebElement Element10 = driver
						.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[11]"));
				String Text10 = Element10.getText();
				System.out.println(Text10);

				if (Element10.isDisplayed()) {
					assertTrue(true);
				} else {
					assertTrue(false);
				}
			}
			if (i == 10) {
				WebElement Element11 = driver
						.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[12]"));
				String Text11 = Element11.getText();
				System.out.println(Text11);

				if (Element11.isDisplayed()) {
					assertTrue(true);
				} else {
					assertTrue(false);
				}
			}
		}
	}

	public void user_on_homepage_click_on_mobiles() {
		WebElement cl = driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"));
		ExecutorClick(cl);
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("9416951167");
		WebElement cn = driver.findElement(By.xpath("//input[@id='continue']"));
		ExecutorClick(cn);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Y%EY2wU%!#-3mvE");
		WebElement sign = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		ExecutorClick(sign);
		WebElement mobiles = driver.findElement(By.xpath("(//a[@tabindex='0'])[7]"));
		ExecutorClick(mobiles);

	}

	public void click_on_oneplus_nordce_then_click_on_add_to_wishlist() {
		WebElement nord = driver.findElement(By.xpath("//img[@alt='nord ce 3']"));
		ExecutorClick(nord);

		WebElement wishlist = driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']"));
		ExecutorClick(wishlist);

		WebElement addto = driver.findElement(
				By.xpath("//a[@href='https://www.amazon.in/hz/wishlist/ls/28ZVXKSOIKEY4?ref_=wl_dp_view_your_list']"));

		ExecutorClick(addto);

	}

	public void click_on_create_list_item_should_be_added_in_the_wishlist() {

		WebElement verify = driver.findElement(By.xpath("(//a[@role='tab'])[1]/div"));
		String u = verify.getText();
		if (u.contains("Your Lists")) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}

	}
}
