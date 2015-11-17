package nirmala.shoeshop.pages;

import nirmala.shoeshop.browser.Browser;

public class SignInPage {
	
	//public static String username;
		//public static String password;
	public static String signInPageTitle = "Login - ShoeFactory";
		public static SignInCommands LoginAs(String username) {
			SignInCommands signinCmd = new SignInCommands(username);
			return signinCmd;	
			
		}

		public static boolean IsAtSignInPage() {
			// TODO Auto-generated method stub
			return Browser.driver.getTitle().equals(signInPageTitle);
		}
		
}
