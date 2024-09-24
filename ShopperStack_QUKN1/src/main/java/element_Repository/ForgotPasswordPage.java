package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage{

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//input[@id='email']")
	private WebElement femail;
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceed;
	public WebElement getEmail() {
		return femail;
	}
	public WebElement getProceed() {
		return proceed;
	}
	public void performForgotPasswordPage(String emailId) {
		
		getEmail().sendKeys(emailId);
		getProceed().click();

}
}