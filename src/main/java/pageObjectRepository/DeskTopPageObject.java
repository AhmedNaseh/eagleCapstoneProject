package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class DeskTopPageObject extends Base{
	
	public DeskTopPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement deskTop;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAll;
	
	@FindBy(xpath = "//a[contains(text(),'PC (0)')]")
	private WebElement pc;
	
	@FindBy(xpath = "//a[contains(text(),'Mac (1)')]")
	private WebElement mac;
	
	
	
	public void clickOnDeskTopTab() {
		WebDriverUtility.clickOnElement(deskTop);
	}
	
	public void clickOnShowAllDeskTops() {
		WebDriverUtility.clickOnElement(showAll);
	}
	
	
	public void clickOnPc() {
		WebDriverUtility.clickOnElement(pc);	
	}
	public void clickOnMac() {
		WebDriverUtility.clickOnElement(mac);
	}

	
	
}
