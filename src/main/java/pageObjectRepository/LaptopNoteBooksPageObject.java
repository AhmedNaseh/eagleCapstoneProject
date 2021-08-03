package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class LaptopNoteBooksPageObject extends Base{

	
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
		private WebElement lapTopsNoteBooks;
	
		@FindBy(xpath = "//a[contains(text(),'Macs (0)')]")
		private WebElement macs;
		
		@FindBy(xpath = "//a[text()='Windows (0)']")
		private WebElement window;
		
		@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
		private WebElement showAllLaptopsNote;
		
		public void clickOnLaptopNoteBook() {
			WebDriverUtility.clickOnElement(lapTopsNoteBooks);
		}
			
		public void clickOnMacs() {
			WebDriverUtility.clickOnElement(macs);

		}
		public void clickOnWindows() {
			WebDriverUtility.clickOnElement(window);
		}	
		public void clickOnShowAllLaptopsNotebook() {
			WebDriverUtility.clickElementWithJS(showAllLaptopsNote);
		}
		

}
