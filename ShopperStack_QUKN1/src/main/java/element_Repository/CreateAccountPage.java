package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage {

	public CreateAccountPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@id='First Name']")
	private WebElement first_name;
	@FindBy(xpath="//input[@id='Last Name']")
	private WebElement last_name;
	@FindBy(xpath="//input[@id='Phone Number']")
	private WebElement ph_no;
	@FindBy(xpath="//input[@id='Email Address']")
	private WebElement e_add;
	@FindBy(xpath="//input[@id='Password']")
	private WebElement pass;
	@FindBy(xpath="//input[@id='Confirm Password']")
	private WebElement c_pass;
	@FindBy(xpath="//span[@class='MuiIconButton-label']")
	private WebElement terms;
	@FindBy(xpath="//button[@id='Register']")
	private WebElement register;
	
	public WebElement getFirstName() {
		return first_name;
	}
	public WebElement getLastName() {
		return last_name;
	}
	public WebElement getPh_NO() {
		return ph_no;
	}
	public WebElement getE_Add() {
		return e_add;
	}
	public WebElement getPassword() {
		return pass;
	}
	public WebElement getConfirmPassword() {
		return c_pass;
	}
	public WebElement getTerms() {
		return terms;
	}
	public WebElement getRegister() {
		return register;
	}
public void performCreateAccountPage(String fName,String lName,String ph, String eadd,String passW, String cPass) {
		
		
		getFirstName().sendKeys(fName);
		getLastName().sendKeys(lName);
		getPh_NO().sendKeys(ph);
		getE_Add().sendKeys(eadd);
		getPassword().sendKeys(passW);
		getConfirmPassword().sendKeys(cPass);
		getTerms().click();
		getRegister().click();
}		

}
