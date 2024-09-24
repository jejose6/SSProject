package testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import element_Repository.AddToCart;
import element_Repository.BasePage;
import element_Repository.CategoryListBox;
import generic_Library.BaseTest;

public class VerifyAddToCart extends BaseTest{
	@Test
	public void addToCartTestCase() {
		
		base_Page.getMenLink().click();
		
		CategoryListBox category_list = new CategoryListBox(driver);
		category_list.getMenTshirt().click();
		
		AddToCart add_cart= new AddToCart(driver);
		add_cart.getNikeSneaker().click();
		
		Reporter.log("Clicked pumaTShirt", true);
		
		add_cart.getHome().click();
		
		base_Page.getWomenLink().click();
		Reporter.log("Clicked Women", true);
		
		category_list.getEthnicWear().click();
		add_cart.getNikeSneaker().click();
		utility_Methods.takeScreenshot(driver);
	}

}
