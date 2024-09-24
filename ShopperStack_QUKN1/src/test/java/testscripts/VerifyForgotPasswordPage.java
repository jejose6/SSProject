package testscripts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import element_Repository.ForgotPassword;
import element_Repository.ForgotPasswordPage;
import generic_Library.BaseTest;

public class VerifyForgotPasswordPage extends BaseTest{
	@Test
	public void forgotPasswordpageTestCase() throws IOException {
		ForgotPassword f_pass= new ForgotPassword(driver);
		f_pass.getForgotPassword().click();
		Reporter.log("Clicked Forgot Password",true);
		ForgotPasswordPage fpage_pass = new ForgotPasswordPage(driver);
		fpage_pass.performForgotPasswordPage(data_Utility.getDataFromProperties(emailId_key));
		Reporter.log("Entered email",true);
		fpage_pass.getProceed().click();
		Reporter.log("Clicked Proceed",true);
		utility_Methods.takeScreenshot(driver);
	}

}
