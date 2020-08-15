package test_signIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config;
import lov_val.SignInSignup;

public class LoginWithInValidCredentialUsingEmail extends Config{
	SignInSignup signin=new SignInSignup();
	
	
	@Test
	public void loginWithValidCredentialUsingEmailTest(){
		System.out.println ("login With Valid Credential Using Email Test start");
		
		// click on account link from header
		clickByXpath (signin.accountlinkloc);
		
		// click on Sign In link
		clickByXpath (signin.signinlinkloc);
		
		// enter email
		typeByXpath (signin.emailloc, signin.invemailval);
		
		// enter password
		typeByXpath (signin.passloc, signin.passval);
		
		// click Sign In button
		clickByXpath (signin.signbuttonloc);
		
		// Assert
		// click on account link from header
		clickByXpath (signin.accountlinkloc);
		String act = driver.findElement(By.xpath(signin.myactualnameloc)).getText(); 
		// act is coming from Domain -- the one developer build and release
		String exp = "Mahfujur R."; // exp is coming from Requirement or Mock-up
		Assert.assertEquals(act, exp);

	}
}
