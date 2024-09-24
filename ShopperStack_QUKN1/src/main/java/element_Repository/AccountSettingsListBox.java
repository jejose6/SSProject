package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSettingsListBox extends BasePage {

	public AccountSettingsListBox(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myProfile;
	@FindBy(xpath="//li[text()='Wish List']")
	private WebElement wishList;
	@FindBy(xpath="//li[text()='My Orders']")
	private WebElement myOrders;
	@FindBy(xpath="//li[text()='My Wallet']")
	private WebElement myWallet;
	@FindBy(xpath="//li[text()='My Likes']")
	private WebElement myLikes;
	public WebElement getMyProfile() {
		return myProfile;
	}
	public WebElement getMyOrders() {
		return myOrders;
	}
	public WebElement getMyWallet() {
		return myWallet;
	}
	public WebElement getMyLikes() {
		return myLikes;
	}
	public WebElement getWishList() {
		return wishList;
	}

}
