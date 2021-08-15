package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class RetailPageObject extends Base {

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;

	@FindBy(id = "input-email")
	private WebElement emailField;

	@FindBy(id = "input-password")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//*[@id=\"content\"]/ul[3]/li/a")
	private WebElement affiliateAccount;
	
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement company;
	
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement website;
	
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxid;
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement agree;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continuenext;
	
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement cheque;
	
	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement paypal;
	
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransfer;
	
	
	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement chequeName;
	
	@FindBy(xpath = ".alert.alert-success.alert-dismissible")
	private WebElement successMessage;
	
	
	public void clickOnMyAccount() {
		WebDriverUtility.clickOnElement(myAccount);
	}

	public void clickOnLogin() {
		WebDriverUtility.clickOnElement(login);
	}

	public void enterEmail(String email) {
		WebDriverUtility.enterValue(emailField, email);
	}

	public void enterPassword(String password) {
		WebDriverUtility.enterValue(passwordField, password);
	}

	public void clickOnLoginButton() {
		WebDriverUtility.clickOnElement(loginButton);
	}
	
	public void clickOnAffiliateAccount() {
		WebDriverUtility.clickOnElement(affiliateAccount);
	} 
	public void enterCompany(String company) {
		WebDriverUtility.enterValue(this.company,company);
	
	}
	public void enterWebsite(String website) {
		WebDriverUtility.enterValue(this.website,website);
	
	}
	
	public void enterTaxId(String TaxId) {
		WebDriverUtility.enterValue(this.taxid,TaxId);
	
	}
	
	public void enterChequeName(String ChequeName) {
		WebDriverUtility.enterValue(this.chequeName,ChequeName);
	}
	
	public void clickOnAgree() {
		WebDriverUtility.clickOnElement(agree);
	
	}
	public void clickOnContinue() {
		WebDriverUtility.clickOnElement(continuenext);
	
	}
	
	public String SuccessCompareAffiliate() {
		String actual = successMessage.getText().substring(0, 7);
		return actual;

	}
	
	public void clickOnCheque()
	{
		WebDriverUtility.clickOnElement(cheque);		
	}
	
	public void clickOnPayPal()
	{
		WebDriverUtility.clickOnElement(paypal);		
	}
	
	public void clickOnBankTransfer()
	{
		WebDriverUtility.clickOnElement(bankTransfer);		
	}
	
	
	
	
}
