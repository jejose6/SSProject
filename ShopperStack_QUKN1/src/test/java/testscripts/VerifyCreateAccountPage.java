package testscripts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import element_Repository.CreateAccount;
import element_Repository.CreateAccountPage;
import generic_Library.BaseTest_1;

public class VerifyCreateAccountPage extends BaseTest_1{
	
	@Test
	public void logincreateAccount() throws IOException {
			create_account = new CreateAccount(driver);
			create_account.getCreateAccount().click();
			Reporter.log("Clicked Create Account",true);
			CreateAccountPage create_page= new CreateAccountPage(driver);
			create_page.performCreateAccountPage(dataUtility.getDataFromProperties(fName_key),dataUtility.getDataFromProperties(lName_key),dataUtility.getDataFromProperties(ph_key),dataUtility.getDataFromProperties(eadd_key),dataUtility.getDataFromProperties(passW_key),dataUtility.getDataFromProperties(cPass_key));
			Reporter.log("Entered Create Account fields",true);
				create_page.getTerms().click();
				create_page.getRegister().click();
				Reporter.log("Clicked Register",true);
				utilityMethods.takeScreenshot(driver);
	}
	

}

