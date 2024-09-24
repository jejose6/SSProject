package testscripts;

import org.testng.annotations.Test;

import element_Repository.BasePage;
import element_Repository.ShoppingCart;
import generic_Library.BaseTest;

public class VerifyBuyNow extends BaseTest{
	@Test
	
	public void buyNowTestCase() {	
		base_Page.getCart().click();
		ShoppingCart cart = new ShoppingCart(driver);
		cart.getBuyNow().click();
		utility_Methods.takeScreenshot(driver);
		
	}

}
