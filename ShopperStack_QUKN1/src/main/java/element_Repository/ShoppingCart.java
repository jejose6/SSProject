package element_Repository;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends BasePage {

	public ShoppingCart(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="(//button[text()='Remove from cart'])[1]")
	private WebElement removeFromCart_1;
	@FindBy(xpath="(//button[text()='Remove from cart'])[2]")
	private WebElement removeFromCart_2;
	@FindBy(xpath="(//button[text()='Remove from cart'])[3]")
	private WebElement removeFromCart_3;
	@FindBy(xpath="//button[@id='buynow_fl']")
	private WebElement buyNow;
	@FindBy(xpath="//span[text()='Continue Shopping']")
	private WebElement continueShopping;
	
	
	
	
	public WebElement getRemoveFromCart_1() {
		return removeFromCart_1;
	}
	public WebElement getRemoveFromCart_2() {
		return removeFromCart_2;
	}
	public WebElement getRemoveFromCart_3() {
		return removeFromCart_3;
	}
	public WebElement getBuyNow() {
		return buyNow;
	}
	public WebElement getContinueShopping() {
		return continueShopping;
	}
	

}
