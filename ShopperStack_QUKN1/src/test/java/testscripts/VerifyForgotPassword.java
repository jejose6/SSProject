package testscripts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import element_Repository.ForgotPassword;
import generic_Library.BaseTest;

public class VerifyForgotPassword extends BaseTest {
	@Test
	public void forgotPasswordTestCase() throws IOException {
		ForgotPassword f_pass= new ForgotPassword(driver);
		f_pass.getForgotPassword().click();
		Reporter.log("Clicked Forgot Password",true);
		//f_pass.performForgotPassword(data_Utility.getDataFromProperties(emailId_key));
		//Reporter.log("Entered email",true);
		utility_Methods.takeScreenshot(driver);
	}

}
