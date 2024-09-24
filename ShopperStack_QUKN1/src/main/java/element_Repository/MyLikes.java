package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MyLikes extends BasePage {

	public MyLikes(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//select[@id='Category']")
	private WebElement category;
	@FindBy(xpath="//select[@id='Category Type']")
	private WebElement subCategory;
	@FindBy(xpath="//button[@id='Submit']")
	private WebElement submit;
	
	public WebElement getCategory() {
		Select cat = new Select(category);
		cat.selectByVisibleText("Kids");
		return category;
	}
	public WebElement getSubCategory() {
		Select subcat= new Select(subCategory);
		subcat.selectByVisibleText("Boys Shirt");
		return subCategory;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
}
