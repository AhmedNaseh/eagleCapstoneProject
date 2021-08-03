package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class PhonesPDAsPageObject extends Base{

	public  PhonesPDAsPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[normalize-space()='Phones & PDAs']")
	private WebElement phonesPDAs;
	
	@FindBy(xpath = "//a[contains(text(),'HTC Touch HD')]")
	private WebElement HTCTeachHD;
	
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iphone;
	
	@FindBy(xpath = "//a[text()='Palm Treo Pro']")
	private WebElement palmTreoPro;
	
	@FindBy(xpath = "//h2[text()='Phones & PDAs']")
	private WebElement phonespdas;
	
	public void clickOnPhonePDAs() {
		WebDriverUtility.clickOnElement(phonesPDAs);
	}
	public void clickOnHTCTouchHD() {
		WebDriverUtility.clickOnElement(HTCTeachHD);
	}
	public void clickOniphone() {
		WebDriverUtility.clickOnElement(iphone);
	}
	public void clickOnPalmTreoPro() {
		WebDriverUtility.clickOnElement(phonespdas);
	}
}
