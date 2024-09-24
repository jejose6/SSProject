package testscripts;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import element_Repository.AccountSettingsListBox;
import element_Repository.BasePage;
import element_Repository.EditProfilePage;
import element_Repository.MyProfile;
import generic_Library.BaseTest;
import generic_Library.SelectClassUtility;

public class VerifyEditProfilePage extends BaseTest {
	@Test
	public void editProfileTestCase() throws IOException {
		base_Page.getAccountButton().click();
		AccountSettingsListBox liBox= new AccountSettingsListBox(driver);
		liBox.getMyProfile().click();;
		Reporter.log("Clicked MyProfile",true);
		MyProfile myProfile = new MyProfile(driver);
		myProfile.getEditProfile().click();
		EditProfilePage editpage = new EditProfilePage(driver);
		editpage.getCountry(data_Utility.getDataFromProperties(country_key)).click();
		editpage.getState(data_Utility.getDataFromProperties(state_key)).click();
		editpage.getCity(data_Utility.getDataFromProperties(city_key)).click();
		Reporter.log("Selected Country",true);
		//editpage.getSubmit().click();
		//Reporter.log("Clicked Submit",true);
		//utility_Methods.acceptAlert(driver);
		utility_Methods.takeScreenshot(driver);
		
	}

}
