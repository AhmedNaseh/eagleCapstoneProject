package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.LaptopNoteBooksPageObject;
import utilites.WebDriverUtility;

public class LaptopsNoteBooksStepDef extends Base {
	
	LaptopNoteBooksPageObject laptopNoteBook = new LaptopNoteBooksPageObject();
	
	@When("^User click on Laptop &NoteBook tab$")
	public void user_click_on_Laptop_NoteBook_tab()  {
		laptopNoteBook.clickonLaptopAndNoteBookTab();
		logger.info("User clicked on Laptop and Note books tab");
		
	}

	@When("^User click on Show all Laptop &NoteBook option$")
	public void user_click_on_Show_all_Laptop_NoteBook_option()  {
		laptopNoteBook.clickOnShowAllLaptopsAndNoteBooks();
		logger.info("User clicked on show all laptop and NoteBook options");
	}

	@When("^User click on MacBook  item$")
	public void user_click_on_MacBook_item()  {
		laptopNoteBook.clickOnMacBookItem();
		logger.info("User clicked on MacBook");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	  
	}

	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button()  {
		laptopNoteBook.clickOnAddToCartMacBook();
		logger.info("User clicked add to cart Button");
		WebDriverUtility.wait(5000);
	}

	@Then("^User should see a message '(.+)'$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart(String expectedMessage)  {
	String expected =	expectedMessage.substring(0, 7);
	String actual =	laptopNoteBook.SuccessCompareMacBookAir();
	Assert.assertEquals(expected, actual);
	logger.info("actual equals to expected");
	WebDriverUtility.screenShot();
		
	}

	@Then("^User should see '(.+)' showed to the cart$")
	public void user_should_see_tem_s_showed_to_the_cart(String message)  {
		System.out.println(message.length() + " Expected string length");
		System.out.println(laptopNoteBook.verifyCartTotal().length() + " actual string length");
		Assert.assertEquals(message.contains("602.00"), laptopNoteBook.verifyCartTotal().contains("602.00"));
		
		logger.info("actual equals to expected");
	}

	@Then("^User click on cart option$")
	public void user_click_on_cart_option()  {
		laptopNoteBook.clickOnCartTotal();
		logger.info("User clicked on cart options");

	}

	@Then("^user click on red X button to remove the item from cart$")
	public void user_click_on_red_X_button_to_remove_the_item_from_cart()  {
		laptopNoteBook.clickOnRemoveButton();
		logger.info("User clicked X red button to remove item from cart");
		WebDriverUtility.wait(5000);
		WebDriverUtility.screenShot();
	}

	@Then("^item should be removed and cart should show '(.+)'$")
	public void item_should_be_removed_and_cart_should_show_item_s(String message)  {
		Assert.assertEquals(message.substring(0, 1), laptopNoteBook.verifyCartTotal().substring(0, 1));
		logger.info("actual equals to expected");
		WebDriverUtility.wait(5000);
	}

}
