package nirmala.shoeshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import nirmala.shoeshop.browser.Browser;

public class HeaderPage {
	
	int maxSecond = 5000;
	public void SelectSignIn() {
		// TODO Auto-generated method stub
		// Find the sign in button and click it.
		waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"), maxSecond).click();
		
	}
	
	public  WebElement waitForPageUntilElementIsVisible(By locator, int maxSecond){
		return (new WebDriverWait(Browser.Driver(), maxSecond))
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
	} 

}
