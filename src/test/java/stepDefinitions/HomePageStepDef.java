package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.HomePageObject;
import utilites.WebDriverUtility;

public class HomePageStepDef extends Base {
	HomePageObject home = new HomePageObject ();
	
	@Given("^User is on Retail! website$")
	public void User_is_on_Retail_website() {
		openBrowser();
		logger.info("Retail Website is opened");
		WebDriverUtility.screenShot();
	}
	@When("^User click on Currency$")
	public void User_click_on_Currency() {
		home.clickOnCurrencyButton();
		logger.info("User click on currency button");
		WebDriverUtility.screenShot();
	}
	@And("^User Chose Euro from dropdown$")
	public void User_Chose_Euro_from_dropdown() {
		home.clickOnEuroButton();
		logger.info("user click on Euro button");
		WebDriverUtility.screenShot();
	}
	@Then("^currency value should change to Euro$")
	public void currency_value_should_change_to_Euro() {
		 Assert.assertTrue(home.isEuro());
	}
	

}
