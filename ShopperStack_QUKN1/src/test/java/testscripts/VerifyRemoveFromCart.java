package testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import element_Repository.AddToCart;
import element_Repository.BasePage;
import element_Repository.CategoryListBox;
import element_Repository.RemoveCartPopup;
import element_Repository.ShoppingCart;
import generic_Library.BaseTest;

public class VerifyRemoveFromCart extends BaseTest {
	@Test
	public void shoppingCartTestCase() {
		base_Page.getMenLink().click();
		
		CategoryListBox category_list = new CategoryListBox(driver);
		//category_list.getMenTshirt().click();
		
		AddToCart add_cart= new AddToCart(driver);
		add_cart.getPumaTshirt().click();
		add_cart.getNikeSneaker().click();
		
		Reporter.log("Clicked pumaTShirt", true);
		
		add_cart.getHome().click();
		
		base_Page.getWomenLink().click();
		Reporter.log("Clicked Women", true);
		
		category_list.getEthnicWear().click();
		add_cart.getNikeSneaker().click();
		//base_Page = new BasePage(driver);
		base_Page.getCart().click();
		Reporter.log("Clicked Shopping Cart", true);
		ShoppingCart shCart = new ShoppingCart(driver);
		
		shCart.getRemoveFromCart_1().click();
		Reporter.log("Clicked remove from Cart -1 ", true);
		 
		RemoveCartPopup rcpopup= new RemoveCartPopup(driver);
		rcpopup.getPopup().click();
		rcpopup.getYes().click();
		
		//shCart.getRemoveFromCart_3().click();
		//Reporter.log("Clicked remove from Cart -2 ", true);
		utility_Methods.takeScreenshot(driver);
	}
		
	

}
