package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfile extends BasePage{

	public MyProfile(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//div[text()='My Profile']")
	private WebElement myProfile;
	@FindBy(xpath="//div[text()='My Addresses']")
	private WebElement myAddress;
	@FindBy(xpath="//div[text()='My Wallet']")
	private WebElement myWallet;
	@FindBy(xpath="//div[text()='My Likes']")
	private WebElement myLikes;
	@FindBy(xpath="//button[text()='Edit Profile   ']")
	private WebElement editProfile;
	
	
	public WebElement getMyProfile() {
		return myProfile;
	}
	public WebElement getMyAddress() {
		return myAddress;
	}
	public WebElement getMyWallet() {
		return myWallet;
	}
	public WebElement getMyLikes() {
		return myLikes;
	}
	public WebElement getEditProfile() {
		return editProfile;
	}
	
	
	

}
