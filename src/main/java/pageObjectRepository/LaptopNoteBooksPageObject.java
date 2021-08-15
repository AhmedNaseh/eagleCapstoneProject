package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class LaptopNoteBooksPageObject extends Base {

	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement LaptopsAndNoteBookTab;

	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement ShowAllLaptopsAndNotebooks;

	@FindBy(xpath = "//img[@title='Laptops & Notebooks']")
	private WebElement LaptopsAndNoteBookImage;

	@FindBy(xpath = "(//a[text()='Macs (0)'])[1]")
	private WebElement MacRefineSearch;

	@FindBy(xpath = " (//a[text()='Windows (0)'])[1]")
	private WebElement WindowsRefineSearch;

	@FindBy(id = "compare-total")
	private WebElement compareTotal;

	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement SortBy;

	@FindBy(id = "input-limit")
	private WebElement InputLimit;

	@FindBy(xpath = "//a[contains(text(),'Desktops (13)')]")
	private WebElement DeskTopTotal;

	@FindBy(xpath = "//a[contains(text(),'Laptops & Notebooks (5)')]")
	private WebElement LaptopsAndNoteBooksItemList;

	@FindBy(xpath = "//a[contains(text(),'- Macs (0)')]")
	private WebElement MacListItem;

	@FindBy(xpath = "//a[contains(text(),'- Windows (0)')]")
	private WebElement WindowsListItem;

	@FindBy(xpath = "//a[contains(text(),'Components (2)')]")
	private WebElement ComponentsListItem;

	@FindBy(xpath = "//a[contains(text(),'Tablets (1)')]")
	private WebElement TabletListItem;

	@FindBy(xpath = "//a[contains(text(),'Software (0)')]")
	private WebElement SoftwareListItem;

	@FindBy(xpath = "//a[contains(text(),'Phones & PDAs (3)')]")
	private WebElement PhonesAndPDASListItem;

	@FindBy(xpath = "//a[contains(text(),'Cameras (2)')]")
	private WebElement CamerasListItem;

	@FindBy(xpath = "//a[contains(text(),'MP3 Players (4)')]")
	private WebElement Mp3PlayersListItem;

	@FindBy(xpath = "//img[@title='HP LP3065']")
	private WebElement HPLP36065Image;

	@FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
	private WebElement HPLP3065;

	@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
	private WebElement HPLP3065AddToCart;

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement HPLP3065WishList;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement HPLP3065Compare;

	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement MacBookImage;

	@FindBy(linkText = "MacBook")
	private WebElement MacBook;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement MacBookAddToCart;

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement MacBookWishList;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement MacBookCompare;

	@FindBy(xpath = "//img[@title='MacBook Air']")
	private WebElement MacBookAirImage;

	@FindBy(xpath = "//a[contains(text(),'MacBook Air')]")
	private WebElement MacBookAir;

	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement MacBookAirAddToCart;

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[4]")
	private WebElement MacBookAirWishList;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement MacBookAirCompare;

	@FindBy(xpath = "//img[@title='Sony VAIO']")
	private WebElement SonyVaioImage;

	@FindBy(xpath = "//a[contains(text(),'Sony VAIO')]")
	private WebElement SonyVaio;

	@FindBy(xpath = "(//span[text()='Add to Cart'])[4]")
	private WebElement SonyAddToCart;

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[5]")
	private WebElement SonyWishList;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[4]")
	private WebElement SonyCompare;

	@FindBy(xpath = "//img[@title='MacBook Pro']")
	private WebElement SonyProImage;

	@FindBy(xpath = "//a[contains(text(),'MacBook Pro')]")
	private WebElement MacBookPro;

	@FindBy(xpath = "(//span[text()='Add to Cart'])[5]")
	private WebElement MacBookProAddToCart;

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement MacBookProWishList;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[5]")
	private WebElement MackBookProCompare;

	@FindBy(xpath = "//img[@alt='HP Banner']")
	private WebElement HpBanner;

	@FindBy(xpath = "//a[contains(text(),'shopping cart')]")
	private WebElement SuccessMessage;

	@FindBy(xpath = "//*[@id='cart-total']")
	private WebElement cartTotal;

	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement XRemoveButton;

	@FindBy(xpath = "//a[contains(text(),'product comparison')]")
	private WebElement ComparisonLink;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement SucessMessageCompare;

	@FindBy(xpath = "//img[@title='MacBook Pro']")
	private WebElement MacBookProImage;

	@FindBy(xpath = "//div[@id='content']")
	private WebElement ChartComparison;

	@FindBy(xpath = "//a[contains(text(),'wish list')]")
	private WebElement MessageWishList;

	@FindBy(xpath = "//h2[contains(text(),'$2,000.00')]")
	private WebElement tagPriceOfMacIsDisplayed;

	public void clickonLaptopAndNoteBookTab() {
		WebDriverUtility.clickOnElement(LaptopsAndNoteBookTab);
	}

	public void clickOnShowAllLaptopsAndNoteBooks() {
		WebDriverUtility.clickOnElement(ShowAllLaptopsAndNotebooks);
	}

	public void clickOnMacBookItem() {
		WebDriverUtility.clickOnElement(MacBook);
	}

	public void clickOnAddToCartMacBook() {
		WebDriverUtility.clickOnElement(MacBookAddToCart);
	}

	public void VerifyMessageIsDisplayed() {
		WebDriverUtility.isElementDisplayed(SuccessMessage);

	}

	public String verifyCartTotal() {
		return cartTotal.getText();
	}

	public void clickOnCartTotal() {
		WebDriverUtility.clickOnElement(cartTotal);
	}

	public void clickOnRemoveButton() {
		WebDriverUtility.clickOnElement(XRemoveButton);

	}

	public void clickOnCompareMacBook() {
		WebDriverUtility.clickOnElement(MacBookCompare);

	}

	public void clickOnMacBookAirCompare() {
		WebDriverUtility.clickOnElement(MacBookAirCompare);
	}

	public String SuccessCompareMacBookAir() {
		String actual = SucessMessageCompare.getText().substring(0, 7);
		return actual;

	}

	public void clickOnCompareLink() {
		WebDriverUtility.clickOnElement(ComparisonLink);
	}

	public void verifyChartComparison() {
		WebDriverUtility.isElementDisplayed(ChartComparison);
	}

	public void clickOnSonyVaioWishList() {
		WebDriverUtility.clickOnElement(SonyWishList);
	}

	public String verifyLoginMessageIsDisplayed() {
		return MessageWishList.getText();
	}


	public void clickOnMacBookPro() {
		WebDriverUtility.clickOnElement(MacBookProImage);
	}

	public void tagPriceOfMacIsDisplayed() {
		// return tagPriceOfMacIsDisplayed.getText();
		WebDriverUtility.isElementDisplayed(tagPriceOfMacIsDisplayed);
	}
}




