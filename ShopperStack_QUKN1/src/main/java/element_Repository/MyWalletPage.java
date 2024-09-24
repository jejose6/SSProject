package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWalletPage extends BasePage {

	public MyWalletPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//button[text()='Add Money']")
	private WebElement addMoney;
	@FindBy(xpath="//button[text()='Use Coupon']")
	private WebElement useCoupon;
	@FindBy(xpath="//button[text()='View Transactions']")
	private WebElement viewTransactions;
	public WebElement getAddMoney() {
		return addMoney;
	}
	public WebElement getUseCoupon() {
		return useCoupon;
	}
	public WebElement getViewTransactions() {
		return viewTransactions;
	}
	

}
