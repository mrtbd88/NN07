package test_signIn;

import org.testng.annotations.Test;

import base.Config;
import lov_val.SignInSignup;

public class ContactwithWalmart extends Config{
	SignInSignup signin=new SignInSignup();
	
	
	
	
	@Test
	public void gettextofcontact(){
		System.out.println ("login With Valid Credential Using Email Test start");
		
		// click on account link from header
		clickByXpath (signin.accountlinkloc);
		//click on help link
		clickByXpath (signin.helplinkloc);
		//click on contact us button
		clickByXpath (signin.contactusbuttonloc);
		
		
		
	}

}
