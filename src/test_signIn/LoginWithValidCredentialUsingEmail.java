package test_signIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config;
import lov_val.SignInSignup;

public class LoginWithValidCredentialUsingEmail extends Config{
	SignInSignup signin=new SignInSignup();
	
	
	@Test
	public void loginWithValidCredentialUsingEmailTest(){
		System.out.println ("login With Valid Credential Using Email Test start");
		// click on sign in link from header
		clickByXpath (signin.signInLinkLoc);
		// Enter email
		typeByCss (signin.emailLoc, signin.emailValue);
		// click Next button
		clickByXpath (signin.nextButtonLoc);
		// enter password
		typeByXpath (signin.passwordLoc, signin.passValue);
		// click Sign In button
		clickByXpath (signin.signInButtonLoc);
		// Assert --- most important 
		String act = driver.findElement(By.xpath(signin.myActualFullNameLoc)).getText(); 
		// act is coming from Domain -- the one developer build and release
		String exp = "Mahfujur Rahman"; // exp is coming from Requirement or Mock-up
		Assert.assertEquals(act, exp);

	}
}	
}
}
