package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPassword extends BasePage{
	
	@FindBy(xpath="//a[@id='Forgot Password?']")
	private WebElement forgotPass;
	
	
	public ForgotPassword(WebDriver driver) {
		super(driver);	
	}
	public WebElement getForgotPassword() {
		return forgotPass;
	}
	
	
	public void performForgotPassword() {
		getForgotPassword().click();
		
	}
		
		
	}


