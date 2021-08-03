
package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class ComponentsPageObject extends Base {
	public ComponentsPageObject() {
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "//a[text()='Components']")
	private WebElement components;
	
	@FindBy(xpath = "//a[contains(text(),'Mice and Trackballs (0)')]")
	private WebElement mice;
	
	@FindBy(xpath = "//a[contains(text(), 'Monitors (2)')]")
	private WebElement monitors;
	
	@FindBy(xpath = "//a[contains(text(),'Printers (0)')]")
	private WebElement printer;
	
	@FindBy(xpath = "//a[contains(text(),'Scanners (0)')]")
	private WebElement scanners;
	
	@FindBy(xpath = "//a[contains(text(),'Web Cameras (0)')]")
	private WebElement webcameras;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Components')]")
	private WebElement show;
	
	public void clickOnComponents() {
		WebDriverUtility.clickOnElement(components);
	}
	public void clickOnMiceAndTrackballs() {
		WebDriverUtility.clickOnElement(mice);
	}
	public void clickOnMonitors() {
		WebDriverUtility.clickOnElement(monitors);
	}
	public void clickOnPrinter() {
		WebDriverUtility.clickOnElement(printer);
	}
	public void clickOnScanners() {
		WebDriverUtility.clickOnElement(scanners);
	}
	
	public void clickOnWebCammera() {
		WebDriverUtility.clickOnElement(webcameras);
	}
	public void clickOnShowAllComponents() {
		WebDriverUtility.clickOnElement(show);
	}
	
}
