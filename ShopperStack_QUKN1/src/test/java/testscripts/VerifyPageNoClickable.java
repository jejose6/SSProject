package testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import element_Repository.PageNo;
import generic_Library.BaseTest;
import generic_Library.SelectClassUtility;

public class VerifyPageNoClickable extends BaseTest {
	@Test
	public void pageNoClickable() {
		PageNo p_no= new PageNo(driver);
		p_no.getPageNo().click();
		Reporter.log("Clicked Page no. 2",true);
		
		utility_Methods.takeScreenshot(driver);
		
	}

}
