package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class TabletsPageObject extends Base {

	public TabletsPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Tablets']")
	private WebElement tablets;
	
	@FindBy(xpath = "//a[text()='Samsung Galaxy Tab 10.1']")
	private WebElement samsungGalaxyTab;
	
	public void clickOnTablets() {
		WebDriverUtility.clickOnElement(tablets);
	}
	public void clickOnSamsungGalaxyTab() {
		WebDriverUtility.clickOnElement(samsungGalaxyTab);
	}
}

