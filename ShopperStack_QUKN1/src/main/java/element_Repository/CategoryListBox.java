package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryListBox extends BasePage{

	public CategoryListBox(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[text()='T-shirts']")
	private WebElement menTshirt;
	@FindBy(xpath="//a[text()='Shirts']")
	private WebElement shirts;
	@FindBy(xpath="//a[text()='Cameras ']")
	private WebElement cameras;
	@FindBy(xpath="//a[text()='Ethnic Wear']")
	private WebElement ethnicWear;
	public WebElement getMenTshirt() {
		return menTshirt;
	}
	public WebElement getShirts() {
		return shirts;
	}
	public WebElement getEthnicWear() {
		return ethnicWear;
	}
}
