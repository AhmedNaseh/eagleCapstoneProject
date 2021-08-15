package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Wait;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.RetailPageObject;
import utilites.WebDriverUtility;

public class RetailPageStepDef extends Base {
	
	RetailPageObject retail = new RetailPageObject();
	@Given("^User is on Retail website!$")
	public void user_is_on_Retail_Website_retail() {
		openBrowser();
		logger.info("Retail Website is opened!");
		WebDriverUtility.screenShot();
		
	}
	
	@And("^User click  on MyAccount!$")
	public void user_click_on_MyAccount_retail() {
		retail.clickOnMyAccount();
		logger.info("User clicked on MyAccount");
	}
	
	@When("^User click on Login!$")
	public void user_click_on_Login_retail() {
		retail.clickOnLogin();
		logger.info("User Clicked on Login!");
		
	}
	
	@And("^User enter username '(.+)' and! password '(.+)'$")
	public void user_enter_userName_and_password_retail(String userName, String password) {
		retail.enterEmail(userName);
		logger.info("user entered email!");
		retail.enterPassword(password);
		logger.info("user entered password!");
		WebDriverUtility.screenShot();
	}
	
	@And("^User click on! Login button$")
	public void user_click_on_Login_button() {
		retail.clickOnLoginButton();
		logger.info("user clicked on login button");
	}
	
	@Then("^User should be logged! in to MyAccount dashboard$")
	public void user_should_be_logged_in_to_myAccount_Dashboard() {
		WebDriverUtility.wait(5000);
		WebDriverUtility.screenShot();
		logger.info("user logged to myAccount Dashboard");
	}
	
	
	
	
  @When("^User click on ‘Register for an Affiliate Account’ link$")
  public void user_click_on_Register_for_an_Affiliate_Account_link()  {
	  retail.clickOnAffiliateAccount();
	  logger.info("User click on ‘Register for an Affiliate Account");
	  WebDriverUtility.wait(3000);
	  WebDriverUtility.screenShot();
  }

  
  @And("^User fill affiliate form with below! information$")
	public void user_fill_the_Registration_form_with_below_information(DataTable info) {
	// Cucumber DataTables has a return of List<Map<String,String>> This is when your cucumber
	// DataTable has headers. When cucumber DataTable does not has headers we will use List<List<index>
	List<Map<String, String>> dataValues = info.asMaps(String.class, String.class);
	retail.enterCompany(dataValues.get(0).get("company")); 
	retail.enterWebsite(dataValues.get(0).get("website"));
	retail.enterTaxId(dataValues.get(0).get("taxID"));
	switch(dataValues.get(0).get("paymentMethod"))
	{
	case "Cheque": 
		retail.clickOnCheque();
		retail.enterChequeName(dataValues.get(0).get("ChequeName"));
		break;
	case "PayPal": 
		retail.clickOnPayPal();
		break;
	case "Bank Transfer":
		retail.clickOnBankTransfer();
		break;
	default:
		retail.clickOnCheque();
		
	}
	
	logger.info("User filled the information form");
	WebDriverUtility.screenShot();
	
	}
  @And("^User check on About us check box$")
  public void user_check_on_About_us_check_box() {
	  retail.clickOnAgree();
	  logger.info("user click on about us box");
	WebDriverUtility.screenShot();
	WebDriverUtility.wait(5000);
  }
  
  @And("^User click on Continue button$")
  public void User_click_on_Continue_button() {
	  retail.clickOnContinue();
	  logger.info("click on continue button");
	  WebDriverUtility.screenShot();
	  WebDriverUtility.wait(5000);
  }
  
  @Then("^User should see a success message$")
	public void user_should_see_success_message()  {
	  String expectedMessage = "Success";
	  String actualMessage = retail.SuccessCompareAffiliate();
	  Assert.assertEquals(expectedMessage, actualMessage);
	  logger.info("user Account has been created");
	  WebDriverUtility.screenShot();
	    
	}


}
