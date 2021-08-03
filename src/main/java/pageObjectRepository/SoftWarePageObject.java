package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class SoftWarePageObject extends Base{

	public SoftWarePageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Software']")
	private WebElement software;
	
	@FindBy(xpath = "//h2[text()='Software']")
	private WebElement softwarescreenpage;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement continuebutton;
	
	public void clickOnSoftWare() {
		WebDriverUtility.clickOnElement(software);
	}
	public void clickOnSoftWarescreenpage() {
		WebDriverUtility.clickOnElement(softwarescreenpage);
	}
	public void clickOnContinuebutton() {
		WebDriverUtility.clickOnElement(continuebutton);
	}
}
