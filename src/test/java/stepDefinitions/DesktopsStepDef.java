package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.DeskTopPageObject;
import utilites.WebDriverUtility;

public class DesktopsStepDef extends Base{
	
	DeskTopPageObject desktop = new DeskTopPageObject();
	
	
	@Given("^User is on Retail website$")
	public void user_is_on_Retail_website()  {
		openBrowser();
		logger.info("Retail Website is opened");
		WebDriverUtility.screenShot();
	}

	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() {
	    desktop.clickOnDeskTopTab();
	    logger.info("User clicked on Desktops tab");
	}

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops()  {
		desktop.clickOnShowAllDeskTops();
		logger.info("User clicked on Show all desktops");
	    
	}

	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page()  {
		WebDriverUtility.screenShot();
	    
	}

}
