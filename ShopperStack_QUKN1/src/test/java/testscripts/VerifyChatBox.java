package testscripts;

import org.testng.annotations.Test;

import generic_Library.BaseTest;

public class VerifyChatBox extends BaseTest{
	@Test
	
	public void chatBox() {
		base_Page.getChat().click();
		utility_Methods.takeScreenshot(driver);
		
	}

}
