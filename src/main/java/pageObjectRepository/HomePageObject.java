package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class HomePageObject extends Base {

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement HomePageTitle;
	
	@FindBy(xpath = "//span[normalize-space()='Currency']")
	private WebElement currencyButton;
	
	@FindBy(xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement EuroButton;
	
	@FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[2]//p[2]")
	private WebElement price;
	
	public void clickOnTestEnvironment() {
		WebDriverUtility.clickOnElement(HomePageTitle);
	}
	
	public void clickOnCurrencyButton() {
		WebDriverUtility.clickOnElement(currencyButton);
	}
	
	public void clickOnEuroButton() {
		WebDriverUtility.clickOnElement(EuroButton);
	}
	
	public boolean isEuro() {
		String pricetext =price.getText();
		System.out.println(pricetext);
		if(pricetext.endsWith("€"))
		{
			return true;
			
			
		}
		return false;
	}
}
