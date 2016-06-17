package nirmala.shoeshop.pages;

import org.openqa.selenium.By;
import nirmala.shoeshop.utility.Utility;

public class HeaderPage {
	
	int maxSecond = 5000;
	public void SelectSignIn() {
		// TODO Auto-generated method stub
		// Find the sign in button and click it.
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"), maxSecond).click();		
	}
	
}
