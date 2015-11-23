package nirmala.shoeshop.pages.women;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import nirmala.shoeshop.browser.Browser;
import nirmala.shoeshop.utility.Utility;

public class HighHeelsPage {
	
	static int maxSecond = 5000;
	static Actions add_to_cart = null;
	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("High Heels - ShoeFactory");
	}

	public static void AddToCart(String heels) {
		
		String heel = Browser.Driver().findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5/a")).getText();
		if(heels.equals(heel))
		{
			add_to_cart = new Actions(Browser.Driver());
		    add_to_cart.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5/a"), maxSecond)).build().perform();
			add_to_cart.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[1]/span"), maxSecond)).click().build().perform();
			add_to_cart.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span/span"), maxSecond)).click().build().perform();
			//add_to_cart.moveToElement(Utility.waitForPageUntilElementIsVisible(locator, maxSecond))
		}
	}	
	public static BlackHeelsPage BlackHeelsPage() {
		return new BlackHeelsPage();
	}
}
