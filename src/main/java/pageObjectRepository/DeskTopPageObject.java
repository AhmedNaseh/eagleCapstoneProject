package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class DeskTopPageObject extends Base {
	

	public DeskTopPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/a")
	private WebElement deskTop;
	
	@FindBy(xpath = "//a[contains(text(),'PC (0)')]")
	private WebElement pc;
	
	@FindBy(xpath = "//a[contains(text(),'Mac (1)')]")
	private WebElement mac;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAll;
	
	public void clickOnDeskTop() {
		WebDriverUtility.clickOnElement(deskTop);
	}
	public void clickOnPc() {
		WebDriverUtility.clickOnElement(pc);	
	}
	public void clickOnMac() {
		WebDriverUtility.clickOnElement(mac);
	}
	public void clickOnShowAllDeskTops() {
		WebDriverUtility.clickOnElement(showAll);
	}
	
	
}
