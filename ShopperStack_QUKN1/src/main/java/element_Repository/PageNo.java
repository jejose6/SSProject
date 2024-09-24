package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageNo extends BasePage {

	public PageNo(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//button[@aria-label='Go to page 2']")
	private WebElement page_1;
	
	public WebElement getPageNo() {
		return page_1;
	}
	public void performPageNo() {
		getPageNo().click();
	}

}
