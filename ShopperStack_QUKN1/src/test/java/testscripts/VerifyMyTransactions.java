package testscripts;

import org.testng.annotations.Test;

import element_Repository.AccountSettingsListBox;
import element_Repository.BasePage;
import element_Repository.MyProfile;
import element_Repository.MyWalletPage;
import generic_Library.BaseTest;

public class VerifyMyTransactions extends BaseTest {
	@Test
	
	public void myTransationTestCase() {
		base_Page.getAccountButton().click();
		AccountSettingsListBox list = new AccountSettingsListBox(driver);
		list.getMyProfile().click();
		MyProfile wallet = new MyProfile(driver);
		wallet.getMyWallet().click();
		MyWalletPage transaction = new MyWalletPage(driver);
		transaction.getViewTransactions().click();
		utility_Methods.takeScreenshot(driver);
		
		
	}

}
