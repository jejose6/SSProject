package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditProfilePage extends BasePage{

	public EditProfilePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@id='First Name']")
	private WebElement firstName;
	@FindBy(xpath="//input[@id='Last Name']")
	private WebElement lastName;
	@FindBy(xpath="//input[@id=':rj:']")
	private WebElement dateOfBirth;
	@FindBy(xpath="//input[@id='Phone Number']")
	private WebElement phoneNo;
	@FindBy(xpath="//select[@id='Country']")
	private WebElement country;
	@FindBy(xpath="//select[@id='State']")
	private WebElement state;
	@FindBy(xpath="//select[@id='City']")
	private WebElement city;
	@FindBy(xpath="//button[@id='submit']")
	private WebElement submit;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getDateOfBirth() {
		return dateOfBirth;
	}
	public WebElement getPhoneNo() {
		return phoneNo;
	}
	public WebElement getCountry(String country_1) {
		Select coun= new Select(country);
		coun.selectByVisibleText(country_1);
		return country;
	}
	public WebElement getState(String state_1) {
		Select stat = new Select(state);
		stat.selectByVisibleText(state_1);
		return state;
	}
	public WebElement getCity(String city_1) {
		Select cit = new Select(city);
		cit.selectByVisibleText(city_1);
		return city;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
		
	public void performEditProfilePage_1(String fNam, String lNam, String dob,String phNo) {
		getFirstName().sendKeys(fNam);
		getLastName().sendKeys(lNam);
		getDateOfBirth().sendKeys(dob);
		getPhoneNo().sendKeys(phNo);
		getSubmit().click();
	}
	
}
