package testscripts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import element_Repository.CreateAccount;

import generic_Library.BaseTest_1;

public class VerifyCreateAccountIsClicable extends BaseTest_1{
	@Test
	public void loginPageTestCase() throws IOException {
		create_account = new CreateAccount(driver);
		create_account.getCreateAccount().click();
		Reporter.log("Clicked Create Account",true);
		//create_account.performCreateAccount(dataUtility.getDataFromProperties(fName_key),dataUtility.getDataFromProperties(lName_key),dataUtility.getDataFromProperties(ph_key),dataUtility.getDataFromProperties(eadd_key),dataUtility.getDataFromProperties(passW_key),dataUtility.getDataFromProperties(cPass_key));
		//create_account.getTerms().click();
		//create_account.getRegister().click();
		utilityMethods.takeScreenshot(driver);
		//System.out.println("Test Case 01");
		//test.log(Status.PASS, "Test Case 01");
		//test.addScreenCaptureFromPath(utilityMethods.takeScreenshot(driver), "Test Case 01");
	}
	}


