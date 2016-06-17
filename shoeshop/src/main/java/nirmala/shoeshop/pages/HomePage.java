package nirmala.shoeshop.pages;

import nirmala.shoeshop.browser.Browser;
//import org.openqa.selenium.By;

public class HomePage {
	
	public static String baseURL = "http://182.72.246.194/prestashop_1.6.1.1/prestashop/";
	public static String homeTitle = "ShoeFactory";
	
	public static void GoTo() {
		Browser.driver.navigate().to(baseURL);
	}
	
	public static boolean IsAtHomePage() {
		 return Browser.driver.getTitle().equals(homeTitle);
	}
	
	public static HeaderPage Header() {
		HeaderPage headerPage = new HeaderPage();
		return headerPage;
	}	
}