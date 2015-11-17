package nirmala.shoeshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import nirmala.shoeshop.browser.Browser;

public class MyAccountPage {
	
	static int maxSecond = 5000;

	public static String IsAbleToLoginAs() {
		// TODO Auto-generated method stub		
		return waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"), maxSecond).getText();
	}
	
	
	public static void Signout() {
		// TODO Auto-generated method stub
		waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a"), maxSecond).click();
	}
	
	public static  WebElement waitForPageUntilElementIsVisible(By locator, int maxSecond){
		return (new WebDriverWait(Browser.Driver(), maxSecond))
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
	} 
}
