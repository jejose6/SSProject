package testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import element_Repository.AccountSettingsListBox;
import element_Repository.BasePage;
import element_Repository.MyLikes;
import element_Repository.MyProfile;
import generic_Library.BaseTest;

public class VerifyMyLikes extends BaseTest{
	@Test
	
	public void myLikesTestCase() throws EncryptedDocumentException, IOException {
		base_Page.getAccountButton().click();
		AccountSettingsListBox acListbox = new AccountSettingsListBox(driver);
		acListbox.getMyProfile().click();
		MyProfile myLikes = new MyProfile(driver);
		myLikes.getMyLikes().click();
		Reporter.log("Clicked my likes",true);
		MyLikes category= new MyLikes(driver);
		//category.getCategory(data_Utility.getDataFromExcel("Sheet1", 1,2)).click();
		//category.getSubCategory(data_Utility.getDataFromExcel("Sheet1", 2, 2)).click();;
		//category.getCategory(data_Utility.getDataFromProperties(category_key)).click();
		//Reporter.log("Took data 1",true);
		//category.getSubCategory(data_Utility.getDataFromProperties(subcategory_key)).click();
		//Reporter.log("Took data 2",true);
		category.getCategory().click();
		category.getSubCategory().click();
		category.getSubmit().click();
		utility_Methods.takeScreenshot(driver);
	}

}
