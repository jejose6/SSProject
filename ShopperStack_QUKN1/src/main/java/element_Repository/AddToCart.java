package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends BasePage {

	public AddToCart(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="(//button[text()='add to cart'])[1]")
	private WebElement pumaTshirt;
	
	@FindBy(xpath="(//button[text()='add to cart'])[4]")
	private WebElement nikeSneaker;
	
	@FindBy(xpath="//a[text()='Home']")
	private WebElement home;
	public WebElement getHome() {
		return home;
	}
	public WebElement getPumaTshirt() {
		return pumaTshirt;
	}
	public WebElement getNikeSneaker() {
		return nikeSneaker;
	}
}
