package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveCartPopup extends BasePage{

	public RemoveCartPopup(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//div[@class='MuiBox-root css-r50fnm']")
	private WebElement popup;
	@FindBy(xpath="//button[text()='Yes']")
	private WebElement yes;
	public WebElement getYes() {
		return yes;
	}
	public WebElement getPopup() {
		return popup;
	}
}
