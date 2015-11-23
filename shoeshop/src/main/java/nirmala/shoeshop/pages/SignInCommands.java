package nirmala.shoeshop.pages;

import org.openqa.selenium.By;
import nirmala.shoeshop.utility.Utility;

public class SignInCommands {

	public String username;
	public String password;
	int maxSecond = 5000;
	
	public SignInCommands(String username){
		this.username = username;
	}
	public SignInCommands WithPassword(String password ){
		this.password = password;
		return this;
	}

	public void Login() {
		// TODO Auto-generated method stub
		//Find username and put username
		Utility.waitForPageUntilElementIsVisible(By.id("email"), maxSecond).sendKeys(username);
		// Find password and put password
		Utility.waitForPageUntilElementIsVisible(By.id("passwd"), maxSecond).sendKeys(password);
		// find sign in button and click
		Utility.waitForPageUntilElementIsVisible(By.id("SubmitLogin"), maxSecond).click();
		
	}
}
