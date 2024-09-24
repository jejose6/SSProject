package testscripts;

import org.testng.annotations.Test;

import element_Repository.AccountSettingsListBox;
import element_Repository.BasePage;
import element_Repository.MyProfile;
import generic_Library.BaseTest;

public class VerifyMyWallet extends BaseTest {
	@Test
	
	public void myWallet() {
		base_Page.getAccountButton().click();
		AccountSettingsListBox acListBox= new AccountSettingsListBox(driver);
		acListBox.getMyProfile().click();
		MyProfile wallet = new MyProfile(driver);
		wallet.getMyWallet().click();
		utility_Methods.takeScreenshot(driver);
		
	}

}
