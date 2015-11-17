package nirmala.shoeshop.smoketest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import nirmala.shoeshop.browser.Browser;
//import junit.framework.Assert;
import nirmala.shoeshop.pages.HomePage;
import nirmala.shoeshop.pages.MyAccountPage;
import nirmala.shoeshop.pages.SignInPage;


public class SigninSignOutTest {

	@Before
	public void Init()
	{
		Browser.Open();
	}
	
	@After
	public void Cleanup(){
		//Browser.Close();
	}
	
	@Test
	public void Can_Signin_And_SignOut()
	{
		HomePage.GoTo();
		HomePage.Header().SelectSignIn();
		SignInPage.LoginAs("sandipan@proconstructor.com").WithPassword("password12!@").Login();
		Assert.assertEquals("Sandipan Pramanik", MyAccountPage.IsAbleToLoginAs());
		MyAccountPage.Signout();
		Assert.assertTrue(SignInPage.IsAtSignInPage());
	}	
}
