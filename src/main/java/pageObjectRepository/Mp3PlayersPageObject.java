package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class Mp3PlayersPageObject extends Base {
	
	public Mp3PlayersPageObject() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[text()='MP3 Players']")
	private WebElement mp3Players;
	
	@FindBy(xpath = "//a[normalize-space()='test 4 (0)']")
	private WebElement test4;
	
	@FindBy(xpath = "//a[text()='test 5 (0)']")
	private WebElement test5;
	
	@FindBy(xpath = "//a[text()='test 6 (0)']")
	private WebElement test6;
	
	@FindBy(xpath = "//a[text()='test 7 (0)']")
	private WebElement test7;
	
	@FindBy(xpath = "//a[text()='test 8 (0)']")
	private WebElement test8;
	
	@FindBy(xpath = "//a[text()='test 9 (0)']")
	private WebElement test9;
	
	@FindBy(xpath = "//a[text()='test 11 (0)']")
	private WebElement test11;
	
	@FindBy(xpath = "//a[text()='test 12 (0)']")
	private WebElement test12;
	
	@FindBy(xpath = "//a[text()='test 15 (0)']")
	private WebElement test15;
	
	@FindBy(xpath = "//a[text()='test 16 (0)']")
	private WebElement test16;
	
	@FindBy(xpath = "//a[text()='test 17 (0)']")
	private WebElement test17;
	
	@FindBy(xpath = "//a[text()='test 18 (0)']")
	private WebElement test18;
	
	@FindBy(xpath = "//a[text()='test 19 (0)']")
	private WebElement test19;
	
	@FindBy(xpath = "//a[text()='test 20 (0)']")
	private WebElement test20;
	
	@FindBy(xpath = "//a[text()='test 21 (0)']")
	private WebElement test21;
	
	@FindBy(xpath = "//a[text()='test 22 (0)']")
	private WebElement test22;
	
	@FindBy(xpath = "//a[text()='test 23 (0)']")
	private WebElement test23;
	
	@FindBy(xpath = "//a[text()='test 24 (0)']")
	private WebElement test24;
	
	public void clickOnMP3Players() {
		WebDriverUtility.clickOnElement(mp3Players);
	}
	public void clickOnTest4() {
		WebDriverUtility.clickOnElement(test4);
	}
	public void clickOnTest5() {
		WebDriverUtility.clickOnElement(test5);
}
	public void clickOnTest6() {
		WebDriverUtility.clickOnElement(test6);
	}
	public void clickOnTest7() {
		WebDriverUtility.clickOnElement(test7);

	}
	public void clickOnTest8() {
		WebDriverUtility.clickOnElement(test8);
	}
	public void clickOnTest9() {
		WebDriverUtility.clickOnElement(test9);
	}
	public void clickOnTest11() {
		WebDriverUtility.clickOnElement(test11);
	}
	public void clickOnTest12() {
		WebDriverUtility.clickOnElement(test12);
	}
	public void clickOnTest15() {
		WebDriverUtility.clickOnElement(test15);
	}
	public void clickOnTest16() {
		WebDriverUtility.clickOnElement(test16);
	}
	public void clickOnTest17() {
		WebDriverUtility.clickOnElement(test17);
	}
	public void clickOnTest18() {
		WebDriverUtility.clickOnElement(test18);
	}
	public void clickOnTest19() {
		WebDriverUtility.clickOnElement(test19);
	}
	public void clickOnTest20() {
		WebDriverUtility.clickOnElement(test20);
	}
	public void clickOnTest21() {
		WebDriverUtility.clickOnElement(test21);
	}
	public void clickOnTest22() {
		WebDriverUtility.clickOnElement(test22);
	}
	public void clickOnTest23() {
		WebDriverUtility.clickOnElement(test23);
	}
	public void clickOnTest24() {
		WebDriverUtility.clickOnElement(test24);
	}
	
}
