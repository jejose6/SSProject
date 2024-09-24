package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	@FindBy(id="loginBtn")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[@id='men']")
	private WebElement menLink;
	
	@FindBy(xpath="//a[@id='women']")
	private WebElement womenLink;
	
	@FindBy(xpath="//a[@id='electronics']")
	private WebElement electronics;
	
	@FindBy(xpath = "//button[@aria-label='Account settings']")
	private WebElement accountButton;
	
	@FindBy(xpath="//a[@id='cart']")
	private WebElement cart;
	
	@FindBy(xpath="//li[text()='Logout']")
	private WebElement logoutButton;
	
	@FindBy(xpath="//div[@class='chatbot-items']")
	private WebElement chat;

	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getMenLink() {
		return menLink;
	}
	
	public WebElement getWomenLink() {
		return womenLink;
	}

	public WebElement getElectronics() {
		return electronics;
	}

	public WebElement getAccountButton() {
		return accountButton;
	}
	public WebElement getCart() {
		return cart;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	public WebElement getChat() {
		return chat;
	}

	
	public void performLogout() {
		
		getAccountButton().click();
		getLogoutButton().click();

	}
	
	
	
	
}
