package testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import element_Repository.BasePage;
import element_Repository.ShoppingCart;
import generic_Library.BaseTest;

public class VerifyContinueShoppingButton extends BaseTest{
	@Test
	
	public void ContinueshoppingTestCase() {
		base_Page.getCart().click();
		Reporter.log("Clicked Shopping cart", true);
		ShoppingCart cart = new ShoppingCart(driver);
		cart.getContinueShopping().click();
		Reporter.log("Clicked Continue Shopping", true);
		utility_Methods.takeScreenshot(driver);
	}

}
