package nirmala.shoeshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import nirmala.shoeshop.browser.Browser;

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
		waitForPageUntilElementIsVisible(By.id("email"), maxSecond).sendKeys(username);
		// Find password and put password
		waitForPageUntilElementIsVisible(By.id("passwd"), maxSecond).sendKeys(password);
		// find sign in button and click
		waitForPageUntilElementIsVisible(By.id("SubmitLogin"), maxSecond).click();
		
	}
	
	public  WebElement waitForPageUntilElementIsVisible(By locator, int maxSecond){
		return (new WebDriverWait(Browser.Driver(), maxSecond))
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
	} 
}
