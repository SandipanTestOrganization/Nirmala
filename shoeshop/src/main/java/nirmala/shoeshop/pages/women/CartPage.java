package nirmala.shoeshop.pages.women;

import org.openqa.selenium.By;
import nirmala.shoeshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import nirmala.shoeshop.browser.Browser;
import nirmala.shoeshop.uimap.MenuSelectorLoactors;

public class CartPage {
		
	public static boolean IsAt() {
		return Browser.Driver().getTitle().equals("Order - ShoeFactory");
	}

	public static boolean IsAddedSuccessfully() {
		// TODO Auto-generated method stub
		//return Browser.Driver().(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLoactors.shopping_black_high_heels), 5000));
		return true;
	}
	public static  WebElement waitForPageUntilElementIsVisible(By locator, int maxSecond){
		return (new WebDriverWait(Browser.Driver(), maxSecond))
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
