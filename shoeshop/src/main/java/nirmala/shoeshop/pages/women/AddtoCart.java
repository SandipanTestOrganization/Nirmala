package nirmala.shoeshop.pages.women;

import org.openqa.selenium.By;
import nirmala.shoeshop.utility.Utility;
import org.openqa.selenium.interactions.Actions;
import nirmala.shoeshop.browser.Browser;
import nirmala.shoeshop.uimap.MenuSelectorLoactors;


public class AddtoCart {
	static int maxSecond = 5000;
	static Actions add_to_cart = null;

	public void ContinueShopping() {
		add_to_cart = new Actions(Browser.Driver());
	    add_to_cart.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLoactors.women_black_high_heels), maxSecond)).build().perform();
		add_to_cart.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLoactors.women_black_high_heels_addToCart), maxSecond)).click().build().perform();
		add_to_cart.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLoactors.women_black_high_heels_continueShopping), maxSecond)).click().build().perform();
	} 
	
	public void ProceedToCheckOut(){
		add_to_cart = new Actions(Browser.Driver());
	    add_to_cart.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLoactors.women_black_high_heels), maxSecond)).build().perform();
		add_to_cart.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLoactors.women_black_high_heels_addToCart), maxSecond)).click().build().perform();
		String heels = "Black Heels";
		add_to_cart.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLoactors.women_black_high_heels_proceed), maxSecond)).click().build().perform();	
		String heel = Browser.Driver().findElement(By.xpath(MenuSelectorLoactors.shopping_black_high_heels)).getText();
		System.out.println(heels);
		System.out.println(heel);           
	}
}
