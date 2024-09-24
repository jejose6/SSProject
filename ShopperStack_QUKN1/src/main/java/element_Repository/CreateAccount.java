package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount extends BasePage {

	public CreateAccount(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//button[@id='Create Account']")
	private WebElement createAccount;
	
	
	
	public WebElement getCreateAccount() {
		return createAccount;	
	}
	
	
	public void performCreateAccount() {
		
		getCreateAccount().click();
		
		
		
		
	}
	

}
