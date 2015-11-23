package nirmala.shoeshop.pages;

import org.openqa.selenium.By;
import nirmala.shoeshop.utility.Utility;

public class MyAccountPage {
	
	static int maxSecond = 5000;

	public static String IsAbleToLoginAs() {
		// TODO Auto-generated method stub		
		return Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"), maxSecond).getText();
	}
	
	
	public static void Signout() {
		// TODO Auto-generated method stub
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a"), maxSecond).click();
	}
	
}
